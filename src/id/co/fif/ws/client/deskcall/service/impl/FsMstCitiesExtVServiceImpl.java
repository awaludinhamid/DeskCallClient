/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstCitiesExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstCitiesExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstCitiesExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("fsMstCitiesExtVService")
@Transactional(readOnly=true)
public class FsMstCitiesExtVServiceImpl implements FsMstCitiesExtVService {

    @Autowired
    private FsMstCitiesExtVDao fsMstCitiesExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstCitiesExtV fsMstCitiesExtV) {
        fsMstCitiesExtVDao.save(fsMstCitiesExtV);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstCitiesExtV fsMstCitiesExtV) {
        fsMstCitiesExtVDao.delete(fsMstCitiesExtV);
    }

    public FsMstCitiesExtV getFsMstCitiesExtV(Long id) {
        return fsMstCitiesExtVDao.getById(id);
    }

    public List<FsMstCitiesExtV> getFsMstCitiesExtVs() {
        return fsMstCitiesExtVDao.getAll();
    }

    public List<FsMstCitiesExtV> getFsMstCitiesExtVs(int start, int num) {
        return fsMstCitiesExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstCitiesExtVDao.count();
    }
}
