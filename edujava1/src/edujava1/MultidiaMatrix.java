package edujava1;

import java.util.Scanner;

public class MultidiaMatrix {
 public static void main(String args[])
 {
	 int matrix[][]=new int[3][3];
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter matrix element");
	 for( int i=0;  i<matrix.length; i++) {
		 for(int j=0; j<matrix[i].length; j++)
		 {
			 matrix[i][j]=sc.nextInt();
	
		 }
	
	 }
	 System.out.println("matrix");
	 for(int i=0;i<matrix[i].length;i++)
	 {
		 for(int j=0;j<matrix.length;j++) {
			 System.out.println(matrix[i][j]);
			 
		 }
	 
    System.out.println("");
	 }
	
 }
 
}
