/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.bean.support;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @created Jan 17, 2016
 * @author awal
 */
@XmlRootElement
public class BeanProp {

  private Integer count;

  /**
   * @return the count
   */
  public Integer getCount() {
    return count;
  }

  /**
   * @param count the count to set
   */
  public void setCount(Integer count) {
    this.count = count;
  }
}
