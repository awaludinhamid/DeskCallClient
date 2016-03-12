/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstZipcodesExtV;
import id.co.fif.ws.client.deskcall.service.FsMstZipcodesExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstZipcodesExtVRun extends BaseRun<FsMstZipcodesExtV,FsMstZipcodesExtVService> {

    public FsMstZipcodesExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstZipcodesExtV>> genericType =
                new GenericType<List<FsMstZipcodesExtV>>(){};
        List<FsMstZipcodesExtV> fsMstZipcodesExtVs =
                resource.queryParams(getParams()).accept(MediaType.APPLICATION_JSON).get(genericType);
        service.save(fsMstZipcodesExtVs);
        printInfo(firstResult+maxResults);
    }

    @Override
    protected FsMstZipcodesExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
