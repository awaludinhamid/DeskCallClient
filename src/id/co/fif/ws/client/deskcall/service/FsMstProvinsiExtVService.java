/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.FsMstProvinsiExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstProvinsiExtVService {

    void save(FsMstProvinsiExtV fsMstProvinsiExtV);
    void delete(FsMstProvinsiExtV fsMstProvinsiExtV);
    FsMstProvinsiExtV getFsMstProvinsiExtV(Long id);
    List<FsMstProvinsiExtV> getFsMstProvinsiExtVs();
    List<FsMstProvinsiExtV> getFsMstProvinsiExtVs(int start, int num);
    Integer count();
}
