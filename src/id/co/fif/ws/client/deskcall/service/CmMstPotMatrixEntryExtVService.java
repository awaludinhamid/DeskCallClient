/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.CmMstPotMatrixEntryExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface CmMstPotMatrixEntryExtVService {

    void save(CmMstPotMatrixEntryExtV cmMstPotMatrixEntryExtV);
    void delete(CmMstPotMatrixEntryExtV cmMstPotMatrixEntryExtV);
    CmMstPotMatrixEntryExtV getCmMstPotMatrixEntryExtV(Long id);
    List<CmMstPotMatrixEntryExtV> getCmMstPotMatrixEntryExtVs();
    List<CmMstPotMatrixEntryExtV> getCmMstPotMatrixEntryExtVs(int start, int num);
    Integer count();
}
