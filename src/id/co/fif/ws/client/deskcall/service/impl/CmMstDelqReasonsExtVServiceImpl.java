/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.CmMstDelqReasonsExtV;
import id.co.fif.ws.client.deskcall.dao.CmMstDelqReasonsExtVDao;
import id.co.fif.ws.client.deskcall.service.CmMstDelqReasonsExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("cmMstDelqReasonsExtVService")
@Transactional(readOnly=true)
public class CmMstDelqReasonsExtVServiceImpl implements CmMstDelqReasonsExtVService {

    @Autowired
    private CmMstDelqReasonsExtVDao cmMstDelqReasonsExtVDao;

    @Transactional(readOnly=false)
    public void save(CmMstDelqReasonsExtV cmMstDelqReasonsExtV) {
        cmMstDelqReasonsExtVDao.save(cmMstDelqReasonsExtV);
    }

    @Transactional(readOnly=false)
    public void delete(CmMstDelqReasonsExtV cmMstDelqReasonsExtV) {
        cmMstDelqReasonsExtVDao.delete(cmMstDelqReasonsExtV);
    }

    public CmMstDelqReasonsExtV getCmMstDelqReasonsExtV(Long id) {
        return cmMstDelqReasonsExtVDao.getById(id);
    }

    public List<CmMstDelqReasonsExtV> getCmMstDelqReasonsExtVs() {
        return cmMstDelqReasonsExtVDao.getAll();
    }

    public List<CmMstDelqReasonsExtV> getCmMstDelqReasonsExtVs(int start, int num) {
        return cmMstDelqReasonsExtVDao.getAll(start, num);
    }

    public Integer count() {
        return cmMstDelqReasonsExtVDao.count();
    }

}
