package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Book;

public class Insert {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Book.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "insert into Book(b_name,author,publisher,totalCopies,availableCopies)values(:name,:author,:publisher,:totalcopies,:availablecopies)";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("name", "The Man Who Laughs");
		query.setParameter("author", "Victor Hugo");
		query.setParameter("publisher", "P. J. Stahl");
		query.setParameter("totalcopies",30 );
		query.setParameter("availablecopies", 28);
		query.executeUpdate();
		System.out.println("inserted..");
		tr.commit();
		ss.close();

	}

}
