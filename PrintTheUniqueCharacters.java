package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintTheUniqueCharacters {

	public static void main(String[] args) {
		String str ="amma123";
		char[] charArray = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		for(int i=0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}
		System.out.println(charSet);
			
			
		}
	}


