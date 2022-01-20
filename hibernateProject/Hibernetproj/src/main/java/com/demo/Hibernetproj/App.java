package com.demo.Hibernetproj;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )throws IOException
    {
        System.out.println( "Project Started !" );
        SessionFactory factory = new Configuration().configure().buildSessionFactory();
        
        
        Session session = factory.openSession();
        System.out.println(factory.isClosed());
        
        
        /*StudentEntity st = new StudentEntity("ram","pune");
        System.out.println(st);
        
        session.beginTransaction();
        session.save(st);
        session.getTransaction().commit();
        session.close();*/
        
        //Reading image
        FileInputStream fis = new FileInputStream("path of image");
        byte[] data = new byte [fis.available()];
        fis.read();
        
      
       //Creating class of address
        Address add = new Address();
        add.setCity("nashik");
        add.setHno(66);
        add.setOpen(true);
        add.setStreet("kasid");
        add.setAdd_date(new Date());
        
        session.beginTransaction();
        session.save(add);
        
        
        
    }
}
