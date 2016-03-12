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
@Table(name="CM_MST_ACTION_PLAN_EXT_V")
public class CmMstActionPlanExtV implements Serializable {

    @Id
    @Column(name="ACTION_CODE")
    private String actionCode;

    @Column(name="ACTION_PLAN")
    private String actionPlan;

    /**
     * @return the actionCode
     */
    public String getActionCode() {
        return actionCode;
    }

    /**
     * @param actionCode the actionCode to set
     */
    public void setActionCode(String actionCode) {
        this.actionCode = actionCode;
    }

    /**
     * @return the actionPlan
     */
    public String getActionPlan() {
        return actionPlan;
    }

    /**
     * @param actionPlan the actionPlan to set
     */
    public void setActionPlan(String actionPlan) {
        this.actionPlan = actionPlan;
    }
}
