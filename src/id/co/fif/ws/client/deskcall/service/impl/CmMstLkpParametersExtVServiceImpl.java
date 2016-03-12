/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.CmMstLkpParametersExtV;
import id.co.fif.ws.client.deskcall.dao.CmMstLkpParametersExtVDao;
import id.co.fif.ws.client.deskcall.service.CmMstLkpParametersExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("cmMstLkpParametersExtVService")
@Transactional(readOnly=true)
public class CmMstLkpParametersExtVServiceImpl implements CmMstLkpParametersExtVService {

    @Autowired
    private CmMstLkpParametersExtVDao cmMstLkpParametersExtVDao;

    @Transactional(readOnly=false)
    public void save(CmMstLkpParametersExtV cmMstLkpParametersExtV) {
        cmMstLkpParametersExtVDao.save(cmMstLkpParametersExtV);
    }

    @Transactional(readOnly=false)
    public void delete(CmMstLkpParametersExtV cmMstLkpParametersExtV) {
        cmMstLkpParametersExtVDao.delete(cmMstLkpParametersExtV);
    }

    public CmMstLkpParametersExtV getCmMstLkpParametersExtV(Long id) {
        return cmMstLkpParametersExtVDao.getById(id);
    }

    public List<CmMstLkpParametersExtV> getCmMstLkpParametersExtVs() {
        return cmMstLkpParametersExtVDao.getAll();
    }

    public List<CmMstLkpParametersExtV> getCmMstLkpParametersExtVs(int start, int num) {
        return cmMstLkpParametersExtVDao.getAll(start, num);
    }

    public Integer count() {
        return cmMstLkpParametersExtVDao.count();
    }
}
