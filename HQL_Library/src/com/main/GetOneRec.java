package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.entity.Book;

public class GetOneRec {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="from Book where b_id=:id";
	    Query<Book> query=ss.createQuery(hqlquery,Book.class);
	    query.setParameter("id", 2);
	    Book b=query.getSingleResult();
	    System.out.println(b);
	    System.out.println("one record fetched..");
	
	
	}

}
