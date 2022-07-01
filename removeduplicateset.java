package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class removeduplicateset {
	
	public static void main(String[] args) {
		
		String text="We learn java in java session";
		
		String[] s=text.split(" ");
		
		int c =s.length;
		
		Set<String> removeset=new LinkedHashSet<String>();
		
		for(String var:s)
		{
			removeset.add(var);
		}
		System.out.println(removeset);
		
	}
	

}
