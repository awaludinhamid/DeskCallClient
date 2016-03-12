/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.CmMstPotMatrixEntryExtV;
import id.co.fif.ws.client.deskcall.service.CmMstPotMatrixEntryExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class CmMstPotMatrixEntryExtVRun extends
        BaseRun<CmMstPotMatrixEntryExtV,CmMstPotMatrixEntryExtVService> {

    public CmMstPotMatrixEntryExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<CmMstPotMatrixEntryExtV>> genericType =
                new GenericType<List<CmMstPotMatrixEntryExtV>>(){};
        List<CmMstPotMatrixEntryExtV> cmMstPotMatrixEntryExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(CmMstPotMatrixEntryExtV cmMstPotMatrixEntryExtV : cmMstPotMatrixEntryExtVs)
            service.save(cmMstPotMatrixEntryExtV);
        printInfo(cmMstPotMatrixEntryExtVs.size());
    }

    @Override
    protected CmMstPotMatrixEntryExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
