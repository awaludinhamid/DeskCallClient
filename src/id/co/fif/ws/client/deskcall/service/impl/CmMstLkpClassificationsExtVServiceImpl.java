/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.CmMstLkpClassificationsExtV;
import id.co.fif.ws.client.deskcall.dao.CmMstLkpClassificationsExtVDao;
import id.co.fif.ws.client.deskcall.service.CmMstLkpClassificationsExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("cmMstLkpClassificationsExtVService")
@Transactional(readOnly=true)
public class CmMstLkpClassificationsExtVServiceImpl implements CmMstLkpClassificationsExtVService {

    @Autowired
    private CmMstLkpClassificationsExtVDao cmMstLkpClassificationsExtVDao;

    @Transactional(readOnly=false)
    public void save(CmMstLkpClassificationsExtV cmMstLkpClassificationsExtV) {
        cmMstLkpClassificationsExtVDao.save(cmMstLkpClassificationsExtV);
    }

    @Transactional(readOnly=false)
    public void delete(CmMstLkpClassificationsExtV cmMstLkpClassificationsExtV) {
        cmMstLkpClassificationsExtVDao.delete(cmMstLkpClassificationsExtV);
    }

    public CmMstLkpClassificationsExtV getCmMstLkpClassificationsExtV(Long id) {
        return cmMstLkpClassificationsExtVDao.getById(id);
    }

    public List<CmMstLkpClassificationsExtV> getCmMstLkpClassificationsExtVs() {
        return cmMstLkpClassificationsExtVDao.getAll();
    }

    public List<CmMstLkpClassificationsExtV> getCmMstLkpClassificationsExtVs(int start, int num) {
        return cmMstLkpClassificationsExtVDao.getAll(start, num);
    }

    public Integer count() {
        return cmMstLkpClassificationsExtVDao.count();
    }
}
