/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.StgCollectionTask;
import id.co.fif.ws.client.deskcall.security.ResponseStatus;
import id.co.fif.ws.client.deskcall.service.StgCollectionTaskService;
import java.util.List;
import javax.ws.rs.core.MediaType;

/**
 * @created Apr 28, 2013
 * @author awal
 */
public class StgCollectionTaskRun extends BaseRun<StgCollectionTask,StgCollectionTaskService> {

    private List<StgCollectionTask> stgCollectionTasks;
    private static final String SEND_FLAG = "Y";

    public StgCollectionTaskRun(Client client, OAuthClientFilter clientFilter, String uri) {
        super(client, clientFilter, uri);
    }

    @Override
    protected void saveList(WebResource resource) {
        GenericType<List<StgCollectionTask>> genericType =
                new GenericType<List<StgCollectionTask>>(){};
        stgCollectionTasks =
                resource.queryParams(getParams()).accept(MediaType.APPLICATION_JSON).get(genericType);
        service.save(stgCollectionTasks);
    }

    @Override
    protected StgCollectionTask[] getArray() {
        if(stgCollectionTasks == null) {
          stgCollectionTasks = service.getStgCollectionTasks(mitraId, officeCode);
        }
        StgCollectionTask[] stgCollectionTaskArr = new StgCollectionTask[stgCollectionTasks.size()];
        int sctIdx = 0;
        for(StgCollectionTask stgCollectionTask : stgCollectionTasks) {
          stgCollectionTask.setStgSendFlag(SEND_FLAG);
          stgCollectionTaskArr[sctIdx++] = stgCollectionTask;
        }
        return stgCollectionTaskArr;
    }

    @Override
    public void run() {
      Integer count = getCount();
      printInfo(officeCode,count);
      if(count > 0) {
        if(ResponseStatus.isSuccess(runGet()))
          runPost();
      }
    }

}
