package com.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.MutationQuery;

import com.entity.Employee;

public class InseretEmp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		cfg.addAnnotatedClass(Employee.class);
		
		SessionFactory sf=cfg.buildSessionFactory();
		Session ss=sf.openSession();
		Transaction tr=ss.beginTransaction();
		
		String hqlquery="insert into Employee(name,salary,address,Domain,age)values(:myname,:mysalary,:myaddress,:myDomain,:myage)";
		MutationQuery query=ss.createMutationQuery(hqlquery);
		query.setParameter("myname", "prachi");
		query.setParameter("mysalary", 30000);
		query.setParameter("myaddress", "nagpure");
		query.setParameter("myDomain", "full stack developer");
		query.setParameter("myage", 23);
		query.executeUpdate();
		System.out.println("insert data..");
		tr.commit();
		ss.close();
	    

	}

}
