package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Book;

public class Update {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="update Book set availableCopies=:copies where b_id=:id";
		MutationQuery query=ss.createMutationQuery(hqlquery);
		query.setParameter("copies", 7);
		query.setParameter("id", 1);
		query.executeUpdate();
		System.out.println("updated..");
		tr.commit();
		ss.close();

	}

}
