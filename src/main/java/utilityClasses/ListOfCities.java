package utilityClasses;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListOfCities 
{
	public static void main(String[] args) 
	{
		java.util.List<String> l =new ArrayList<String>();
		
		l.add("Mumbai");
		l.add("Pune");
		l.add("Nagpur");
		l.add("Delhi");
		l.add("Bangalore");
		l.add("Chennai");
		l.add("Kolkata");
		
		System.out.println(l);
		
		List<String> newList = new ArrayList<String>();
		Iterator itr =l.iterator();
		
		while(itr.hasNext())
		{
			String a=(String) (itr.next());
			
			String b= a.replaceAll("[aeiou]", ""); 
			
			newList.add(b);
		}
		System.out.println(newList);
		
		
		
	}

}
