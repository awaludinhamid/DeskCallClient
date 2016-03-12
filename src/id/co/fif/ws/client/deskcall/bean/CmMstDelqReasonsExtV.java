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
@Table(name="CM_MST_DELQ_REASONS_EXT_V")
public class CmMstDelqReasonsExtV implements Serializable {

    @Id
    @Column(name="DELQ_CODE")
    private String delqCode;

    @Column(name="DESCRIPTION")
    private String description;

    /**
     * @return the delqCode
     */
    public String getDelqCode() {
        return delqCode;
    }

    /**
     * @param delqCode the delqCode to set
     */
    public void setDelqCode(String delqCode) {
        this.delqCode = delqCode;
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
