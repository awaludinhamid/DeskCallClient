/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.dao;

import id.co.fif.ws.client.deskcall.bean.StgCollectionTask;
import java.util.List;
import org.springframework.stereotype.Repository;

/**
 * @created Apr 2, 2013
 * @author awal
 */
@Repository("stgCollectionTaskDao")
public class StgCollectionTaskDao extends BaseDao<StgCollectionTask> {

  private static final String STG_TYPE = "LKD";
  private static final String STG_SEND_FLAG = "N";
  
  public List<StgCollectionTask> getAll(String mitraId, String officeCode) {
    return sessionFactory.getCurrentSession().createQuery(
            " from " + domainClass.getName() +
            " where stgType = :stgType" +
            " and stgSendFlag = :stgSendFlag" +
            " and stgCompanyId = :stgCompanyId" +
            " and stgKodeCabangFif = :stgKodeCabangFif")
          .setString("stgType", STG_TYPE)
          .setString("stgSendFlag", STG_SEND_FLAG)
          .setString("stgCompanyId", mitraId)
          .setString("stgKodeCabangFif", officeCode)
          .list();
  }
}
