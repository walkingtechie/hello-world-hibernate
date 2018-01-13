package com.walking.techie;


import com.walking.techie.model.Message;
import com.walking.techie.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class HelloWorldClient {
    public static void main(String[] args) {

        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Message message = new Message("Hello world with Hibernate");

        session.save(message);

        transaction.commit();
        session.close();
    }
}
