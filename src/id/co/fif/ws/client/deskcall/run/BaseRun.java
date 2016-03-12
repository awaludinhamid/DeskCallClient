/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.run;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.core.util.MultivaluedMapImpl;
import com.sun.jersey.oauth.client.OAuthClientFilter;
import id.co.fif.ws.client.deskcall.bean.support.BeanProp;
import id.co.fif.ws.client.deskcall.security.ResponseStatus;
import id.co.fif.ws.client.deskcall.util.SessionUtil;
import java.lang.reflect.ParameterizedType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.dao.DataIntegrityViolationException;

/**
 * @param <B>
 * @param <T>
 * @created Apr 7, 2013
 * @author awal
 */
public abstract class BaseRun<B,T> implements Runnable {

    protected T service;
    private final String beanName;
    private final Client client;
    private final OAuthClientFilter clientFilter;
    private String uri = "";
    private BeanProp beanProp;
    protected Integer firstResult = 0;
    protected Integer maxResults = 0;
    protected String mitraId;
    protected String officeCode;
    protected String cityCode;


    public BaseRun(Client client, OAuthClientFilter clientFilter, String uri) {
        this.client = client;
        this.uri = uri;
        this.clientFilter = clientFilter;
        Class clazzBean = (Class) ((ParameterizedType)
                getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
        Class clazzService = (Class) ((ParameterizedType)
                getClass().getGenericSuperclass())
                .getActualTypeArguments()[1];
        String name = clazzBean.getSimpleName();
        this.beanName = name.substring(0,1).toLowerCase() + name.substring(1);
        name = clazzService.getSimpleName();
        this.service = new SessionUtil<T>().getAppContext(
                name.substring(0,1).toLowerCase() + name.substring(1));
    }

    public int runGet() {
        WebResource resource = client.resource(uri + "/" + beanName);
        resource.addFilter(clientFilter);
        try {
            saveList(resource);
        } catch(ConstraintViolationException cve) {
            System.out.println("Key duplicate by session, try to re-execution");
            return 401;//error
        } catch(DataIntegrityViolationException dive) {
            System.out.println("Key duplicate by session, try to re-execution");
            return 401;//error
        }
        return 200;//ok
    }

    public int runPost() {
        WebResource resource = client.resource(uri + "/" + beanName + "/post");
        resource.addFilter(clientFilter);
        ClientResponse response =
                resource.type(MediaType.APPLICATION_JSON).post(ClientResponse.class, getArray());
        return response.getStatus();
    }

    public int runGetCount() {
        WebResource resource = client.resource(uri + "/" + beanName + "/count");
        resource.addFilter(clientFilter);
        GenericType<BeanProp> genericType =
                new GenericType<BeanProp>(){};
        beanProp = resource.queryParams(getParams()).accept(MediaType.APPLICATION_JSON).get(genericType);
        return 200;//ok
    }

    @Override
    public void run() {
      runGet();
    }

    protected abstract void saveList(WebResource resource);
    protected abstract B[] getArray();
    protected MultivaluedMap<String,String> getParams() {
        MultivaluedMap<String,String> params = new MultivaluedMapImpl();
        params.add("mitraId", mitraId);
        params.add("officeCode", officeCode);
        params.add("firstResult", String.valueOf(firstResult));
        params.add("maxResults", String.valueOf(maxResults));
        return params;
    }
    protected void printInfo(String info, int count) {
      System.out.println(info + ": " + count); 
    }
    protected void printInfo(int count) {
      printInfo(this.getClass().getSimpleName().replace("Run", ""),count); 
    }
    
    public Integer getCount() {
      if(ResponseStatus.isSuccess(runGetCount()))
        return beanProp.getCount();
      return 0;
    }

  /**
   * @param maxResults the maxResults to set
   */
  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  /**
   * @param mitraId the mitraId to set
   */
  public void setMitraId(String mitraId) {
    this.mitraId = mitraId;
  }

  /**
   * @param firstResult the firstResult to set
   */
  public void setFirstResult(Integer firstResult) {
    this.firstResult = firstResult;
  }

  /**
   * @param officeCode the firstResult to set
   */
  public void setOfficeCode(String officeCode) {
    this.officeCode = officeCode;
  }

  /**
   * @param cityCode the cityCode to set
   */
  public void setCityCode(String cityCode) {
    this.cityCode = cityCode;
  }

}
