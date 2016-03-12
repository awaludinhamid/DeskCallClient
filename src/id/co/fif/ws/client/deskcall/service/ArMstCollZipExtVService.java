/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.ArMstCollZipExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface ArMstCollZipExtVService {

    void save(ArMstCollZipExtV arMstCollZipExtV);
    void delete(ArMstCollZipExtV arMstCollZipExtV);
    void save(List<ArMstCollZipExtV> arMstCollZipExtVs);
    ArMstCollZipExtV getArMstCollZipExtV(Long id);
    List<ArMstCollZipExtV> getArMstCollZipExtVs();
    List<ArMstCollZipExtV> getArMstCollZipExtVs(int start, int num);
    Integer count();
}
