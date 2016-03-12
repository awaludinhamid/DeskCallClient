/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.CmMstLkpParametersExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface CmMstLkpParametersExtVService {

    void save(CmMstLkpParametersExtV cmMstLkpParametersExtV);
    void delete(CmMstLkpParametersExtV cmMstLkpParametersExtV);
    CmMstLkpParametersExtV getCmMstLkpParametersExtV(Long id);
    List<CmMstLkpParametersExtV> getCmMstLkpParametersExtVs();
    List<CmMstLkpParametersExtV> getCmMstLkpParametersExtVs(int start, int num);
    Integer count();
}
