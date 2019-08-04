package Spring.WebService;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class respo {
	
List<pojo> r = new ArrayList<pojo>();
	
	
	public List<pojo> insert()
	{
	Configuration cfg = new Configuration().addAnnotatedClass(pojo.class).configure();
	
	
	SessionFactory sf = cfg.buildSessionFactory();
	
	
	Session s= sf.openSession();
	
	s.getTransaction();
	
	
	Query q = s.createQuery("from pojo");
	
	List<pojo> pr =q.getResultList();
	
	for(pojo k:pr)
	{
		
		System.out.println(k.getGender());
		k.getName();
		k.getId();
		
		r.add(k);
	}
	
	
	
	return r;
		
		
	}


	public void create(pojo p) {
		
		Configuration cfg = new Configuration().addAnnotatedClass(pojo.class).configure();
		
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		
		Session s= sf.openSession();
		
		s.beginTransaction();
		
		pojo p1 = new pojo();
		p1.setName(p.getName());
		p1.setGender(p.getGender());
		
		s.save(p1);
		s.getTransaction().commit();
		s.close();
		
		System.out.println("I'm here");
		r.add(p1);
		
	}

}
