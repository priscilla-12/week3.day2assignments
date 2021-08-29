package week3.day2assignments;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
  
public class SortUsingCollections {
	 
 
	 
	public static void main(String[] args) {
		ArrayList<String> str=new ArrayList<String>(); 
		str.add("Aspire systems");  
		str.add("cts");  
		str.add("wipro");  
		str.add("Hcl");  
		Collections.sort(str); 
		System.out.println(" Sorted  Array");
		System.out.println(str);
		
		Collections.reverse(str);
		System.out.println(" reversed order");
		System.out.println(str);
		int arrlength = str.size();
		System.out.println("arrlength :" + arrlength);
		
	 
		System.out.println(str);
		 
				str.get(0);
			
		for (int i = 0; i < arrlength; i++) {
			System.out.println(str.get(i));
		}
		System.out.println(str);
		}
		
 
		 
	 
		 
		 
		 
	}
