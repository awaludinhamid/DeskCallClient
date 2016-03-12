/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.CmMstDelqReasonsExtV;
import id.co.fif.ws.client.deskcall.service.CmMstDelqReasonsExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class CmMstDelqReasonsExtVRun extends BaseRun<CmMstDelqReasonsExtV,CmMstDelqReasonsExtVService> {

    public CmMstDelqReasonsExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<CmMstDelqReasonsExtV>> genericType =
                new GenericType<List<CmMstDelqReasonsExtV>>(){};
        List<CmMstDelqReasonsExtV> cmMstDelqReasonsExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(CmMstDelqReasonsExtV cmMstDelqReasonsExtV : cmMstDelqReasonsExtVs)
            service.save(cmMstDelqReasonsExtV);
        printInfo(cmMstDelqReasonsExtVs.size());
    }

    @Override
    protected CmMstDelqReasonsExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
