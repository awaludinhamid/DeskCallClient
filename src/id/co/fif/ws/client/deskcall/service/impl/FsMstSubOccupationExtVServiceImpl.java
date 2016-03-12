/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstSubOccupationExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstSubOccupationExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstSubOccupationExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("fsMstSubOccupationExtVService")
@Transactional(readOnly=true)
public class FsMstSubOccupationExtVServiceImpl implements FsMstSubOccupationExtVService {

    @Autowired
    private FsMstSubOccupationExtVDao fsMstSubOccupationExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstSubOccupationExtV fsMstSubOccupationExtV) {
        fsMstSubOccupationExtVDao.save(fsMstSubOccupationExtV);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstSubOccupationExtV fsMstSubOccupationExtV) {
        fsMstSubOccupationExtVDao.delete(fsMstSubOccupationExtV);
    }

    public FsMstSubOccupationExtV getFsMstSubOccupationExtV(Long id) {
        return fsMstSubOccupationExtVDao.getById(id);
    }

    public List<FsMstSubOccupationExtV> getFsMstSubOccupationExtVs() {
        return fsMstSubOccupationExtVDao.getAll();
    }

    public List<FsMstSubOccupationExtV> getFsMstSubOccupationExtVs(int start, int num) {
        return fsMstSubOccupationExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstSubOccupationExtVDao.count();
    }

}
