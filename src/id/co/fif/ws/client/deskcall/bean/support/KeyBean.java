/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean.support;

import java.util.Calendar;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created May 9, 2013
 * @author awal
 */
@XmlRootElement
public class KeyBean {
    private String sessionId;
    private String consumerKey;
    private String tokenKey;
    private String consumerSecret;
    private String tokenSecret;
    private String status = "false";
    private Calendar timeIn;
    private String mitraId;

    /**
     * @return the consumerKey
     */
    public String getConsumerKey() {
        return consumerKey;
    }

    /**
     * @param consumerKey the consumerKey to set
     */
    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    /**
     * @return the tokenKey
     */
    public String getTokenKey() {
        return tokenKey;
    }

    /**
     * @param tokenKey the tokenKey to set
     */
    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    /**
     * @return the consumerSecret
     */
    public String getConsumerSecret() {
        return consumerSecret;
    }

    /**
     * @param consumerSecret the consumerSecret to set
     */
    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    /**
     * @return the tokenSecret
     */
    public String getTokenSecret() {
        return tokenSecret;
    }

    /**
     * @param tokenSecret the tokenSecret to set
     */
    public void setTokenSecret(String tokenSecret) {
        this.tokenSecret = tokenSecret;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the sessionId
     */
    public String getSessionId() {
        return sessionId;
    }

    /**
     * @param sessionId the sessionId to set
     */
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    /**
     * @return the timeIn
     */
    public Calendar getTimeIn() {
        return timeIn;
    }

    /**
     * @param timeIn the timeIn to set
     */
    public void setTimeIn(Calendar timeIn) {
        this.timeIn = timeIn;
    }

    /**
     * @return the mitraId
     */
    public String getMitraId() {
        return mitraId;
    }

    /**
     * @param mitraId the mitraId to set
     */
    public void setMitraId(String mitraId) {
        this.mitraId = mitraId;
    }
}
