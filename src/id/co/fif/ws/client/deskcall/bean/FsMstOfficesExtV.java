/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="FS_MST_OFFICES_EXT_V")
public class FsMstOfficesExtV implements Serializable {

    @Id
    @Column(name="OFFICE_CODE")
    private String officeCode;

    @Column(name="NAME_SHORT")
    private String nameShort;

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
     * @return the nameShort
     */
    public String getNameShort() {
        return nameShort;
    }

    /**
     * @param nameShort the nameShort to set
     */
    public void setNameShort(String nameShort) {
        this.nameShort = nameShort;
    }
}
