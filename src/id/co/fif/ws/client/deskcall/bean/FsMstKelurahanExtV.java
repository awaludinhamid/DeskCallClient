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
@Table(name="FS_MST_KELURAHAN_EXT_V")
public class FsMstKelurahanExtV implements Serializable {

    @Id
    @Column(name="KEL_CODE")
    private String kelCode;

    @Column(name="KELURAHAN")
    private String kelurahan;

    @Column(name="KEC_CODE")
    private String kecCode;

    /**
     * @return the kelCode
     */
    public String getKelCode() {
        return kelCode;
    }

    /**
     * @param kelCode the kelCode to set
     */
    public void setKelCode(String kelCode) {
        this.kelCode = kelCode;
    }

    /**
     * @return the kelurahan
     */
    public String getKelurahan() {
        return kelurahan;
    }

    /**
     * @param kelurahan the kelurahan to set
     */
    public void setKelurahan(String kelurahan) {
        this.kelurahan = kelurahan;
    }

    /**
     * @return the kecCode
     */
    public String getKecCode() {
        return kecCode;
    }

    /**
     * @param kecCode the kecCode to set
     */
    public void setKecCode(String kecCode) {
        this.kecCode = kecCode;
    }
}
