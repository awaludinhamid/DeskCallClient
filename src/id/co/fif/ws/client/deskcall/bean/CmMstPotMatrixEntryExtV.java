/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean;

import id.co.fif.ws.client.deskcall.bean.pk.CmMstPotMatrixEntryExtVPk;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Apr 26, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="CM_MST_POT_MATRIX_ENTRY_EXT_V")
@IdClass(CmMstPotMatrixEntryExtVPk.class)
public class CmMstPotMatrixEntryExtV implements Serializable {

    @Id
    private String delqId;

    @Id
    private String classCode;

    @Id
    private Long seqNo;

    @Column(name="POTENSI")
    private Long potensi;

    @Column(name="POTENSI_DESC")
    private String potensiDesc;

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

    /**
     * @return the potensi
     */
    public Long getPotensi() {
        return potensi;
    }

    /**
     * @param potensi the potensi to set
     */
    public void setPotensi(Long potensi) {
        this.potensi = potensi;
    }

    /**
     * @return the potensiDesc
     */
    public String getPotensiDesc() {
        return potensiDesc;
    }

    /**
     * @param potensiDesc the potensiDesc to set
     */
    public void setPotensiDesc(String potensiDesc) {
        this.potensiDesc = potensiDesc;
    }

}
