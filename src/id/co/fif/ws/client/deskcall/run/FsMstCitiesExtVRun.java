/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstCitiesExtV;
import id.co.fif.ws.client.deskcall.service.FsMstCitiesExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstCitiesExtVRun extends BaseRun<FsMstCitiesExtV,FsMstCitiesExtVService> {

    public FsMstCitiesExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstCitiesExtV>> genericType =
                new GenericType<List<FsMstCitiesExtV>>(){};
        List<FsMstCitiesExtV> fsMstCitiesExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(FsMstCitiesExtV fsMstCitiesExtV : fsMstCitiesExtVs)
            service.save(fsMstCitiesExtV);
        printInfo(fsMstCitiesExtVs.size());
    }

    @Override
    protected FsMstCitiesExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
