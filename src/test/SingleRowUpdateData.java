package test;

import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Book;

public class SingleRowUpdateData {

	public SingleRowUpdateData() {

		Configuration cfg = new Configuration();
		cfg.configure("resources/singleRowUpdateData.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		org.hibernate.Transaction t = s.beginTransaction();
		Book b=new Book();
		b.setId(103);
		b.setBookName("SHA");
		b.setAuthorName("Monon");
		b.setBookPrice(400);
		
		s.merge(b);
		t.commit();
		s.close();
		sf.close();
		System.out.println("Merge Updated");
		
	}

}
