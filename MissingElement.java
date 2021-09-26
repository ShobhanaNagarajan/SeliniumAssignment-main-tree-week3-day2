package week3day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<Integer>();
		al.add(1);
		al.add(2);		
		al.add(3);
		al.add(4);
	    al.add(5);
		al.add(7);
		al.add(8);
		Collections.sort(al);
		for(int i=1;i<=al.size();i++) {
			if(i != al.get(i-1)) {
				System.out.print("Missing Element is:"+i);	
				break;
			}
			
		}						

	}


	
		
		
	}


