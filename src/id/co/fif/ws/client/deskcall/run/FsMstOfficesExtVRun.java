/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import id.co.fif.ws.client.deskcall.service.FsMstOfficesExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstOfficesExtVRun extends BaseRun<FsMstOfficesExtV,FsMstOfficesExtVService> {

    public FsMstOfficesExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstOfficesExtV>> genericType =
                new GenericType<List<FsMstOfficesExtV>>(){};
        List<FsMstOfficesExtV> fsMstOfficesExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(FsMstOfficesExtV fsMstOfficesExtV : fsMstOfficesExtVs)
            service.save(fsMstOfficesExtV);
        printInfo(fsMstOfficesExtVs.size());
    }

    @Override
    protected FsMstOfficesExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
