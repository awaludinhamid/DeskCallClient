/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.ArMstCollZipExtV;
import id.co.fif.ws.client.deskcall.dao.ArMstCollZipExtVDao;
import id.co.fif.ws.client.deskcall.service.ArMstCollZipExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@Service("arMstCollZipExtVService")
@Transactional(readOnly=true)
public class ArMstCollZipExtVServiceImpl implements ArMstCollZipExtVService {

    @Autowired
    private ArMstCollZipExtVDao arMstCollZipExtVDao;

    @Transactional(readOnly=false)
    public void save(ArMstCollZipExtV arMstCollZipExtV) {
        arMstCollZipExtVDao.save(arMstCollZipExtV);
    }

    @Transactional(readOnly=false)
    public void delete(ArMstCollZipExtV arMstCollZipExtV) {
        arMstCollZipExtVDao.delete(arMstCollZipExtV);
    }

    public ArMstCollZipExtV getArMstCollZipExtV(Long id) {
        return arMstCollZipExtVDao.getById(id);
    }

    public List<ArMstCollZipExtV> getArMstCollZipExtVs() {
        return arMstCollZipExtVDao.getAll();
    }

    public List<ArMstCollZipExtV> getArMstCollZipExtVs(int start, int num) {
        return arMstCollZipExtVDao.getAll(start, num);
    }

    public Integer count() {
        return arMstCollZipExtVDao.count();
    }

    public void save(List<ArMstCollZipExtV> arMstCollZipExtVs) {
        arMstCollZipExtVDao.save(arMstCollZipExtVs);
    }
}
