package week3.day2;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class setreversecollection {
	
	public static void main(String[] args)
	{
		Set<String> set=new LinkedHashSet<>();
		
		
		{
			
			set.add("Red");
			set.add("Green");
			set.add("Blue");
			set.add("Yelolow");
			set.add("brown");
			
			List<String> l=new ArrayList<>();
			l.addAll(set);
			
			
	        
	        int size=l.size();
	        for(int i=size-1;i>=0;i--)
	        {
	        	String listvalues=l.get(i);
	        	System.out.println("The reverse list is:"+listvalues);
	        }
		}
			
		}
		
			

}
