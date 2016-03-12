/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.CmMstLkpClassificationsExtV;
import id.co.fif.ws.client.deskcall.service.CmMstLkpClassificationsExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class CmMstLkpClassificationsExtVRun extends
        BaseRun<CmMstLkpClassificationsExtV,CmMstLkpClassificationsExtVService> {

    public CmMstLkpClassificationsExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<CmMstLkpClassificationsExtV>> genericType =
                new GenericType<List<CmMstLkpClassificationsExtV>>(){};
        List<CmMstLkpClassificationsExtV> cmMstLkpClassificationsExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(CmMstLkpClassificationsExtV cmMstLkpClassificationsExtV : cmMstLkpClassificationsExtVs)
            service.save(cmMstLkpClassificationsExtV);
        printInfo(cmMstLkpClassificationsExtVs.size());
    }

    @Override
    protected CmMstLkpClassificationsExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
