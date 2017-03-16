package test;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import beans.Book;

public class InsertData {
	
	public InsertData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Book ID :");
		int bid = scan.nextInt();
		System.out.println("Enter Book Name : ");
		String bname = scan.nextLine();
		System.out.println("Enter Author Name : ");
		String bauthor = scan.next();
		System.out.println("Enter Book Price : ");
		int bprice = scan.nextInt();
		
		Configuration cfg=new Configuration();
		cfg.configure("resources/insertData.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();
		
		Session s=sf.openSession();
		Transaction t=s.beginTransaction();
		
		Book b=new Book();
		b.setId(bid);
		b.setBookName(bname);
		b.setAuthorName(bauthor);
		b.setBookPrice(bprice);
		s.save(b);
		t.commit();
		s.close();
		sf.close();
		System.out.println("Book Inserted Sucessfully");
		
	}
}
