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
@Table(name="FS_MST_KECAMATAN_EXT_V")
public class FsMstKecamatanExtV implements Serializable {

    @Id
    @Column(name="KEC_CODE")
    private String kecCode;

    @Column(name="KECAMATAN")
    private String kecamatan;

    @Column(name="CITY_CODE")
    private String cityCode;

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

    /**
     * @return the kecamatan
     */
    public String getKecamatan() {
        return kecamatan;
    }

    /**
     * @param kecamatan the kecamatan to set
     */
    public void setKecamatan(String kecamatan) {
        this.kecamatan = kecamatan;
    }

    /**
     * @return the cityCode
     */
    public String getCityCode() {
        return cityCode;
    }

    /**
     * @param cityCode the cityCode to set
     */
    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }
}
