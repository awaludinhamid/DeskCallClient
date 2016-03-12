/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.CmMstPotMatrixEntryExtV;
import id.co.fif.ws.client.deskcall.dao.CmMstPotMatrixEntryExtVDao;
import id.co.fif.ws.client.deskcall.service.CmMstPotMatrixEntryExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 26, 2013
 * @author awal
 */
@Service("cmMstPotMatrixEntryExtVService")
@Transactional(readOnly=true)
public class CmMstPotMatrixEntryExtVServiceImpl implements CmMstPotMatrixEntryExtVService {

    @Autowired
    private CmMstPotMatrixEntryExtVDao cmMstPotMatrixEntryExtVDao;

    @Transactional(readOnly=false)
    public void save(CmMstPotMatrixEntryExtV cmMstPotMatrixEntryExtV) {
        cmMstPotMatrixEntryExtVDao.save(cmMstPotMatrixEntryExtV);
    }

    @Transactional(readOnly=false)
    public void delete(CmMstPotMatrixEntryExtV cmMstPotMatrixEntryExtV) {
        cmMstPotMatrixEntryExtVDao.delete(cmMstPotMatrixEntryExtV);
    }

    public CmMstPotMatrixEntryExtV getCmMstPotMatrixEntryExtV(Long id) {
        return cmMstPotMatrixEntryExtVDao.getById(id);
    }

    public List<CmMstPotMatrixEntryExtV> getCmMstPotMatrixEntryExtVs() {
        return cmMstPotMatrixEntryExtVDao.getAll();
    }

    public List<CmMstPotMatrixEntryExtV> getCmMstPotMatrixEntryExtVs(int start, int num) {
        return cmMstPotMatrixEntryExtVDao.getAll(start, num);
    }

    public Integer count() {
        return cmMstPotMatrixEntryExtVDao.count();
    }
}
