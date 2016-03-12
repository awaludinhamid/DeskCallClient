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
public class ArMstCollZipExtVPk implements Serializable{

    @Column(name="ZIP_CODE")
    private String zipCode;

    @Column(name="SUB_ZIP_CODE")
    private String subZipCode;

    @Column(name="OFFICE_CODE")
    private String officeCode;

    /**
     * @return the subZipCode
     */
    public String getSubZipCode() {
        return subZipCode;
    }

    /**
     * @param subZipCode the subZipCode to set
     */
    public void setSubZipCode(String subZipCode) {
        this.subZipCode = subZipCode;
    }

    /**
     * @return the officeCode
     */
    public String getOfficeCode() {
        return officeCode;
    }

    /**
     * @param officeCode the officeCode to set
     */
    public void setOfficeCode(String officeCode) {
        this.officeCode = officeCode;
    }

    @Override
    public int hashCode() {
        return (int) subZipCode.hashCode() + officeCode.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == this) return true;
        if(!(obj instanceof ArMstCollZipExtVPk)) return false;
        if(obj == null) return false;
        ArMstCollZipExtVPk amczevp = (ArMstCollZipExtVPk) obj;
        return amczevp.subZipCode.equals(subZipCode) && amczevp.officeCode.equals(officeCode);
    }

    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }

    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
}
