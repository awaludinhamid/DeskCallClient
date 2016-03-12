/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstKelurahanExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstKelurahanExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstKelurahanExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("fsMstKelurahanExtVService")
@Transactional(readOnly=true)
public class FsMstKelurahanExtVServiceImpl implements FsMstKelurahanExtVService {

    @Autowired
    private FsMstKelurahanExtVDao fsMstKelurahanExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstKelurahanExtV fsMstKelurahanExtV) {
        fsMstKelurahanExtVDao.save(fsMstKelurahanExtV);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstKelurahanExtV fsMstKelurahanExtVtblKelurahan) {
        fsMstKelurahanExtVDao.delete(fsMstKelurahanExtVtblKelurahan);
    }

    public FsMstKelurahanExtV getFsMstKelurahanExtV(Long id) {
        return fsMstKelurahanExtVDao.getById(id);
    }

    public List<FsMstKelurahanExtV> getFsMstKelurahanExtVs() {
        return fsMstKelurahanExtVDao.getAll();
    }

    public List<FsMstKelurahanExtV> getFsMstKelurahanExtVs(int start, int num) {
        return fsMstKelurahanExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstKelurahanExtVDao.count();
    }

    public void save(List<FsMstKelurahanExtV> fsMstKelurahanExtVs) {
        fsMstKelurahanExtVDao.save(fsMstKelurahanExtVs);
    }
}
