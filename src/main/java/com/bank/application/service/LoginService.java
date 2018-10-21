package com.bank.application.service;




import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.bank.application.beans.User;



public class LoginService {

	public boolean validateLogin(String userId, String password)
	{
		Configuration conf = new Configuration().configure().addAnnotatedClass(User.class);
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		
		Query query = session.createQuery("from User where username = :userid");
		query.setParameter("userid", userId);
		
		User u = (User)query.uniqueResult();
		
		if(u== null)
		{
			return false;
		}
		else
		{
			return true;
		}
		
		
	}
}
