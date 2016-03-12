/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstProvinsiExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstProvinsiExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstProvinsiExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("fsMstProvinsiExtVService")
@Transactional(readOnly=true)
public class FsMstProvinsiExtVServiceImpl implements FsMstProvinsiExtVService {

    @Autowired
    private FsMstProvinsiExtVDao fsMstProvinsiExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstProvinsiExtV fsMstProvinsiExtVtblProvince) {
        fsMstProvinsiExtVDao.save(fsMstProvinsiExtVtblProvince);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstProvinsiExtV fsMstProvinsiExtVtblProvince) {
        fsMstProvinsiExtVDao.delete(fsMstProvinsiExtVtblProvince);
    }

    public FsMstProvinsiExtV getFsMstProvinsiExtV(Long id) {
        return fsMstProvinsiExtVDao.getById(id);
    }

    public List<FsMstProvinsiExtV> getFsMstProvinsiExtVs() {
        return fsMstProvinsiExtVDao.getAll();
    }

    public List<FsMstProvinsiExtV> getFsMstProvinsiExtVs(int start, int num) {
        return fsMstProvinsiExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstProvinsiExtVDao.count();
    }
}
