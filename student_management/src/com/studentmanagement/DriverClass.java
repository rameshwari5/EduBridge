package com.studentmanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		ArrayList<Student> students = new ArrayList<Student>();
		boolean addstudentchoice = true;
	

		while (addstudentchoice) {
			Student stud = new Student();

			System.out.println("Enter student seat_no");
			stud.seat_no = sc.next();
			System.out.println("Enter student name");
			stud.name = sc.next();
			System.out.println("Enter student course");
			stud.course = sc.next();
			System.out.println("Enter student department");
			stud.department = sc.next();
			System.out.println("Enter student year");
			stud.year = sc.next();
			System.out.println("Enter student semester");
			stud.semester = sc.next();
			

			 Set<String> s = stud.subjects.keySet();
			 for(String str:s) 
			 {
				 System.out.println("Enter the marks of subject: "+str);
				int marks= sc.nextInt();
				stud.subjects.put(str,marks);
			 }
			
			 Collection<Integer> m=  stud.subjects.values();
			 
			 
			 for(int i:m) 
			 {
				 stud.totalmarks += i;
			 }
			 
			 stud.percentage = (((float)stud.totalmarks)/ (s.size()*100) )*100;
			
			students.add(stud);
			
			
			System.out.println("Do you want to add another Student?y/n");
			char ch1=sc.next().charAt(0);
			if(ch1!='y')
			{
				addstudentchoice=false;
			}
			

		}
		
		System.out.println("Do you want to Display result of all student?y/n");
		char ch2=sc.next().charAt(0);
		if(ch2=='y')
		{
			Iterator itr=students.iterator(); //for visiting one by one 
			while(itr.hasNext())
			{
				Student student1=(Student) itr.next();
				System.out.println("Seat_no :"+student1.seat_no);
				System.out.println("Name :"+student1.name);
				System.out.println("Semester :"+student1.semester);
				System.out.println("Year :"+student1.year);
				System.out.println("Department :"+student1.department);
				System.out.println("Course :"+student1.course);
				
				for (Map.Entry<String, Integer> entry : student1.subjects.entrySet()) {
			        System.out.println(entry.getKey() + ":" + entry.getValue());
			    }
				
				System.out.println("total marks: "+student1.totalmarks);
				System.out.println("percentage: "+student1.percentage);
				 
				System.out.println();
			}
		}
		

	}

}
