/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package id.co.fif.ws.client.deskcall.util;

import java.sql.Connection;
import java.sql.SQLException;
import javax.sql.DataSource;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @created Mar 26, 2013
 * @author awal
 */
public class GenerateTables {

    public static void main(String[] args) throws SQLException {
        AbstractApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        DataSource dataSource = (DataSource) appContext.getBean("dataSource");
        Configuration config = new AnnotationConfiguration().configure("/hibernate.cfg.xml");
        Connection conn = dataSource.getConnection();
        new SchemaExport(config, conn).create(true, true);

        System.exit(0);
    }
}
