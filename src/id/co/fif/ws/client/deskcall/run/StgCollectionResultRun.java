/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.StgCollectionResult;
import id.co.fif.ws.client.deskcall.security.ResponseStatus;
import id.co.fif.ws.client.deskcall.service.StgCollectionResultService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class StgCollectionResultRun extends BaseRun<StgCollectionResult,StgCollectionResultService> {

    private List<StgCollectionResult> stgCollectionResults;
    private static final String STG_FLAG_UPDATE = "Y";

    public StgCollectionResultRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<StgCollectionResult>> genericType =
                new GenericType<List<StgCollectionResult>>(){};
        stgCollectionResults =
                resource.queryParams(getParams()).accept(MediaType.APPLICATION_JSON).get(genericType);
        service.save(stgCollectionResults);
    }

    @Override
    protected StgCollectionResult[] getArray() {
        stgCollectionResults = service.getStgCollectionResults(cityCode);
        return stgCollectionResults.toArray(new StgCollectionResult[stgCollectionResults.size()]);
    }
    
    @Override
    public Integer getCount() {
      return service.count(cityCode);
    }

    @Override
    public void run() {
      Integer count = getCount();
      printInfo(cityCode,count);
      if(count > 0) {
        if(ResponseStatus.isSuccess(runPost()))
          saveList();
      }
    }
    
    private void saveList() {
      if(stgCollectionResults != null) {
        StgCollectionResult[] stgCollectionResultArr = new StgCollectionResult[stgCollectionResults.size()];
        int idxArr = 0;
        for(StgCollectionResult stgCollectionResult : stgCollectionResults) {
          stgCollectionResult.setStgFlagUpdate(STG_FLAG_UPDATE);
          stgCollectionResultArr[idxArr++] = stgCollectionResult;
        }
        service.update(stgCollectionResultArr);
      }
    }
}
