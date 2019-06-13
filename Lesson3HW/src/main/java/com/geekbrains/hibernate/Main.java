package com.geekbrains.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import javax.security.auth.login.AppConfigurationEntry;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .buildSessionFactory();


        Session session = null;

        session = factory.getCurrentSession();
            Students tmpStudents = new Students();
            tmpStudents.setFirstName("Artur");
            tmpStudents.setLastName("Arturovich");
            tmpStudents.setBirthDate(21061991);
            tmpStudents.setCourses("math");
            session.beginTransaction();
            session.save(tmpStudents);
            session.getTransaction().commit();

    }
}