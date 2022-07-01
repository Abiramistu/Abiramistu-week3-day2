package week3.day2;


import java.util.ArrayList;
import java.util.List;



public class arraylist {
	public static void main(String[] args) {
	List<String> list=new ArrayList<String>();
	{
		
		list.add("Red");
		list.add("Green");
		list.add("yellow");
		list.add("Blue");
        list.add("Brown");
        
        int size=list.size();
        for(int i=size-1;i>=0;i--)
        {
        	String listvalues=list.get(i);
        	System.out.println("The reverse list is:"+listvalues);
        }
	}
		
	}
	
		
		
		
	}