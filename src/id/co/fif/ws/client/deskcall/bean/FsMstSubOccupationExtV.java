/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean;

import id.co.fif.ws.client.deskcall.bean.pk.FsMstSubOccupationExtVPk;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Mar 31, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="FS_MST_SUB_OCCUPATION_EXT_V")
@IdClass(FsMstSubOccupationExtVPk.class)
public class FsMstSubOccupationExtV implements Serializable {

    @Id
    private String ocptCode;

    @Id
    private String ocptSubCode;

    @Column(name="OCPT_DESC")
    private String ocptDesc;

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

    /**
     * @return the ocptDesc
     */
    public String getOcptDesc() {
        return ocptDesc;
    }

    /**
     * @param ocptDesc the ocptDesc to set
     */
    public void setOcptDesc(String ocptDesc) {
        this.ocptDesc = ocptDesc;
    }
}
