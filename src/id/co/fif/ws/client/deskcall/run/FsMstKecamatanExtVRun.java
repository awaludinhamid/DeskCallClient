/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstKecamatanExtV;
import id.co.fif.ws.client.deskcall.service.FsMstKecamatanExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstKecamatanExtVRun extends BaseRun<FsMstKecamatanExtV,FsMstKecamatanExtVService> {

    public FsMstKecamatanExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstKecamatanExtV>> genericType =
                new GenericType<List<FsMstKecamatanExtV>>(){};
        List<FsMstKecamatanExtV> fsMstKecamatanExtVs =
                resource.queryParams(getParams()).accept(MediaType.APPLICATION_JSON).get(genericType);
        service.save(fsMstKecamatanExtVs);
        printInfo(firstResult+maxResults);
    }

    @Override
    protected FsMstKecamatanExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
