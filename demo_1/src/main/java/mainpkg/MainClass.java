package mainpkg;
import java.util.Scanner;

import db_connection.JDBC_Connection;
public class MainClass {
	public static void main(String[] args) {
   // TODO Auto-generated method stub

		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter id");
		int id =sc.nextInt(); 
	    DBsample obj=new DBsample();
	
        

	
	obj.select(id);
        
		}

	}


