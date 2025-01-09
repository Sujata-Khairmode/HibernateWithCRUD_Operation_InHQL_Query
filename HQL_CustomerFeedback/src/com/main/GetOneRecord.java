package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Feedback;

public class GetOneRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Feedback.class);
		
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss= sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="from Feedback where id=:myid";
		Query<Feedback> query=ss.createQuery(hqlquery,Feedback.class);
		query.setParameter("myid", 1);
	    Feedback f=query.getSingleResult();
		System.out.println(f);
		
	}

}
