/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.security;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import com.sun.jersey.oauth.signature.OAuthParameters;
import com.sun.jersey.oauth.signature.OAuthSecrets;
import id.co.fif.ws.client.deskcall.bean.support.KeyBean;
import java.io.IOException;
import java.util.Properties;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 13, 2013
 * @author awal
 */
public class ClientAuthentication {

    private Client client;
    private String uri;
    //private KeyBean keyBean;
    private OAuthClientFilter clientFilter;

    public ClientAuthentication(Client client, String uri,
            String deskcallId, String userName, String userPassword) {
        this.client = client;
        this.uri = uri;
        initClientFilter(deskcallId, userName, userPassword);
    }

    private void initClientFilter(String deskcallId, String userName, String userPassword) {
        // get properties
        Properties prop = new Properties();
        try {
            prop.load(ClientAuthentication.class.getClassLoader()
                    .getResourceAsStream("authentication.properties"));
        } catch(IOException ioe) {
            System.out.println("Failed to load properties file");
        }
        String signatureMethod = prop.getProperty("auth.signatureMethod");
        String serverAuth = prop.getProperty("auth.serverAuth");
        // request token
        OAuthParameters params = new OAuthParameters().signatureMethod(signatureMethod);
        params.put("deskcallId", deskcallId);
        params.put("userName", userName);
        params.put("userPassword", userPassword);
        WebResource resource = client.resource(uri + "/" + serverAuth + "/requestToken");
        resource.addFilter(new OAuthClientFilter(client.getProviders(), params, new OAuthSecrets()));
        GenericType<KeyBean> generic = new GenericType<KeyBean>() {};
        KeyBean keyBean = resource.accept(MediaType.APPLICATION_JSON).get(generic);
        // set authentication
        params = new OAuthParameters()
                .signatureMethod(signatureMethod)
                .consumerKey(keyBean.getConsumerKey())
                .token(keyBean.getTokenKey())
                .version();
        params.put("sessionId", keyBean.getSessionId());
        OAuthSecrets secrets = new OAuthSecrets()
                .consumerSecret(keyBean.getConsumerSecret())
                .tokenSecret(keyBean.getTokenSecret());
        clientFilter = new OAuthClientFilter(client.getProviders(), params, secrets);
    }

    /**
     * @return the clientFilter
     */
    public OAuthClientFilter getClientFilter() {
        return clientFilter;
    }
}
