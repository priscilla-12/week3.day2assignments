package week3.day2assignments;
import java.util.LinkedHashSet;
import java.util.Set;


public class Paypal {
	public static void main(String[] args) {
		String value = "PayPal India";
		String text1 = value.toLowerCase();
		String text2 = text1.replaceAll("\\s", "");
		char[] Array = text1.toCharArray();
		Set<Character>uniqueset = new LinkedHashSet<Character>();
		Set<Character>duplicateset = new LinkedHashSet<Character>();
		for (char c : Array) {
			boolean add = uniqueset.add(c);
			if(add == false)
			{
				duplicateset.add(c);
			}
			
		}
System.out.println(" duplicates "+duplicateset);
uniqueset.removeAll(duplicateset);
System.out.println(" removal duplicates: "+uniqueset);
	}

 
}
