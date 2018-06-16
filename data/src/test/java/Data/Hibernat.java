package Data;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Hibernat {
	
	
	public void userinfo(String a,String b,String c,String d,String e) 
	{
		try {
		
		
		Configuration cn= new Configuration().addAnnotatedClass(pojo.class);

	SessionFactory sf=new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Session ss=sf.openSession();
		
		Transaction t= ss.beginTransaction();
		
		pojo p=new pojo();
		p.setCity(a);
		p.setEmail(a);
		p.setPassword(c);
		p.setPhone(d);
		p.setUserName(e);
		
		ss.save(p);
		t.commit();
		ss.close();
		sf.close();
		
		
		
		}
		catch(Exception e1) {e1.printStackTrace();}
		
		
	}

}
