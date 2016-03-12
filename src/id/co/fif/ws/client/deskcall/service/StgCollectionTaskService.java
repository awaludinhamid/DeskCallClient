/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.StgCollectionTask;
import java.util.List;

/**
 *
 * @author awal
 */
public interface StgCollectionTaskService {

    void save(StgCollectionTask stgCollectionTask);
    void delete(StgCollectionTask stgCollectionTask);
    void save(List<StgCollectionTask> stgCollectionTasks);
    StgCollectionTask getStgCollectionTask(Long id);
    List<StgCollectionTask> getStgCollectionTasks();
    List<StgCollectionTask> getStgCollectionTasks(int start, int num);
    List<StgCollectionTask> getStgCollectionTasks(String mitraId, String officeCode);
    Integer count();
}
