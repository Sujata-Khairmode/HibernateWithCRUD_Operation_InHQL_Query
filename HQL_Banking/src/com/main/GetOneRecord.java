package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Account;

public class GetOneRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Account.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		 Session ss=sf.openSession();
		 Transaction tr= ss.beginTransaction();
		 
		 String hqlquery="from Account where id=: id";
		 Query<Account> query=ss.createQuery(hqlquery,Account.class);
		 query.setParameter("id", 2);
		 Account a=query.getSingleResult();
		 System.out.println(a);

	}

}
