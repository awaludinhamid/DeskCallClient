/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.CmMstActionPlanExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface CmMstActionPlanExtVService {

    void save(CmMstActionPlanExtV cmMstActionPlanExtV);
    void delete(CmMstActionPlanExtV cmMstActionPlanExtV);
    CmMstActionPlanExtV getCmMstActionPlanExtV(Long id);
    List<CmMstActionPlanExtV> getCmMstActionPlanExtVs();
    List<CmMstActionPlanExtV> getCmMstActionPlanExtVs(int start, int num);
    Integer count();
}
