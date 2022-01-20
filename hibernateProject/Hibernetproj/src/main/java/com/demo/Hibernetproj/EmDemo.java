package com.demo.Hibernetproj;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmDemo {
	
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
        Session session =  factory.getCurrentSession();
        
        StudentEntity stu = new StudentEntity();
        stu.setId(3);
        stu.setCity("nagar");
        stu.setName("pune");
        
        Certificate cert = new Certificate("Java", "6 Month");
        
        stu.setCerti(cert);
        
        StudentEntity stu2 = new StudentEntity();
        stu.setId(4);
        stu2.setCity("nashik");
        stu2.setName("ram");
        
        Certificate cert1 = new Certificate("Hibernate", "2 Month");
        
        stu2.setCerti(cert1);
        
        Session s = factory.openSession();
        org.hibernate.Transaction tx = s.beginTransaction();
        
      
        s.save(stu);
        s.save(stu2);
        
        tx.commit();
        session.close();
       
	}

}
