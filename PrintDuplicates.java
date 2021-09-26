package week3.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer>numbers = new ArrayList<Integer>();
		Collections.addAll(numbers, 18,14,12,17,14,12,15,19,20);
		Set<Integer> s= new HashSet<Integer>();
		for(int duplicates:numbers) {
			if(!s.add(duplicates)) {
				System.out.println(duplicates);
			}
		}
	}

}
