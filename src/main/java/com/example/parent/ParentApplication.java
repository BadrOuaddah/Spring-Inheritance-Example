package com.example.parent;

import com.example.parent.types.joined.model.FatherJ;
import com.example.parent.types.joined.model.SonJ;
import com.example.parent.types.singleTable.model.Father;
import com.example.parent.types.singleTable.model.FirstSon;
import com.example.parent.types.singleTable.model.SecondSon;
import com.example.parent.types.tablePerClass.model.FatherTPC;
import com.example.parent.types.tablePerClass.model.SonTPC;
import com.example.parent.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ParentApplication {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Father father = new Father(1L, "Master", "Developer", 20000.0);
        FirstSon firstSon = new FirstSon();
        SecondSon secondSon = new SecondSon();
        session.save(father);
        session.save(firstSon);
        session.save(secondSon);

        FatherTPC fatherTPC = new FatherTPC(1L, "Jack");
        SonTPC sonTPC = new SonTPC("Master");
        session.save(fatherTPC);
        session.save(sonTPC);

        FatherJ fatherJ = new FatherJ(1L, "Johnny");
        SonJ sonJ = new SonJ("Example");
        session.save(fatherJ);
        session.save(sonJ);

        transaction.commit();
        session.close();

        HibernateUtil.shutdown();
    }

}
