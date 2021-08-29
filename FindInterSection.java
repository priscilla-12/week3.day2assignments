package week3.day2assignments;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class FindInterSection {
	public static void main(String[] args) {
		int Array1[] = {5,6,9,2,3};
	    int Array2[] = {9,2,6,4,1};
	    Arrays.sort(Array1);
        Arrays.sort(Array2);
        List<Integer> A1= new ArrayList<Integer>();
        for (int i = 0; i < Array1.length; i++) {
            for (int j = 0; j < Array2.length; j++) {
                if (Array1[i]==Array2[j]) {
                    A1.add(Array1[i]);
                }
            }
        }
        System.out.println("Intersection elements : "+A1);
	 
}
}
