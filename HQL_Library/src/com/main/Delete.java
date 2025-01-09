package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Book;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlquery = "delete from Book where b_id=:id";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("id", 3);
		query.executeUpdate();
		System.out.println("deleted..");
		tr.commit();
		ss.close();

	}

}
