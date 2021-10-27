package week3day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "PayPal India";
		char[] charArray = str.toCharArray();
		Set<Character> charSet = new LinkedHashSet<Character>();
		Set<Character> dupCharSet = new LinkedHashSet<Character>();
		for (int i = 0; i < charArray.length; i++) {
			charSet.add(charArray[i]);
		}
		for (int j = 0; j < charArray.length; j++) {
			char c = charArray[j];
			for (int k = 0; k < charArray.length; k++) {
				char ch = charArray[k];
				if (ch == c)
					dupCharSet.add(c);

			}
		}
		System.out.println(dupCharSet);
		for (Character character : dupCharSet) {
			if (character == ' ')
				continue;
			System.out.print(character);

	}

}
}
