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
public class FsMstSubOccupationExtVPk implements Serializable {

    @Column(name="OCPT_CODE")
    private String ocptCode;

    @Column(name="OCPT_SUB_CODE")
    private String ocptSubCode;

    /**
     * @return the ocptCode
     */
    public String getOcptCode() {
        return ocptCode;
    }

    /**
     * @param ocptCode the ocptCode to set
     */
    public void setOcptCode(String ocptCode) {
        this.ocptCode = ocptCode;
    }

    /**
     * @return the ocptSubCode
     */
    public String getOcptSubCode() {
        return ocptSubCode;
    }

    /**
     * @param ocptSubCode the ocptSubCode to set
     */
    public void setOcptSubCode(String ocptSubCode) {
        this.ocptSubCode = ocptSubCode;
    }

    @Override
    public int hashCode() {
        return (int) ocptCode.hashCode() + ocptSubCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof FsMstSubOccupationExtVPk)) return false;
        if(obj == null) return false;
        FsMstSubOccupationExtVPk fmsoevp = (FsMstSubOccupationExtVPk) obj;
        return fmsoevp.ocptCode.equals(ocptCode) &&
                fmsoevp.ocptSubCode.equals(ocptSubCode);
    }
}
