package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class Delete {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();

		String hqlquery = "delete from Employee where id=:id";
		Query<Employee> query = ss.createQuery(hqlquery);
		int id = 3;
		query.setParameter("id", 3);
		query.executeUpdate();

		System.out.println("data is deleted successfully");
		tr.commit();
		ss.close();

	}

}
