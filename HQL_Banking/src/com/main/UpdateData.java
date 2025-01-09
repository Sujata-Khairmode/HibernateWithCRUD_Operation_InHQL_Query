package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Account;

public class UpdateData {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Account.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "update Account set name=:aname where id=:aid";
		MutationQuery query = ss.createMutationQuery(hqlquery);
		query.setParameter("aname", "smita");
		query.setParameter("aid", 4);
		query.executeUpdate();
		System.out.println("updated");
		tr.commit();
		ss.close();
	}

}
