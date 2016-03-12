/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.dao;

import id.co.fif.ws.client.deskcall.bean.StgCollectionResult;
import id.co.fif.ws.client.deskcall.bean.pk.StgCollectionResultPk;
import java.util.List;
import org.hibernate.Query;
import org.springframework.stereotype.Repository;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@Repository("stgCollectionResultDao")
public class StgCollectionResultDao extends BaseDao<StgCollectionResult> {

    private static final String STG_FLAG_UPDATE = "N";
    
    public List<StgCollectionResult> getAll(String cityCode) {
        return getQuery("","",cityCode)
                .list();
    }
    
    public Integer count(String cityCode) {
        List list = getQuery(
                  "select count(*)","",cityCode)
                .list();
        Long longVal = (Long) list.get(0);
        return longVal.intValue();      
    }

    private Query getQuery(String firstState, String endState, String cityCode) {
        Query query = sessionFactory.getCurrentSession().createQuery(
                        firstState +
                        " from " + domainClass.getName() + " x" +
                        " where stgFlagUpdate = :stgFlagUpdate" +
                        " and stgCity = :stgCity" +
                        endState)
                      .setString("stgFlagUpdate", STG_FLAG_UPDATE)
                      .setString("stgCity", cityCode);
        return query;
    }

    public StgCollectionResult getById(StgCollectionResultPk id) {
        return (StgCollectionResult) sessionFactory.getCurrentSession().get(domainClass, id);
    }
}
