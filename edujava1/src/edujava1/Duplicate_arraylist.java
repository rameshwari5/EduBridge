package edujava1;

import java.util.ArrayList;

public class Duplicate_arraylist {
     public static void main(String args[]) {
    	 
    	 ArrayList<Integer> list =new ArrayList<>();
    			 
    	 
     }
}
class Elements
{
	public static <T> ArrayList<T> removeDuplicates(ArrayList<T> list){
		ArrayList<T> newList=new ArrayList<T>();
		for(T element:list) {
			if(!newList.contains(element))
			{
				newList.add(element);
				
			}
		}
		return newList;
		
	}
	
}