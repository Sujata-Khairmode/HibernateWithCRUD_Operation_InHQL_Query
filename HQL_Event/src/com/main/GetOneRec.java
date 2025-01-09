package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Event;



public class GetOneRec {

	public static void main(String[] args) {
	Configuration cfg = new Configuration();
	cfg.configure("hibernate.cfg.xml");
	cfg.addAnnotatedClass(Event.class);
	
	SessionFactory sf=cfg.buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tr=ss.beginTransaction();
	
	String hqlquery="from Event where id=:myid";
	Query<Event> query=ss.createQuery(hqlquery,Event.class);
	query.setParameter("myid", 4);
	Event e=query.getSingleResult();
	System.out.println(e);
	System.out.println("selected..");
	}

}
