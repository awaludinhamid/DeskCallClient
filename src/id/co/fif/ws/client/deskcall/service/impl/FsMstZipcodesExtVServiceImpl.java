/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstZipcodesExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstZipcodesExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstZipcodesExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@Service("fsMstZipcodesExtVService")
@Transactional(readOnly=true)
public class FsMstZipcodesExtVServiceImpl implements FsMstZipcodesExtVService {

    @Autowired
    private FsMstZipcodesExtVDao fsMstZipcodesExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstZipcodesExtV fsMstZipcodesExtV) {
        fsMstZipcodesExtVDao.save(fsMstZipcodesExtV);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstZipcodesExtV fsMstZipcodesExtV) {
        fsMstZipcodesExtVDao.delete(fsMstZipcodesExtV);
    }

    public FsMstZipcodesExtV getFsMstZipcodesExtV(Long id) {
        return fsMstZipcodesExtVDao.getById(id);
    }

    public List<FsMstZipcodesExtV> getFsMstZipcodesExtVs() {
        return fsMstZipcodesExtVDao.getAll();
    }

    public List<FsMstZipcodesExtV> getFsMstZipcodesExtVs(int start, int num) {
        return fsMstZipcodesExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstZipcodesExtVDao.count();
    }

    public void save(List<FsMstZipcodesExtV> fsMstZipcodesExtVs) {
        fsMstZipcodesExtVDao.save(fsMstZipcodesExtVs);
    }
}
