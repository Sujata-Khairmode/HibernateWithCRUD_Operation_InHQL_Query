package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Account;

public class InsertData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Account.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr =ss.beginTransaction();
		
		String hqlquery ="insert into Account(type,balance,name,branch)values(:atype,:abalance,:aname,:abranch)";
		MutationQuery query=ss.createMutationQuery(hqlquery);
		query.setParameter("atype", "saving");
		query.setParameter("abalance", 50000f);
		query.setParameter("aname", "Ragini");
		query.setParameter("abranch", "mulkapur");
		query.executeUpdate();
		System.out.println("data inserted successfully");
		tr.commit();
		ss.close();

	}

}
