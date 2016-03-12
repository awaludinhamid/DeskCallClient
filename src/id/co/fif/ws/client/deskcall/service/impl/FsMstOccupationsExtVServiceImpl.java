/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service.impl;

import id.co.fif.ws.client.deskcall.bean.FsMstOccupationsExtV;
import id.co.fif.ws.client.deskcall.dao.FsMstOccupationsExtVDao;
import id.co.fif.ws.client.deskcall.service.FsMstOccupationsExtVService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@Service("fsMstOccupationsExtVService")
@Transactional(readOnly=true)
public class FsMstOccupationsExtVServiceImpl implements FsMstOccupationsExtVService {
    @Autowired
    private FsMstOccupationsExtVDao fsMstOccupationsExtVDao;

    @Transactional(readOnly=false)
    public void save(FsMstOccupationsExtV fsMstOccupationsExtV) {
        fsMstOccupationsExtVDao.save(fsMstOccupationsExtV);
    }

    @Transactional(readOnly=false)
    public void delete(FsMstOccupationsExtV fsMstOccupationsExtV) {
        fsMstOccupationsExtVDao.delete(fsMstOccupationsExtV);
    }

    public FsMstOccupationsExtV getFsMstOccupationsExtV(Long id) {
        return fsMstOccupationsExtVDao.getById(id);
    }

    public List<FsMstOccupationsExtV> getFsMstOccupationsExtVs() {
        return fsMstOccupationsExtVDao.getAll();
    }

    public List<FsMstOccupationsExtV> getFsMstOccupationsExtVs(int start, int num) {
        return fsMstOccupationsExtVDao.getAll(start, num);
    }

    public Integer count() {
        return fsMstOccupationsExtVDao.count();
    }
}
