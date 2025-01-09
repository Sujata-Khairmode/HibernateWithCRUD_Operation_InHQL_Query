package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;


import com.entity.Event;

public class FetchAllRecords {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Event.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="from Event";
		 Query<Event>query =ss.createQuery(hqlquery,Event.class);
         List<Event> list=query.getResultList();
         for (Event event : list) {
        	 System.out.println(event);
			
		} 
		
	}

}
