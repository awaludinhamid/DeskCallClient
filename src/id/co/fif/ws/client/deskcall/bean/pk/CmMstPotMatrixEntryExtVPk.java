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
public class CmMstPotMatrixEntryExtVPk implements Serializable {

    @Column(name="DELQ_ID")
    private String delqId;

    @Column(name="CLASS_CODE")
    private String classCode;

    @Column(name="SEQ_NO")
    private Long seqNo;

    /**
     * @return the delqId
     */
    public String getDelqId() {
        return delqId;
    }

    /**
     * @param delqId the delqId to set
     */
    public void setDelqId(String delqId) {
        this.delqId = delqId;
    }

    /**
     * @return the classCode
     */
    public String getClassCode() {
        return classCode;
    }

    /**
     * @param classCode the classCode to set
     */
    public void setClassCode(String classCode) {
        this.classCode = classCode;
    }

    /**
     * @return the seqNo
     */
    public Long getSeqNo() {
        return seqNo;
    }

    /**
     * @param seqNo the seqNo to set
     */
    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    @Override
    public int hashCode() {
        return (int) delqId.hashCode() + classCode.hashCode() + seqNo.intValue();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof CmMstPotMatrixEntryExtVPk)) return false;
        if(obj == null) return false;
        CmMstPotMatrixEntryExtVPk cmpmeevp = (CmMstPotMatrixEntryExtVPk) obj;
        return cmpmeevp.delqId.equals(delqId) &&
                cmpmeevp.classCode.equals(classCode) &&
                cmpmeevp.seqNo == seqNo;
    }
}
