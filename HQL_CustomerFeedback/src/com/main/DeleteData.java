package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Feedback;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Feedback.class);
		
		SessionFactory sf= cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="delete from Feedback where id=:myid";
		Query<Feedback> query=ss.createQuery(hqlquery);
		int id=3;
		query.setParameter("myid", 3);
		query.executeUpdate();
		System.err.println("deleted..");
		tr.commit();
		ss.close();
	}

}
