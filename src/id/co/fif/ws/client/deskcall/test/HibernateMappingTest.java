/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.test;

import id.co.fif.ws.client.deskcall.bean.FsMstOfficesExtV;
import java.util.List;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;


/**
 * @created Mar 24, 2013
 * @author awal
 */
public class HibernateMappingTest {

    public static void main(String[] args) {
        Configuration conf = new AnnotationConfiguration()
                .configure("/hibernate.cfg.xml");
        SessionFactory sessionFactory = conf.buildSessionFactory();

        FsMstOfficesExtV branch = new FsMstOfficesExtV();
        branch.setOfficeCode("10100");
        branch.setNameShort("Jakarta - 1");

        Session session = sessionFactory.openSession();
        try {
            session.beginTransaction();
            session.save(branch);
            session.getTransaction().commit();
        } catch (HibernateException hx) {
            session.getTransaction().rollback();
        }
        session.close();

        session = sessionFactory.openSession();
        Query query = session.createQuery("from TblBranch");
        List<FsMstOfficesExtV> masterTabs = query.list();
        for(FsMstOfficesExtV masterTab : masterTabs) {
            System.out.println(masterTab.getOfficeCode());
            System.out.println(masterTab.getNameShort());
        }

        session.close();
        sessionFactory.close();
    }
}
