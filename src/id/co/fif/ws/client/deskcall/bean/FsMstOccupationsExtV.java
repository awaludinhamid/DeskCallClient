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
@Table(name="FS_MST_OCCUPATIONS_EXT_V")
public class FsMstOccupationsExtV implements Serializable {

    @Id
    @Column(name="OCPT_CODE")
    private String ocptCode;

    @Column(name="DESCRIPTION")
    private String description;

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
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
}
