/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstOfficesExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstOfficesExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@Service("fsMstOfficesExtVService")
@Transactional(readOnly=true)
public class FsMstOfficesExtVServiceImpl implements FsMstOfficesExtVService {

    @Autowired
    private FsMstOfficesExtVDao fsMstOfficesExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstOfficesExtV fsMstOfficesExtVtblBranch) {
        fsMstOfficesExtVDao.save(fsMstOfficesExtVtblBranch);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstOfficesExtV fsMstOfficesExtV) {
        fsMstOfficesExtVDao.delete(fsMstOfficesExtV);
    }

    public FsMstOfficesExtV getFsMstOfficesExtV(Long id) {
        return fsMstOfficesExtVDao.getById(id);
    }

    public List<FsMstOfficesExtV> getFsMstOfficesExtVs() {
        return fsMstOfficesExtVDao.getAll();
    }

    public List<FsMstOfficesExtV> getFsMstOfficesExtVs(int start, int num) {
        return fsMstOfficesExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstOfficesExtVDao.count();
    }
}
