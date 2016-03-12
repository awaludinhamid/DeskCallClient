/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean;

import id.co.fif.ws.client.deskcall.bean.pk.StgCollectionResultPk;
import java.io.Serializable;
import java.util.Date;
import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Apr 1, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="STG_COLLECTION_RESULT")
@IdClass(StgCollectionResultPk.class)
public class StgCollectionResult implements Serializable {

    @Id
    private String stgLkpNo;

    @Id
    private Long stgLkpSeqno;

    @Column(name="STG_PARAM")
    private String stgParam;

    @Column(name="STG_PROMISE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgPromiseDate;

    @Column(name="STG_CLASSIFICATION")
    private String stgClassification;

    @Column(name="STG_REASONS")
    private String stgReasons;

    @Column(name="STG_POTENSI")
    private Long stgPotensi;

    @Column(name="STG_OCCUPATION")
    private String stgOccupation;

    @Column(name="STG_SUB_OCCUPATION")
    private String stgSubOccupation;

    @Column(name="STG_WHO_MET")
    private String stgWhoMet;

    @Column(name="STG_UNIT_HOLDER")
    private String stgUnitHolder;

    @Column(name="STG_NEW_ADDRESS")
    private String stgNewAddress;

    @Column(name="STG_RT")
    private String stgRt;

    @Column(name="STG_RW")
    private String stgRw;

    @Column(name="STG_ZIP")
    private String stgZip;

    @Column(name="STG_SUBZIP")
    private String stgSubzip;

    @Column(name="STG_PROVINCE")
    private String stgProvince;

    @Column(name="STG_CITY")
    private String stgCity;

    @Column(name="STG_KECAMATAN")
    private String stgKecamatan;

    @Column(name="STG_KELURAHAN")
    private String stgKelurahan;

    @Column(name="STG_PHONE")
    private String stgPhone;

    @Column(name="STG_FAX")
    private String stgFax;

    @Column(name="STG_HP1")
    private String stgHp1;

    @Column(name="STG_HP2")
    private String stgHp2;

    @Column(name="STG_EMAIL")
    private String stgEmail;

    @Column(name="STG_ADDRS_UNIT_HOLDER")
    private String stgAddrsUnitHolder;

    @Column(name="STG_PHONE_UNIT_HOLDER")
    private String stgPhoneUnitHolder;

    @Column(name="STG_HOW")
    private String stgHow;

    @Column(name="STG_HOW_MUCH")
    private BigInteger stgHowMuch;

    @Column(name="STG_LKP_COMMENTS")
    private String stgLkpComments;

    @Column(name="STG_CREATED_TIME_STAMP")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgCreatedTimeStamp;

    @Column(name="STG_FLAG_UPDATE")
    private String stgFlagUpdate;

    @Column(name="STG_ERROR_TYPE")
    private String stgErrorType;

    /**
     * @return the stgLkpNo
     */
    public String getStgLkpNo() {
        return stgLkpNo;
    }

    /**
     * @param stgLkpNo the stgLkpNo to set
     */
    public void setStgLkpNo(String stgLkpNo) {
        this.stgLkpNo = stgLkpNo;
    }

    /**
     * @return the stgLkpSeqno
     */
    public Long getStgLkpSeqno() {
        return stgLkpSeqno;
    }

    /**
     * @param stgLkpSeqno the stgLkpSeqno to set
     */
    public void setStgLkpSeqno(Long stgLkpSeqno) {
        this.stgLkpSeqno = stgLkpSeqno;
    }

    /**
     * @return the stgParam
     */
    public String getStgParam() {
        return stgParam;
    }

    /**
     * @param stgParam the stgParam to set
     */
    public void setStgParam(String stgParam) {
        this.stgParam = stgParam;
    }

    /**
     * @return the stgClassification
     */
    public String getStgClassification() {
        return stgClassification;
    }

    /**
     * @param stgClassification the stgClassification to set
     */
    public void setStgClassification(String stgClassification) {
        this.stgClassification = stgClassification;
    }

    /**
     * @return the stgPotensi
     */
    public Long getStgPotensi() {
        return stgPotensi;
    }

    /**
     * @param stgPotensi the stgPotensi to set
     */
    public void setStgPotensi(Long stgPotensi) {
        this.stgPotensi = stgPotensi;
    }

    /**
     * @return the stgOccupation
     */
    public String getStgOccupation() {
        return stgOccupation;
    }

    /**
     * @param stgOccupation the stgOccupation to set
     */
    public void setStgOccupation(String stgOccupation) {
        this.stgOccupation = stgOccupation;
    }

    /**
     * @return the stgSubOccupation
     */
    public String getStgSubOccupation() {
        return stgSubOccupation;
    }

    /**
     * @param stgSubOccupation the stgSubOccupation to set
     */
    public void setStgSubOccupation(String stgSubOccupation) {
        this.stgSubOccupation = stgSubOccupation;
    }

    /**
     * @return the stgWhoMet
     */
    public String getStgWhoMet() {
        return stgWhoMet;
    }

    /**
     * @param stgWhoMet the stgWhoMet to set
     */
    public void setStgWhoMet(String stgWhoMet) {
        this.stgWhoMet = stgWhoMet;
    }

    /**
     * @return the stgUnitHolder
     */
    public String getStgUnitHolder() {
        return stgUnitHolder;
    }

    /**
     * @param stgUnitHolder the stgUnitHolder to set
     */
    public void setStgUnitHolder(String stgUnitHolder) {
        this.stgUnitHolder = stgUnitHolder;
    }

    /**
     * @return the stgNewAddress
     */
    public String getStgNewAddress() {
        return stgNewAddress;
    }

    /**
     * @param stgNewAddress the stgNewAddress to set
     */
    public void setStgNewAddress(String stgNewAddress) {
        this.stgNewAddress = stgNewAddress;
    }

    /**
     * @return the stgPhone
     */
    public String getStgPhone() {
        return stgPhone;
    }

    /**
     * @param stgPhone the stgPhone to set
     */
    public void setStgPhone(String stgPhone) {
        this.stgPhone = stgPhone;
    }

    /**
     * @return the stgAddrsUnitHolder
     */
    public String getStgAddrsUnitHolder() {
        return stgAddrsUnitHolder;
    }

    /**
     * @param stgAddrsUnitHolder the stgAddrsUnitHolder to set
     */
    public void setStgAddrsUnitHolder(String stgAddrsUnitHolder) {
        this.stgAddrsUnitHolder = stgAddrsUnitHolder;
    }

    /**
     * @return the stgPhoneUnitHolder
     */
    public String getStgPhoneUnitHolder() {
        return stgPhoneUnitHolder;
    }

    /**
     * @param stgPhoneUnitHolder the stgPhoneUnitHolder to set
     */
    public void setStgPhoneUnitHolder(String stgPhoneUnitHolder) {
        this.stgPhoneUnitHolder = stgPhoneUnitHolder;
    }

    /**
     * @return the stgPromiseDate
     */
    public Date getStgPromiseDate() {
        return stgPromiseDate;
    }

    /**
     * @param stgPromiseDate the stgPromiseDate to set
     */
    public void setStgPromiseDate(Date stgPromiseDate) {
        this.stgPromiseDate = stgPromiseDate;
    }

    /**
     * @return the stgReasons
     */
    public String getStgReasons() {
        return stgReasons;
    }

    /**
     * @param stgReasons the stgReasons to set
     */
    public void setStgReasons(String stgReasons) {
        this.stgReasons = stgReasons;
    }

    /**
     * @return the stgHowMuch
     */
    public BigInteger getStgHowMuch() {
        return stgHowMuch;
    }

    /**
     * @param stgHowMuch the stgHowMuch to set
     */
    public void setStgHowMuch(BigInteger stgHowMuch) {
        this.stgHowMuch = stgHowMuch;
    }

    /**
     * @return the stgLkpComments
     */
    public String getStgLkpComments() {
        return stgLkpComments;
    }

    /**
     * @param stgLkpComments the stgLkpComments to set
     */
    public void setStgLkpComments(String stgLkpComments) {
        this.stgLkpComments = stgLkpComments;
    }

    /**
     * @return the stgRt
     */
    public String getStgRt() {
        return stgRt;
    }

    /**
     * @param stgRt the stgRt to set
     */
    public void setStgRt(String stgRt) {
        this.stgRt = stgRt;
    }

    /**
     * @return the stgRw
     */
    public String getStgRw() {
        return stgRw;
    }

    /**
     * @param stgRw the stgRw to set
     */
    public void setStgRw(String stgRw) {
        this.stgRw = stgRw;
    }

    /**
     * @return the stgHow
     */
    public String getStgHow() {
        return stgHow;
    }

    /**
     * @param stgHow the stgHow to set
     */
    public void setStgHow(String stgHow) {
        this.stgHow = stgHow;
    }

    /**
     * @return the stgKelurahan
     */
    public String getStgKelurahan() {
        return stgKelurahan;
    }

    /**
     * @param stgKelurahan the stgKelurahan to set
     */
    public void setStgKelurahan(String stgKelurahan) {
        this.stgKelurahan = stgKelurahan;
    }

    /**
     * @return the stgFlagUpdate
     */
    public String getStgFlagUpdate() {
        return stgFlagUpdate;
    }

    /**
     * @param stgFlagUpdate the stgFlagUpdate to set
     */
    public void setStgFlagUpdate(String stgFlagUpdate) {
        this.stgFlagUpdate = stgFlagUpdate;
    }

    /**
     * @return the stgKecamatan
     */
    public String getStgKecamatan() {
        return stgKecamatan;
    }

    /**
     * @param stgKecamatan the stgKecamatan to set
     */
    public void setStgKecamatan(String stgKecamatan) {
        this.stgKecamatan = stgKecamatan;
    }

    /**
     * @return the stgErrorType
     */
    public String getStgErrorType() {
        return stgErrorType;
    }

    /**
     * @param stgErrorType the stgErrorType to set
     */
    public void setStgErrorType(String stgErrorType) {
        this.stgErrorType = stgErrorType;
    }

    /**
     * @return the stgCity
     */
    public String getStgCity() {
        return stgCity;
    }

    /**
     * @param stgCity the stgCity to set
     */
    public void setStgCity(String stgCity) {
        this.stgCity = stgCity;
    }

    /**
     * @return the stgZip
     */
    public String getStgZip() {
        return stgZip;
    }

    /**
     * @param stgZip the stgZip to set
     */
    public void setStgZip(String stgZip) {
        this.stgZip = stgZip;
    }

    /**
     * @return the stgSubZip
     */
    public String getStgSubzip() {
        return stgSubzip;
    }

    /**
     * @param stgSubzip the stgSubZip to set
     */
    public void setStgSubzip(String stgSubzip) {
        this.stgSubzip = stgSubzip;
    }

    /**
     * @return the stgProvince
     */
    public String getStgProvince() {
        return stgProvince;
    }

    /**
     * @param stgProvince the stgProvince to set
     */
    public void setStgProvince(String stgProvince) {
        this.stgProvince = stgProvince;
    }

    /**
     * @return the stgFax
     */
    public String getStgFax() {
        return stgFax;
    }

    /**
     * @param stgFax the stgFax to set
     */
    public void setStgFax(String stgFax) {
        this.stgFax = stgFax;
    }

    /**
     * @return the stgHp1
     */
    public String getStgHp1() {
        return stgHp1;
    }

    /**
     * @param stgHp1 the stgHp1 to set
     */
    public void setStgHp1(String stgHp1) {
        this.stgHp1 = stgHp1;
    }

    /**
     * @return the stgHp2
     */
    public String getStgHp2() {
        return stgHp2;
    }

    /**
     * @param stgHp2 the stgHp2 to set
     */
    public void setStgHp2(String stgHp2) {
        this.stgHp2 = stgHp2;
    }

    /**
     * @return the stgEmail
     */
    public String getStgEmail() {
        return stgEmail;
    }

    /**
     * @param stgEmail the stgEmail to set
     */
    public void setStgEmail(String stgEmail) {
        this.stgEmail = stgEmail;
    }

    /**
     * @return the stgCreatedTimeStamp
     */
    public Date getStgCreatedTimeStamp() {
        return stgCreatedTimeStamp;
    }

    /**
     * @param stgCreatedTimeStamp the stgCreatedTimeStamp to set
     */
    public void setStgCreatedTimeStamp(Date stgCreatedTimeStamp) {
        this.stgCreatedTimeStamp = stgCreatedTimeStamp;
    }

}
