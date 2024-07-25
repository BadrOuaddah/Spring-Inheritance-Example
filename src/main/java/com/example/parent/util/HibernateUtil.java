package com.example.parent.util;

import com.example.parent.types.joined.model.FatherJ;
import com.example.parent.types.joined.model.SonJ;
import com.example.parent.types.singleTable.model.Father;
import com.example.parent.types.singleTable.model.FirstSon;
import com.example.parent.types.singleTable.model.SecondSon;
import com.example.parent.types.tablePerClass.model.FatherTPC;
import com.example.parent.types.tablePerClass.model.SonTPC;
import lombok.Getter;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;


public class HibernateUtil {
    @Getter
    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory() {
        try {
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            configuration.addAnnotatedClass(FatherJ.class);
            configuration.addAnnotatedClass(SonJ.class);
            configuration.addAnnotatedClass(FatherTPC.class);
            configuration.addAnnotatedClass(SonTPC.class);
            configuration.addAnnotatedClass(Father.class);
            configuration.addAnnotatedClass(FirstSon.class);
            configuration.addAnnotatedClass(SecondSon.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder()
                    .applySettings(configuration.getProperties()).build());
        } catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static void shutdown() {
        getSessionFactory().close();
    }

}
