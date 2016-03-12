/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.CmMstDelqReasonsExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface CmMstDelqReasonsExtVService {

    void save(CmMstDelqReasonsExtV cmMstDelqReasonsExtV);
    void delete(CmMstDelqReasonsExtV cmMstDelqReasonsExtV);
    CmMstDelqReasonsExtV getCmMstDelqReasonsExtV(Long id);
    List<CmMstDelqReasonsExtV> getCmMstDelqReasonsExtVs();
    List<CmMstDelqReasonsExtV> getCmMstDelqReasonsExtVs(int start, int num);
    Integer count();
}
