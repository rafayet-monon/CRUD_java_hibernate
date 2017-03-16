package test;

import org.hibernate.cfg.Configuration;

public class CreateTable {

	public CreateTable() {

			Configuration cfg = new Configuration();
			cfg.configure("resources/createTable.cfg.xml");
			cfg.buildSessionFactory();
			System.out.println("Table Created");

	}

}
