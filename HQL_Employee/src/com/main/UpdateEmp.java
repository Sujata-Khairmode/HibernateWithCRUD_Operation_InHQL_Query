package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.entity.Employee;

public class UpdateEmp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="update Employee set name=:myname, salary=:mysalary where id=:myid";
		 Query<Employee> query =ss.createQuery(hqlquery);
		query.setParameter("myname", "rekha");
		query.setParameter("myid", 1);
		query.setParameter("mysalary", 50000);
		query.executeUpdate();
		System.out.println("data updated..");
		tr.commit();
		ss.close();
	}

}
