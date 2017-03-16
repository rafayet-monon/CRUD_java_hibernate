package test;

import java.util.Scanner;

public class Crud_Test {

	public static void main(String[] args) {

		View v = new View();
		v.viewMethod();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();

		switch (a) {
		case 1:
			new CreateTable();
			
			break;
		case 2:
			new InsertData();
			break;
			
		case 3:
			UpdateData.aUpdateData();
			break;
			
		case 4:
			SingleRowUpdateData sru=new SingleRowUpdateData();
			break;
			
		case 5:
			DeleteData d=new DeleteData();
			break;
			
		case 6:
			SelectSingleRowData ssrd=new SelectSingleRowData();
			break;
			
		default:
			break;
		}

	}

}
