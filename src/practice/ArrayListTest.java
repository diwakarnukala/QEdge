package practice;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		List<String> s = new ArrayList<String>();
		s.add("Selenium");
		s.add("ETL");
		s.add("1234");
		System.out.println(s.size());
		for (int i=0; i<s.size(); i++)
		{
			System.out.println(s.get(i));
		}
		
	}

}
