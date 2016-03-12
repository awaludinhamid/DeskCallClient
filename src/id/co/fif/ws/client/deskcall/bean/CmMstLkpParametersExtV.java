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
@Table(name="CM_MST_LKP_PARAMETERS_EXT_V")
public class CmMstLkpParametersExtV implements Serializable {

    @Id
    @Column(name="LKP_FLAG")
    private String lkpFlag;

    @Column(name="DESCRIPTION")
    private String description;

    @Column(name="NEED_COMMENT")
    private String needComment;

    @Column(name="NEED_DATE")
    private String needDate;

    @Column(name="IS_DESKCALL")
    private String isDeskcall;

    @Column(name="MAX_PROMISE_DAYS")
    private Long maxPromiseDays;

    /**
     * @return the lkpFlag
     */
    public String getLkpFlag() {
        return lkpFlag;
    }

    /**
     * @param lkpFlag the lkpFlag to set
     */
    public void setLkpFlag(String lkpFlag) {
        this.lkpFlag = lkpFlag;
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

    /**
     * @return the needComment
     */
    public String getNeedComment() {
        return needComment;
    }

    /**
     * @param needComment the needComment to set
     */
    public void setNeedComment(String needComment) {
        this.needComment = needComment;
    }

    /**
     * @return the needDate
     */
    public String getNeedDate() {
        return needDate;
    }

    /**
     * @param needDate the needDate to set
     */
    public void setNeedDate(String needDate) {
        this.needDate = needDate;
    }

    /**
     * @return the isDeskcall
     */
    public String getIsDeskcall() {
        return isDeskcall;
    }

    /**
     * @param isDeskcall the isDeskcall to set
     */
    public void setIsDeskcall(String isDeskcall) {
        this.isDeskcall = isDeskcall;
    }

    /**
     * @return the maxPromiseDays
     */
    public Long getMaxPromiseDays() {
        return maxPromiseDays;
    }

    /**
     * @param maxPromiseDays the maxPromiseDays to set
     */
    public void setMaxPromiseDays(Long maxPromiseDays) {
        this.maxPromiseDays = maxPromiseDays;
    }

}
