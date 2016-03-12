/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstKecamatanExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstKecamatanExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstKecamatanExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("fsMstKecamatanExtVService")
@Transactional(readOnly=true)
public class FsMstKecamatanExtVServiceImpl implements FsMstKecamatanExtVService {

    @Autowired
    private FsMstKecamatanExtVDao fsMstKecamatanExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstKecamatanExtV fsMstKecamatanExtVtblKecamatan) {
        fsMstKecamatanExtVDao.save(fsMstKecamatanExtVtblKecamatan);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstKecamatanExtV fsMstKecamatanExtVtblKecamatan) {
        fsMstKecamatanExtVDao.delete(fsMstKecamatanExtVtblKecamatan);
    }

    public FsMstKecamatanExtV getFsMstKecamatanExtV(Long id) {
        return fsMstKecamatanExtVDao.getById(id);
    }

    public List<FsMstKecamatanExtV> getFsMstKecamatanExtVs() {
        return fsMstKecamatanExtVDao.getAll();
    }

    public List<FsMstKecamatanExtV> getFsMstKecamatanExtVs(int start, int num) {
        return fsMstKecamatanExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstKecamatanExtVDao.count();
    }

    public void save(List<FsMstKecamatanExtV> fsMstKecamatanExtVs) {
        fsMstKecamatanExtVDao.save(fsMstKecamatanExtVs);
    }
}
