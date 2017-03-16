package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import beans.Book;

public class SelectSingleRowData {

	public SelectSingleRowData() {
		try {
		Configuration cfg = new Configuration();
		cfg.configure("resources/selectSingleRowData.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();

		Session s = sf.openSession();

		Object o = s.load(Book.class, 101);
		Book b = (Book) o;
		System.out.println(b.getId());
		System.out.println(b.getBookName());
		System.out.println(b.getAuthorName());
		System.out.println(b.getBookPrice());
		
		s.close();
		sf.close();
		System.out.println("Completed");
		}
		catch(Exception e) {
			System.out.println("Erro"+e);
		}
	}

}
