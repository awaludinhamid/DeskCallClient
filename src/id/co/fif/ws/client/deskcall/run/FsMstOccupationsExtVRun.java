/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstOccupationsExtV;
import id.co.fif.ws.client.deskcall.service.FsMstOccupationsExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstOccupationsExtVRun extends BaseRun<FsMstOccupationsExtV,FsMstOccupationsExtVService> {

    public FsMstOccupationsExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstOccupationsExtV>> genericType =
                new GenericType<List<FsMstOccupationsExtV>>(){};
        List<FsMstOccupationsExtV> fsMstOccupationsExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(FsMstOccupationsExtV fsMstOccupationsExtV : fsMstOccupationsExtVs)
            service.save(fsMstOccupationsExtV);
        printInfo(fsMstOccupationsExtVs.size());
    }

    @Override
    protected FsMstOccupationsExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
