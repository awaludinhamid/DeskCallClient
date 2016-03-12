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
public class StgCollectionTaskPk implements Serializable {

    @Column(name="STG_NO_LKP")
    private String stgNoLkp;

    @Column(name="STG_SEQN")
    private Long stgSeqn;

    /**
     * @return the stgNoLkp
     */
    public String getStgNoLkp() {
        return stgNoLkp;
    }

    /**
     * @param stgNoLkp the stgNoLkp to set
     */
    public void setStgNoLkp(String stgNoLkp) {
        this.stgNoLkp = stgNoLkp;
    }

    /**
     * @return the stgSeqn
     */
    public Long getStgSeqn() {
        return stgSeqn;
    }

    /**
     * @param stgSeqn the stgSeqn to set
     */
    public void setStgSeqn(Long stgSeqn) {
        this.stgSeqn = stgSeqn;
    }

    @Override
    public int hashCode() {
        return (int) stgNoLkp.hashCode() + stgSeqn.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof StgCollectionTaskPk)) return false;
        if(obj == null) return false;
        StgCollectionTaskPk sctp = (StgCollectionTaskPk) obj;
        return sctp.stgNoLkp.equals(stgNoLkp) &&
                sctp.stgSeqn.equals(stgSeqn);
    }
}
