package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Feedback;

public class FetchAllRecord {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Feedback.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss =sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="from Feedback";
		Query<Feedback> query=ss.createQuery(hqlquery,Feedback.class);
		List<Feedback> list=query.getResultList();
		for (Feedback feedback : list) {
		System.out.println(feedback);	
		}
        
	}

}
