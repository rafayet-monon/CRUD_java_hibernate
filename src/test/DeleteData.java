package test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Book;

public class DeleteData {
	public DeleteData() {
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter ID of a book which u wanna Delete : ");
		int i=scan.nextInt();
		Configuration cfg=new Configuration();
		cfg.configure("resources/deleteData.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Book b=new Book();
		b.setId(i);
		s.delete(b);
		t.commit();
		s.close();
		sf.close();
		System.out.println("Book Deleted successfully");
		
	}
}
