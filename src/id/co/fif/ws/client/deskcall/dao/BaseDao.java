/*
 * To change this template, choose Tools | Templates
=========== * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.dao;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 * @param <T>
 * @created Mar 24, 2013
 * @author awal
 */
public class BaseDao<T> {

    protected Class domainClass;
    @Autowired
    protected SessionFactory sessionFactory;

    public BaseDao() {
        this.domainClass = (Class) ((ParameterizedType)
                getClass().getGenericSuperclass())
                .getActualTypeArguments()[0];
    }

    public T save(T domain) {
        sessionFactory.getCurrentSession().saveOrUpdate(domain);
        return domain;
    }

    public T delete(T domain) {
        sessionFactory.getCurrentSession().delete(domain);
        return domain;
    }

    public T getById(Long id) {
        return (T) sessionFactory.getCurrentSession().get(domainClass, id);
    }
    
    public void save(List<T> domain) {
      Session session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      int idxTx = 0;
      for(T t : domain) {
        session.save(t);
        if(++idxTx % 50 == 0) {
          session.flush();
          session.clear();
        }
      }
      tx.commit();
      session.close(); 
    }
    
    public void save(T[] domain) {  
      save(Arrays.asList(domain));
    }
    
    public void update(List<T> domain) {
      Session session = sessionFactory.openSession();
      Transaction tx = session.beginTransaction();
      int idxTx = 0;
      for(T t : domain) {
        session.update(t);
        if(++idxTx % 50 == 0) {
          session.flush();
          session.clear();
        }
      }
      tx.commit();
      session.close();
    }
    
    public void update(T[] domain) {
      update(Arrays.asList(domain));
    }

    public List<T> getAll() {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName()).list();
    }

    public List<T> getAll(int start, int num) {
        return sessionFactory.getCurrentSession().createQuery("from " + domainClass.getName() +
                getOrderColumns())
                .setFirstResult(start)
                .setMaxResults(num)
                .list();
    }

    public Integer count() {
        List list = sessionFactory.getCurrentSession().createQuery(
                "select count(*) from " + domainClass.getName() + " x").list();
        Long longVal = (Long) list.get(0);
        return longVal.intValue();
    }

    protected String getOrderColumns() {
        List<String> fields = new ArrayList<String>();
        for(Field field : domainClass.getDeclaredFields()) {
            Annotation[] annotations = field.getDeclaredAnnotations();
            for(Annotation annotation : annotations) {
                if(annotation.toString().startsWith("@javax.persistence.Id"))
                    fields.add(field.getName());
            }
        }
        return getStringFromList(fields, " order by ", ",");
    }

    private String getStringFromList(List<String> strList, String initStr, String delimit) {
        StringBuilder sb = new StringBuilder(initStr);
        for(String str : strList)
            sb.append(str).append(delimit);
        return sb.replace(sb.lastIndexOf(delimit),sb.length(), " ").toString();
    }

    protected String getTableName() {
        return domainClass.getName()
                .substring(domainClass.getName().lastIndexOf(".")+1)
                .replaceAll("(.)([A-Z])", "$1_$2")
                .toUpperCase();
    }
}
