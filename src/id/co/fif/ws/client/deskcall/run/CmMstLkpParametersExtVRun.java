/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.CmMstLkpParametersExtV;
import id.co.fif.ws.client.deskcall.service.CmMstLkpParametersExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class CmMstLkpParametersExtVRun extends
        BaseRun<CmMstLkpParametersExtV,CmMstLkpParametersExtVService> {

    public CmMstLkpParametersExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<CmMstLkpParametersExtV>> genericType =
                new GenericType<List<CmMstLkpParametersExtV>>(){};
        List<CmMstLkpParametersExtV> cmMstLkpParametersExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(CmMstLkpParametersExtV cmMstLkpParametersExtV : cmMstLkpParametersExtVs)
            service.save(cmMstLkpParametersExtV);
        printInfo(cmMstLkpParametersExtVs.size());
    }

    @Override
    protected CmMstLkpParametersExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
