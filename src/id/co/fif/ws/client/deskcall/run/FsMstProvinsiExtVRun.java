/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstProvinsiExtV;
import id.co.fif.ws.client.deskcall.service.FsMstProvinsiExtVService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class FsMstProvinsiExtVRun extends BaseRun<FsMstProvinsiExtV,FsMstProvinsiExtVService> {

    public FsMstProvinsiExtVRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<FsMstProvinsiExtV>> genericType =
                new GenericType<List<FsMstProvinsiExtV>>(){};
        List<FsMstProvinsiExtV> fsMstProvinsiExtVs =
                resource.accept(MediaType.APPLICATION_JSON).get(genericType);
        for(FsMstProvinsiExtV fsMstProvinsiExtV : fsMstProvinsiExtVs)
            service.save(fsMstProvinsiExtV);
        printInfo(fsMstProvinsiExtVs.size());
    }

    @Override
    protected FsMstProvinsiExtV[] getArray() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
