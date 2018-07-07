package Controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class hib {
	
	
	public void pojo(String name,String age) 
	{
		Configuration cn= new Configuration().addAnnotatedClass(pojo.class).configure();
		
		SessionFactory sd= cn.buildSessionFactory();
		
		
		Session ss=sd.openSession();
		Transaction t=ss.beginTransaction();
		pojo p= new pojo();
		p.setAge(age);
		p.setName(name);
		ss.save(p);
		t.commit();
		ss.close();
		sd.close();
	}
	

}
