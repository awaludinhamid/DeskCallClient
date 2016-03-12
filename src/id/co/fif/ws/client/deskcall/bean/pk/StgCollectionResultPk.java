/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean.pk;

import java.io.Serializable;
import javax.persistence.Column;

/**
 * @created Jul 27, 2013
 * @author awal
 */
public class StgCollectionResultPk implements Serializable {

    @Column(name="STG_LKP_NO")
    private String stgLkpNo;

    @Column(name="STG_LKP_SEQNO")
    private Long stgLkpSeqno;

    /**
     * @return the stgLkpNo
     */
    public String getStgLkpNo() {
        return stgLkpNo;
    }

    /**
     * @param stgLkpNo the stgLkpNo to set
     */
    public void setStgLkpNo(String stgLkpNo) {
        this.stgLkpNo = stgLkpNo;
    }

    /**
     * @return the stgLkpSeqno
     */
    public Long getStgLkpSeqno() {
        return stgLkpSeqno;
    }

    /**
     * @param stgLkpSeqno the stgLkpSeqno to set
     */
    public void setStgLkpSeqno(Long stgLkpSeqno) {
        this.stgLkpSeqno = stgLkpSeqno;
    }

    @Override
    public int hashCode() {
        return (int) stgLkpNo.hashCode() + stgLkpSeqno.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof StgCollectionResultPk)) return false;
        if(obj == null) return false;
        StgCollectionResultPk scrp = (StgCollectionResultPk) obj;
        return scrp.stgLkpNo.equals(stgLkpNo) &&
                scrp.stgLkpSeqno == stgLkpSeqno;
    }
}
