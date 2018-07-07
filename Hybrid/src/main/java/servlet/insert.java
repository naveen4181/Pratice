package servlet;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.context.annotation.Configuration;

public class insert {
	
	
	public void insert(String name,String age,String sal,String job) 
	{
		
		
		org.hibernate.cfg.Configuration cf= new org.hibernate.cfg.Configuration().addAnnotatedClass(pojo.class).configure();
		
		
		
		SessionFactory sf= cf.buildSessionFactory();
		
		Session ss= sf.openSession();
		
		
		Transaction t=ss.beginTransaction();
		
	pojo p= new pojo();
	

	p.setAge(age);
	p.setName(name);
	p.setJob(job);
	p.setSal(sal);
	ss.save(p);
	
	ss.close();
	t.commit();
	sf.close();

	
		
		
	}

}
