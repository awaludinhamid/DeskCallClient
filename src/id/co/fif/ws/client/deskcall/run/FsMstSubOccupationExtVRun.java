/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstSubOccupationExtV;
import id.co.fif.ws.client.deskcall.service.FsMstSubOccupationExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstSubOccupationExtVRun extends
        BaseRun<FsMstSubOccupationExtV,FsMstSubOccupationExtVService> {

    public FsMstSubOccupationExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstSubOccupationExtV>> genericType =
                new GenericType<List<FsMstSubOccupationExtV>>(){};
        List<FsMstSubOccupationExtV> fsMstSubOccupationExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(FsMstSubOccupationExtV fsMstSubOccupationExtV : fsMstSubOccupationExtVs)
            service.save(fsMstSubOccupationExtV);
        printInfo(fsMstSubOccupationExtVs.size());
    }

    @Override
    protected FsMstSubOccupationExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
