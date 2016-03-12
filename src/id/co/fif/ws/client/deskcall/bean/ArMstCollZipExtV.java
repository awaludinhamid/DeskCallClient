/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean;

import id.co.fif.ws.client.deskcall.bean.pk.ArMstCollZipExtVPk;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Apr 27, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="AR_MST_COLL_ZIP_EXT_V")
@IdClass(ArMstCollZipExtVPk.class)
public class ArMstCollZipExtV implements Serializable {

    @Id
    private String zipCode;

    @Id
    private String subZipCode;

    @Id
    private String officeCode;

    @Column(name="AREA_DESC")
    private String areaDesc;

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

    /**
     * @return the areaDesc
     */
    public String getAreaDesc() {
        return areaDesc;
    }

    /**
     * @param areaDesc the areaDesc to set
     */
    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
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
