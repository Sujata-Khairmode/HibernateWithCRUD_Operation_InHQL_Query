package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Account;

public class DeleteData {

	public static void main(String[] args) {
		Configuration cfg =new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Account.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		
		String hqlquery="delete from Account where id=:myid";
		Query<Account> query=ss.createQuery(hqlquery);
		int id=2;
		query.setParameter("myid", 2);
		query.executeUpdate();
		System.out.println("deleted..");
		tr.commit();
		ss.close();
	}

}
