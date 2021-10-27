package week3day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Arrays;

public class SortingusingCollection {

	public static void main(String[] args) {
		
    String[] company= {"HCL","Wipro","Aspire System","CTS"};
    List<String> companyList = new ArrayList<String>();
    companyList.addAll(Arrays.asList(company));
    
    Collections.sort(companyList);
    System.out.println("Sorted Output");
    System.out.println(companyList);
    
    Collections.reverse(companyList);
    System.out.println("Reverse Output");
    System.out.println(companyList);
    
	}

}
