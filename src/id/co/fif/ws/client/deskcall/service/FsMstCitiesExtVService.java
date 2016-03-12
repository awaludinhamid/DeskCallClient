/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.FsMstCitiesExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstCitiesExtVService {

    void save(FsMstCitiesExtV fsMstCitiesExtV);
    void delete(FsMstCitiesExtV fsMstCitiesExtV);
    FsMstCitiesExtV getFsMstCitiesExtV(Long id);
    List<FsMstCitiesExtV> getFsMstCitiesExtVs();
    List<FsMstCitiesExtV> getFsMstCitiesExtVs(int start, int num);
    Integer count();

}
