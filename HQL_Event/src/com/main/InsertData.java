package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Event;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Event.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="insert into Event(eventName,eventDate,eventLocation,organizerName,totalSeats,eventBudget)values(:ename,:edate,:elocation,:orgname,:tseats,:budget)";
		MutationQuery query=ss.createMutationQuery(hqlquery);
		query.setParameter("ename","friends reunion");
		query.setParameter("edate", 31);
		query.setParameter("elocation", "matoshri park and gardan");
		query.setParameter("orgname", "suman pawar");
		query.setParameter("tseats", 200);
		query.setParameter("budget", 6000);
        query.executeUpdate();
		System.out.println("inserted..");
		tr.commit();
		ss.close();
		
	}

}
