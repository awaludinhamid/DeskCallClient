/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.test;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.filter.ClientFilter;
import com.sun.jersey.api.client.filter.HTTPBasicAuthFilter;
import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import id.co.fif.ws.client.deskcall.bean.StgCollectionResult;
import id.co.fif.ws.client.deskcall.service.FsMstOfficesExtVService;
import id.co.fif.ws.client.deskcall.service.StgCollectionResultService;
import id.co.fif.ws.client.deskcall.util.SessionUtil;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Mar 31, 2013
 * @author awal
 */
public class WebServiceTest {

    public static void main(String[] args) {
        ClientFilter cf = new HTTPBasicAuthFilter(args[0],args[1]);
        Client c = Client.create();
        c.addFilter(cf);
        WebResource r = c.resource("http://localhost:8080/DeskCallServices/rest/fsMstOfficesExtV");
        //r.header("Authorization","manager:manager");
        FsMstOfficesExtVService tblBranchService =
                new SessionUtil<FsMstOfficesExtVService>().getAppContext("fsMstOfficesExtVService");
        getTblBranches(r, tblBranchService);
        r = c.resource("http://localhost:8080/DeskCallServices/rest/stgCollectionResult/post");
        //r.header("Authorization","manager:manager");
        StgCollectionResultService tblLkdService =
                new SessionUtil<StgCollectionResultService>().getAppContext("stgCollectionResultService");
        postTblLkds(r, tblLkdService);
    }

    public static void getTblBranches(WebResource r, FsMstOfficesExtVService tblBranchService) {
        GenericType<List<FsMstOfficesExtV>> genericType = new GenericType<List<FsMstOfficesExtV>>() {};
        List<FsMstOfficesExtV> tblBranches = r.accept(MediaType.APPLICATION_JSON).get(genericType);
        FsMstOfficesExtV tblBranch = new FsMstOfficesExtV();
        for(FsMstOfficesExtV tblBranchTmp : tblBranches) {
            tblBranch.setOfficeCode(tblBranchTmp.getOfficeCode());
            tblBranch.setNameShort(tblBranchTmp.getNameShort());
            tblBranchService.save(tblBranch);
        }
        ClientResponse response = r.get(ClientResponse.class);
	System.out.println( "status: " + response.getStatus() );
    }

    public static void postTblLkds(WebResource r, StgCollectionResultService tblLkdService) {

        List<StgCollectionResult> tblLkds = tblLkdService.getStgCollectionResults();
        StgCollectionResult[] tblLkdArr = new StgCollectionResult[tblLkds.size()];
        int idxTblLkd = 0;
        for(StgCollectionResult clientTab : tblLkds)
          tblLkdArr[idxTblLkd++] = clientTab;
        ClientResponse response =
                r.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, tblLkdArr);
        System.out.println("status: " + response.getStatus());
    }
}
