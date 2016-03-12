/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.StgCollectionTask;
import id.co.fif.ws.client.deskcall.dao.StgCollectionTaskDao;
import id.co.fif.ws.client.deskcall.service.StgCollectionTaskService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 2, 2013
 * @author awal
 */
@Service("stgCollectionTaskService")
@Transactional(readOnly=true)
public class StgCollectionTaskServiceImpl implements StgCollectionTaskService {

    @Autowired
    private StgCollectionTaskDao stgCollectionTaskDao;

    @Transactional(readOnly=false)
    public void save(StgCollectionTask stgCollectionTask) {
        stgCollectionTaskDao.save(stgCollectionTask);
    }

    @Transactional(readOnly=false)
    public void delete(StgCollectionTask stgCollectionTask) {
        stgCollectionTaskDao.delete(stgCollectionTask);
    }

    public StgCollectionTask getStgCollectionTask(Long id) {
        return stgCollectionTaskDao.getById(id);
    }

    public List<StgCollectionTask> getStgCollectionTasks() {
        return stgCollectionTaskDao.getAll();
    }

    public List<StgCollectionTask> getStgCollectionTasks(int start, int num) {
        return stgCollectionTaskDao.getAll(start, num);
    }

    public Integer count() {
        return stgCollectionTaskDao.count();
    }

    public List<StgCollectionTask> getStgCollectionTasks(String mitraId, String officeCode) {
        return stgCollectionTaskDao.getAll(mitraId, officeCode);
    }

    public void save(List<StgCollectionTask> stgCollectionTasks) {
        stgCollectionTaskDao.save(stgCollectionTasks);
    }

}
