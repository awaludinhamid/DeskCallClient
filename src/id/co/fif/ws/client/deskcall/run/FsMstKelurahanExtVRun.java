/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstKelurahanExtV;
import id.co.fif.ws.client.deskcall.service.FsMstKelurahanExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstKelurahanExtVRun extends BaseRun<FsMstKelurahanExtV,FsMstKelurahanExtVService> {

    public FsMstKelurahanExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstKelurahanExtV>> genericType =
                new GenericType<List<FsMstKelurahanExtV>>(){};
        List<FsMstKelurahanExtV> fsMstKelurahanExtVs =
                resource.queryParams(getParams()).accept(MediaType.APPLICATION_JSON).get(genericType);
        service.save(fsMstKelurahanExtVs);
        printInfo(firstResult+maxResults);
    }

    @Override
    protected FsMstKelurahanExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
