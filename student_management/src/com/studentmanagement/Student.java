package com.studentmanagement;

import java.util.LinkedHashMap;


public class Student extends Marks {

	
	public String seat_no, name,course,department,year,semester;
	
	 
	
	public Student() 
	{
		this.subjects.put("physics", 0);
		this.subjects.put("chem", 0);
		this.subjects.put("bio", 0);
		this.subjects.put("math", 0);
		this.subjects.put("english", 0);
	}
	
	public float percentage;
	public int totalmarks;
	
}
