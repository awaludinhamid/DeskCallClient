/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstOfficesExtVService {

    void save(FsMstOfficesExtV fsMstOfficesExtV);
    void delete(FsMstOfficesExtV fsMstOfficesExtV);
    FsMstOfficesExtV getFsMstOfficesExtV(Long id);
    List<FsMstOfficesExtV> getFsMstOfficesExtVs();
    List<FsMstOfficesExtV> getFsMstOfficesExtVs(int start, int num);
    Integer count();
}
