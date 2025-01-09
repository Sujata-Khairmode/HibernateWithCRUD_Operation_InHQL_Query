package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Feedback;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg= new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Feedback.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="update Feedback set comment=:mycomment where id=:myid";
		MutationQuery query=ss.createMutationQuery(hqlquery);
		query.setParameter("mycomment","bad");
		query.setParameter("myid", 1);
		query.executeUpdate();
		System.out.println("updated...");
		tr.commit();
		ss.close();
		

	}

}
