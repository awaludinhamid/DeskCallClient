/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.service;

import id.co.fif.ws.client.deskcall.bean.StgCollectionResult;
import id.co.fif.ws.client.deskcall.bean.pk.StgCollectionResultPk;
import java.util.List;

/**
 *
 * @author awal
 */
public interface StgCollectionResultService {

    void save(StgCollectionResult stgCollectionResult);
    void delete(StgCollectionResult stgCollectionResult);
    void save(List<StgCollectionResult> stgCollectionResults);
    void update(StgCollectionResult[] stgCollectionResults);
    StgCollectionResult getStgCollectionResult(Long id);
    StgCollectionResult getStgCollectionResult(StgCollectionResultPk id);
    List<StgCollectionResult> getStgCollectionResults();
    List<StgCollectionResult> getStgCollectionResults(int start, int num);
    List<StgCollectionResult> getStgCollectionResults(String cityCode);
    Integer count();
    Integer count(String cityCode);
}
