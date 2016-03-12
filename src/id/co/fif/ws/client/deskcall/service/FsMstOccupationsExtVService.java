/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.FsMstOccupationsExtV;
import java.util.List;

/**
 *
 * @author awal
 */
public interface FsMstOccupationsExtVService {

    void save(FsMstOccupationsExtV fsMstOccupationsExtV);
    void delete(FsMstOccupationsExtV fsMstOccupationsExtV);
    FsMstOccupationsExtV getFsMstOccupationsExtV(Long id);
    List<FsMstOccupationsExtV> getFsMstOccupationsExtVs();
    List<FsMstOccupationsExtV> getFsMstOccupationsExtVs(int start, int num);
    Integer count();
}
