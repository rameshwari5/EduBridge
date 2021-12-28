package demo;

import java.util.Scanner;

public class Palidrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original,reverse="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
	    original=sc.nextLine();
	    int length=original.length();
	    for(int i=length-1;i>=0;i--)
	    
	    	reverse=reverse+original.charAt(i);
	    	if(original.equals(reverse))
	    	
	    		System.out.println("String is palidrom");
	    	
	    	else 
	    		System.out.println("String is not palidrom");
	    	
	    
	    
		

	}

}
