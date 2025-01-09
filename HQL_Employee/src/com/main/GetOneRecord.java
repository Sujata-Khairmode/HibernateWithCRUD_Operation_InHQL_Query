package com.main;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class GetOneRecord {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);

		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Transaction tr = ss.beginTransaction();
		String hqlQuery = "from Employee where id =:id";
		Query<Employee> query = ss.createQuery(hqlQuery, Employee.class);
		query.setParameter("id", 2);
		Employee e=query.getSingleResult();
		System.out.println(e);

	}

}
