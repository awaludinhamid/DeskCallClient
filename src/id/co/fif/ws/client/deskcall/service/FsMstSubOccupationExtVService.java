/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.FsMstSubOccupationExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstSubOccupationExtVService {

    void save(FsMstSubOccupationExtV fsMstSubOccupationExtV);
    void delete(FsMstSubOccupationExtV fsMstSubOccupationExtV);
    FsMstSubOccupationExtV getFsMstSubOccupationExtV(Long id);
    List<FsMstSubOccupationExtV> getFsMstSubOccupationExtVs();
    List<FsMstSubOccupationExtV> getFsMstSubOccupationExtVs(int start, int num);
    Integer count();
}
