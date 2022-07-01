package week3.day2;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class pirntduplicates {
	
	public static void main(String[] args)
	
	{
		List<Integer> noList=new ArrayList<Integer>();
		noList.add(1);
		noList.add(12);
		noList.add(22);
		noList.add(1);
		noList.add(12);
		noList.add(34);
		noList.add(56);
		noList.add(22);
		noList.add(78);
		System.out.println("The value are;" +noList);
		
	HashSet<Integer> hdupeSet = new HashSet<>();
	HashSet<Integer> hvalueSet= new HashSet<>();
	
	for (Integer intf:noList)
	{
		if(!hdupeSet.add(intf))
			
		{
			hvalueSet.add(intf);
			
		}
	}
 	
	System.out.println("Duplicates value is"+hvalueSet);
		
		
		
	}

}
