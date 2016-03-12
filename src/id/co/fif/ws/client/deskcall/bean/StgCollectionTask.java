/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean;

import id.co.fif.ws.client.deskcall.bean.pk.StgCollectionTaskPk;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Apr 2, 2013
 * @author awal
 */
@XmlRootElement
@Entity
@Table(name="STG_COLLECTION_TASK")
@IdClass(StgCollectionTaskPk.class)
public class StgCollectionTask implements Serializable {

    @Id
    private String stgNoLkp;

    @Id
    private Long stgSeqn;

    @Column(name="STG_FIELD_PEOPLE")
    private String stgFieldPeople;

    @Column(name="STG_TEAM")
    private String stgTeam;

    @Column(name="STG_TANGGAL_LKD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgTanggalLkd;

    @Column(name="STG_NO_KONTRAK")
    private String stgNoKontrak;

    @Column(name="STG_APPL_ID")
    private String stgApplId;

    @Column(name="STG_ALAMAT_TAGIH")
    private String stgAlamatTagih;

    @Column(name="STG_NAMA_CUSTOMER")
    private String stgNamaCustomer;

    @Column(name="STG_TELP1")
    private String stgTelp1;

    @Column(name="STG_TELP2")
    private String stgTelp2;

    @Column(name="STG_TELP3")
    private String stgTelp3;

    @Column(name="STG_EMERGENCY_FIXED_PHONE")
    private String stgEmergencyFixedPhone;

    @Column(name="STG_EMERGENCY_MOBILE_PHONE")
    private String stgEmergencyMobilePhone;

    @Column(name="STG_AW")
    private Long stgAw;

    @Column(name="STG_AK")
    private Long stgAk;

    @Column(name="STG_TOP")
    private Long stgTop;

    @Column(name="STG_TGL_AWAL")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgTglAwal;

    @Column(name="STG_TGL_AKHIR")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgTglAkhir;

    @Column(name="STG_OUTSTD_PKK")
    private BigInteger stgOutstdPkk;

    @Column(name="STG_OVERDUE")
    private Long stgOverdue;

    @Column(name="STG_ANGSURAN")
    private BigInteger stgAngsuran;

    @Column(name="STG_OBJ_CODE")
    private String stgObjCode;

    @Column(name="STG_COY_ID")
    private String stgCoyId;

    @Column(name="STG_D_TETAP")
    private BigInteger stgDTetap;

    @Column(name="STG_D_BRJLN")
    private BigInteger stgDBrjln;

    @Column(name="STG_B_TAGIH")
    private BigInteger stgBTagih;

    @Column(name="STG_AMBC")
    private BigInteger stgAmbc;

    @Column(name="STG_BN_MENURUN")
    private BigInteger stgBnMenurun;

    @Column(name="STG_T_TNGGKN")
    private BigInteger stgTTnggkn;

    @Column(name="STG_OBJ_TYPE")
    private String stgObjType;

    @Column(name="STG_BO_POL")
    private String stgBoPol;

    @Column(name="STG_ENGINE_NO")
    private String stgEngineNo;

    @Column(name="STG_FRAME_NO")
    private String stgFrameNo;

    @Column(name="STG_P_B_AWAL")
    private String stgPBAwal;

    @Column(name="STG_DELQ_REASON")
    private String stgDelqReason;

    @Column(name="STG_REM_CLASS")
    private String stgRemClass;

    @Column(name="STG_P_DKH")
    private String stgPDkh;

    @Column(name="STG_OBJECT_CODE_DESCRIPTION")
    private String stgObjectCodeDescription;

    @Column(name="STG_WARNA")
    private String stgWarna;

    @Column(name="STG_CONTRACT_NO")
    private String stgContractNo;

    @Column(name="STG_INST_NO")
    private Long stgInstNo;

    @Column(name="STG_INST_AMT_PAID")
    private BigInteger stgInstAmtPaid;

    @Column(name="STG_PENALTY_AMT_PAID")
    private BigInteger stgPenaltyAmtPaid;

    @Column(name="STG_COLL_FEE_PAID")
    private BigInteger stgCollFeePaid;

    @Column(name="STG_PAID_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgPaidDate;

    @Column(name="STG_DUE_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgDueDate;

    @Column(name="STG_OVD_DAYS")
    private Long stgOvdDays;

    @Column(name="STG_COMPANY_ID")
    private String stgCompanyId;

    @Column(name="STG_TYPE")
    private String stgType;

    @Column(name="STG_CREATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date stgCreatedDate;

    @Column(name="STG_KODE_CABANG_FIF")
    private String stgKodeCabangFif;

    @Column(name="STG_SEND_FLAG")
    private String stgSendFlag;

    /**
     * @return the stgNoLkp
     */
    public String getStgNoLkp() {
        return stgNoLkp;
    }

    /**
     * @param stgNoLkp the stgNoLkp to set
     */
    public void setStgNoLkp(String stgNoLkp) {
        this.stgNoLkp = stgNoLkp;
    }

    /**
     * @return the stgFieldPeople
     */
    public String getStgFieldPeople() {
        return stgFieldPeople;
    }

    /**
     * @param stgFieldPeople the stgFieldPeople to set
     */
    public void setStgFieldPeople(String stgFieldPeople) {
        this.stgFieldPeople = stgFieldPeople;
    }

    /**
     * @return the stgTeam
     */
    public String getStgTeam() {
        return stgTeam;
    }

    /**
     * @param stgTeam the stgTeam to set
     */
    public void setStgTeam(String stgTeam) {
        this.stgTeam = stgTeam;
    }

    /**
     * @return the stgTanggalLkd
     */
    public Date getStgTanggalLkd() {
        return stgTanggalLkd;
    }

    /**
     * @param stgTanggalLkd the stgTanggalLkd to set
     */
    public void setStgTanggalLkd(Date stgTanggalLkd) {
        this.stgTanggalLkd = stgTanggalLkd;
    }

    /**
     * @return the stgNoKontrak
     */
    public String getStgNoKontrak() {
        return stgNoKontrak;
    }

    /**
     * @param stgNoKontrak the stgNoKontrak to set
     */
    public void setStgNoKontrak(String stgNoKontrak) {
        this.stgNoKontrak = stgNoKontrak;
    }

    /**
     * @return the stgApplId
     */
    public String getStgApplId() {
        return stgApplId;
    }

    /**
     * @param stgApplId the stgApplId to set
     */
    public void setStgApplId(String stgApplId) {
        this.stgApplId = stgApplId;
    }

    /**
     * @return the stgAlamatTagih
     */
    public String getStgAlamatTagih() {
        return stgAlamatTagih;
    }

    /**
     * @param stgAlamatTagih the stgAlamatTagih to set
     */
    public void setStgAlamatTagih(String stgAlamatTagih) {
        this.stgAlamatTagih = stgAlamatTagih;
    }

    /**
     * @return the stgNamaCustomer
     */
    public String getStgNamaCustomer() {
        return stgNamaCustomer;
    }

    /**
     * @param stgNamaCustomer the stgNamaCustomer to set
     */
    public void setStgNamaCustomer(String stgNamaCustomer) {
        this.stgNamaCustomer = stgNamaCustomer;
    }

    /**
     * @return the stgTelp1
     */
    public String getStgTelp1() {
        return stgTelp1;
    }

    /**
     * @param stgTelp1 the stgTelp1 to set
     */
    public void setStgTelp1(String stgTelp1) {
        this.stgTelp1 = stgTelp1;
    }

    /**
     * @return the stgTelp2
     */
    public String getStgTelp2() {
        return stgTelp2;
    }

    /**
     * @param stgTelp2 the stgTelp2 to set
     */
    public void setStgTelp2(String stgTelp2) {
        this.stgTelp2 = stgTelp2;
    }

    /**
     * @return the stgTelp3
     */
    public String getStgTelp3() {
        return stgTelp3;
    }

    /**
     * @param stgTelp3 the stgTelp3 to set
     */
    public void setStgTelp3(String stgTelp3) {
        this.stgTelp3 = stgTelp3;
    }

    /**
     * @return the stgAw
     */
    public Long getStgAw() {
        return stgAw;
    }

    /**
     * @param stgAw the stgAw to set
     */
    public void setStgAw(Long stgAw) {
        this.stgAw = stgAw;
    }

    /**
     * @return the stgAk
     */
    public Long getStgAk() {
        return stgAk;
    }

    /**
     * @param stgAk the stgAk to set
     */
    public void setStgAk(Long stgAk) {
        this.stgAk = stgAk;
    }

    /**
     * @return the stgTop
     */
    public Long getStgTop() {
        return stgTop;
    }

    /**
     * @param stgTop the stgTop to set
     */
    public void setStgTop(Long stgTop) {
        this.stgTop = stgTop;
    }

    /**
     * @return the stgTglAwal
     */
    public Date getStgTglAwal() {
        return stgTglAwal;
    }

    /**
     * @param stgTglAwal the stgTglAwal to set
     */
    public void setStgTglAwal(Date stgTglAwal) {
        this.stgTglAwal = stgTglAwal;
    }

    /**
     * @return the stgTglAkhir
     */
    public Date getStgTglAkhir() {
        return stgTglAkhir;
    }

    /**
     * @param stgTglAkhir the stgTglAkhir to set
     */
    public void setStgTglAkhir(Date stgTglAkhir) {
        this.stgTglAkhir = stgTglAkhir;
    }

    /**
     * @return the stgOutstdPkk
     */
    public BigInteger getStgOutstdPkk() {
        return stgOutstdPkk;
    }

    /**
     * @param stgOutstdPkk the stgOutstdPkk to set
     */
    public void setStgOutstdPkk(BigInteger stgOutstdPkk) {
        this.stgOutstdPkk = stgOutstdPkk;
    }

    /**
     * @return the stgOverdue
     */
    public Long getStgOverdue() {
        return stgOverdue;
    }

    /**
     * @param stgOverdue the stgOverdue to set
     */
    public void setStgOverdue(Long stgOverdue) {
        this.stgOverdue = stgOverdue;
    }

    /**
     * @return the stgAngsuran
     */
    public BigInteger getStgAngsuran() {
        return stgAngsuran;
    }

    /**
     * @param stgAngsuran the stgAngsuran to set
     */
    public void setStgAngsuran(BigInteger stgAngsuran) {
        this.stgAngsuran = stgAngsuran;
    }

    /**
     * @return the stgObjCode
     */
    public String getStgObjCode() {
        return stgObjCode;
    }

    /**
     * @param stgObjCode the stgObjCode to set
     */
    public void setStgObjCode(String stgObjCode) {
        this.stgObjCode = stgObjCode;
    }

    /**
     * @return the stgCoyId
     */
    public String getStgCoyId() {
        return stgCoyId;
    }

    /**
     * @param stgCoyId the stgCoyId to set
     */
    public void setStgCoyId(String stgCoyId) {
        this.stgCoyId = stgCoyId;
    }

    /**
     * @return the stgDTetap
     */
    public BigInteger getStgDTetap() {
        return stgDTetap;
    }

    /**
     * @param stgDTetap the stgDTetap to set
     */
    public void setStgDTetap(BigInteger stgDTetap) {
        this.stgDTetap = stgDTetap;
    }

    /**
     * @return the stgDBrjln
     */
    public BigInteger getStgDBrjln() {
        return stgDBrjln;
    }

    /**
     * @param stgDBrjln the stgDBrjln to set
     */
    public void setStgDBrjln(BigInteger stgDBrjln) {
        this.stgDBrjln = stgDBrjln;
    }

    /**
     * @return the stgBTagih
     */
    public BigInteger getStgBTagih() {
        return stgBTagih;
    }

    /**
     * @param stgBTagih the stgBTagih to set
     */
    public void setStgBTagih(BigInteger stgBTagih) {
        this.stgBTagih = stgBTagih;
    }

    /**
     * @return the stgAmbc
     */
    public BigInteger getStgAmbc() {
        return stgAmbc;
    }

    /**
     * @param stgAmbc the stgAmbc to set
     */
    public void setStgAmbc(BigInteger stgAmbc) {
        this.stgAmbc = stgAmbc;
    }

    /**
     * @return the stgBnMenurun
     */
    public BigInteger getStgBnMenurun() {
        return stgBnMenurun;
    }

    /**
     * @param stgBnMenurun the stgBnMenurun to set
     */
    public void setStgBnMenurun(BigInteger stgBnMenurun) {
        this.stgBnMenurun = stgBnMenurun;
    }

    /**
     * @return the stgTTnggkn
     */
    public BigInteger getStgTTnggkn() {
        return stgTTnggkn;
    }

    /**
     * @param stgTTnggkn the stgTTnggkn to set
     */
    public void setStgTTnggkn(BigInteger stgTTnggkn) {
        this.stgTTnggkn = stgTTnggkn;
    }

    /**
     * @return the stgObjType
     */
    public String getStgObjType() {
        return stgObjType;
    }

    /**
     * @param stgObjType the stgObjType to set
     */
    public void setStgObjType(String stgObjType) {
        this.stgObjType = stgObjType;
    }

    /**
     * @return the stgBoPol
     */
    public String getStgBoPol() {
        return stgBoPol;
    }

    /**
     * @param stgBoPol the stgBoPol to set
     */
    public void setStgBoPol(String stgBoPol) {
        this.stgBoPol = stgBoPol;
    }

    /**
     * @return the stgEngineNo
     */
    public String getStgEngineNo() {
        return stgEngineNo;
    }

    /**
     * @param stgEngineNo the stgEngineNo to set
     */
    public void setStgEngineNo(String stgEngineNo) {
        this.stgEngineNo = stgEngineNo;
    }

    /**
     * @return the stgFrameNo
     */
    public String getStgFrameNo() {
        return stgFrameNo;
    }

    /**
     * @param stgFrameNo the stgFrameNo to set
     */
    public void setStgFrameNo(String stgFrameNo) {
        this.stgFrameNo = stgFrameNo;
    }

    /**
     * @return the stgPBAwal
     */
    public String getStgPBAwal() {
        return stgPBAwal;
    }

    /**
     * @param stgPBAwal the stgPBAwal to set
     */
    public void setStgPBAwal(String stgPBAwal) {
        this.stgPBAwal = stgPBAwal;
    }

    /**
     * @return the stgDelqReason
     */
    public String getStgDelqReason() {
        return stgDelqReason;
    }

    /**
     * @param stgDelqReason the stgDelqReason to set
     */
    public void setStgDelqReason(String stgDelqReason) {
        this.stgDelqReason = stgDelqReason;
    }

    /**
     * @return the stgRemClass
     */
    public String getStgRemClass() {
        return stgRemClass;
    }

    /**
     * @param stgRemClass the stgRemClass to set
     */
    public void setStgRemClass(String stgRemClass) {
        this.stgRemClass = stgRemClass;
    }

    /**
     * @return the stgPDkh
     */
    public String getStgPDkh() {
        return stgPDkh;
    }

    /**
     * @param stgPDkh the stgPDkh to set
     */
    public void setStgPDkh(String stgPDkh) {
        this.stgPDkh = stgPDkh;
    }

    /**
     * @return the stgObjectCodeDescription
     */
    public String getStgObjectCodeDescription() {
        return stgObjectCodeDescription;
    }

    /**
     * @param stgObjectCodeDescription the stgObjectCodeDescription to set
     */
    public void setStgObjectCodeDescription(String stgObjectCodeDescription) {
        this.stgObjectCodeDescription = stgObjectCodeDescription;
    }

    /**
     * @return the stgWarna
     */
    public String getStgWarna() {
        return stgWarna;
    }

    /**
     * @param stgWarna the stgWarna to set
     */
    public void setStgWarna(String stgWarna) {
        this.stgWarna = stgWarna;
    }

    /**
     * @return the stgSeqn
     */
    public Long getStgSeqn() {
        return stgSeqn;
    }

    /**
     * @param stgSeqn the stgSeqn to set
     */
    public void setStgSeqn(Long stgSeqn) {
        this.stgSeqn = stgSeqn;
    }

    /**
     * @return the stgEmergencyFixedPhone
     */
    public String getStgEmergencyFixedPhone() {
        return stgEmergencyFixedPhone;
    }

    /**
     * @param stgEmergencyFixedPhone the stgEmergencyFixedPhone to set
     */
    public void setStgEmergencyFixedPhone(String stgEmergencyFixedPhone) {
        this.stgEmergencyFixedPhone = stgEmergencyFixedPhone;
    }

    /**
     * @return the stgEmergencyMobilePhone
     */
    public String getStgEmergencyMobilePhone() {
        return stgEmergencyMobilePhone;
    }

    /**
     * @param stgEmergencyMobilePhone the stgEmergencyMobilePhone to set
     */
    public void setStgEmergencyMobilePhone(String stgEmergencyMobilePhone) {
        this.stgEmergencyMobilePhone = stgEmergencyMobilePhone;
    }

    /**
     * @return the stgContractNo
     */
    public String getStgContractNo() {
        return stgContractNo;
    }

    /**
     * @param stgContractNo the stgContractNo to set
     */
    public void setStgContractNo(String stgContractNo) {
        this.stgContractNo = stgContractNo;
    }

    /**
     * @return the stgInstNo
     */
    public Long getStgInstNo() {
        return stgInstNo;
    }

    /**
     * @param stgInstNo the stgInstNo to set
     */
    public void setStgInstNo(Long stgInstNo) {
        this.stgInstNo = stgInstNo;
    }

    /**
     * @return the stgInstAmtPaid
     */
    public BigInteger getStgInstAmtPaid() {
        return stgInstAmtPaid;
    }

    /**
     * @param stgInstAmtPaid the stgInstAmtPaid to set
     */
    public void setStgInstAmtPaid(BigInteger stgInstAmtPaid) {
        this.stgInstAmtPaid = stgInstAmtPaid;
    }

    /**
     * @return the stgPenaltyAmtPaid
     */
    public BigInteger getStgPenaltyAmtPaid() {
        return stgPenaltyAmtPaid;
    }

    /**
     * @param stgPenaltyAmtPaid the stgPenaltyAmtPaid to set
     */
    public void setStgPenaltyAmtPaid(BigInteger stgPenaltyAmtPaid) {
        this.stgPenaltyAmtPaid = stgPenaltyAmtPaid;
    }

    /**
     * @return the stgCollFeePaid
     */
    public BigInteger getStgCollFeePaid() {
        return stgCollFeePaid;
    }

    /**
     * @param stgCollFeePaid the stgCollFeePaid to set
     */
    public void setStgCollFeePaid(BigInteger stgCollFeePaid) {
        this.stgCollFeePaid = stgCollFeePaid;
    }

    /**
     * @return the stgPaidDate
     */
    public Date getStgPaidDate() {
        return stgPaidDate;
    }

    /**
     * @param stgPaidDate the stgPaidDate to set
     */
    public void setStgPaidDate(Date stgPaidDate) {
        this.stgPaidDate = stgPaidDate;
    }

    /**
     * @return the stgDueDate
     */
    public Date getStgDueDate() {
        return stgDueDate;
    }

    /**
     * @param stgDueDate the stgDueDate to set
     */
    public void setStgDueDate(Date stgDueDate) {
        this.stgDueDate = stgDueDate;
    }

    /**
     * @return the stgOvdDays
     */
    public Long getStgOvdDays() {
        return stgOvdDays;
    }

    /**
     * @param stgOvdDays the stgOvdDays to set
     */
    public void setStgOvdDays(Long stgOvdDays) {
        this.stgOvdDays = stgOvdDays;
    }

    /**
     * @return the stgCompanyId
     */
    public String getStgCompanyId() {
        return stgCompanyId;
    }

    /**
     * @param stgCompanyId the stgCompanyId to set
     */
    public void setStgCompanyId(String stgCompanyId) {
        this.stgCompanyId = stgCompanyId;
    }

    /**
     * @return the stgType
     */
    public String getStgType() {
        return stgType;
    }

    /**
     * @param stgType the stgType to set
     */
    public void setStgType(String stgType) {
        this.stgType = stgType;
    }

    /**
     * @return the stgCreatedDate
     */
    public Date getStgCreatedDate() {
        return stgCreatedDate;
    }

    /**
     * @param stgCreatedDate the stgCreatedDate to set
     */
    public void setStgCreatedDate(Date stgCreatedDate) {
        this.stgCreatedDate = stgCreatedDate;
    }

    /**
     * @return the stgKodeCabangFif
     */
    public String getStgKodeCabangFif() {
        return stgKodeCabangFif;
    }

    /**
     * @param stgKodeCabangFif the stgKodeCabangFif to set
     */
    public void setStgKodeCabangFif(String stgKodeCabangFif) {
        this.stgKodeCabangFif = stgKodeCabangFif;
    }

    /**
     * @return the stgSendFlag
     */
    public String getStgSendFlag() {
        return stgSendFlag;
    }

    /**
     * @param stgSendFlag the stgSendFlag to set
     */
    public void setStgSendFlag(String stgSendFlag) {
        this.stgSendFlag = stgSendFlag;
    }

}
