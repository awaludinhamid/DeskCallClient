/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.CmMstActionPlanExtV;
import id.co.fif.ws.client.deskcall.dao.CmMstActionPlanExtVDao;
import id.co.fif.ws.client.deskcall.service.CmMstActionPlanExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@Service("cmMstActionPlanExtVService")
@Transactional(readOnly=true)
public class CmMstActionPlanExtVServiceImpl implements CmMstActionPlanExtVService {

    @Autowired
    private CmMstActionPlanExtVDao cmMstActionPlanExtVDao;

    @Transactional(readOnly=false)
    public void save(CmMstActionPlanExtV cmMstActionPlanExtV) {
        cmMstActionPlanExtVDao.save(cmMstActionPlanExtV);
    }

    @Transactional(readOnly=false)
    public void delete(CmMstActionPlanExtV cmMstActionPlanExtV) {
        cmMstActionPlanExtVDao.delete(cmMstActionPlanExtV);
    }

    public CmMstActionPlanExtV getCmMstActionPlanExtV(Long id) {
        return cmMstActionPlanExtVDao.getById(id);
    }

    public List<CmMstActionPlanExtV> getCmMstActionPlanExtVs() {
        return cmMstActionPlanExtVDao.getAll();
    }

    public List<CmMstActionPlanExtV> getCmMstActionPlanExtVs(int start, int num) {
        return cmMstActionPlanExtVDao.getAll(start, num);
    }

    public Integer count() {
        return cmMstActionPlanExtVDao.count();
    }
}
