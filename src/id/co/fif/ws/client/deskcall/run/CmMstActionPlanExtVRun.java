/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.CmMstActionPlanExtV;
import id.co.fif.ws.client.deskcall.service.CmMstActionPlanExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class CmMstActionPlanExtVRun extends BaseRun<CmMstActionPlanExtV,CmMstActionPlanExtVService> {

    public CmMstActionPlanExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<CmMstActionPlanExtV>> genericType =
                new GenericType<List<CmMstActionPlanExtV>>(){};
        List<CmMstActionPlanExtV> cmMstActionPlanExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(CmMstActionPlanExtV cmMstActionPlanExtV : cmMstActionPlanExtVs)
            service.save(cmMstActionPlanExtV);
        printInfo(cmMstActionPlanExtVs.size());
    }

    @Override
    protected CmMstActionPlanExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
