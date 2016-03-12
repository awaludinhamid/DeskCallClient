/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.CmMstLkpClassificationsExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface CmMstLkpClassificationsExtVService {

    void save(CmMstLkpClassificationsExtV cmMstLkpClassificationsExtV);
    void delete(CmMstLkpClassificationsExtV cmMstLkpClassificationsExtV);
    CmMstLkpClassificationsExtV getCmMstLkpClassificationsExtV(Long id);
    List<CmMstLkpClassificationsExtV> getCmMstLkpClassificationsExtVs();
    List<CmMstLkpClassificationsExtV> getCmMstLkpClassificationsExtVs(int start, int num);
    Integer count();
}
