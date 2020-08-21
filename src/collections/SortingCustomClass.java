package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class SortingCustomClass {

	public static void main(String[] args) {
		HashSet<MyPojo> myPojoList = new HashSet<MyPojo>();
		myPojoList.add(new MyPojo("df1", 1));
		myPojoList.add(new MyPojo("df2", 2));
		myPojoList.add(new MyPojo("df3", 3));
		myPojoList.add(new MyPojo("df1", 1));

		ArrayList<MyPojo> list = new ArrayList<MyPojo>(myPojoList);
		// not working
		//The method sort(List<T>) in the type Collections is not applicable for the arguments (ArrayList<MyPojo>)
		//Collections.sort(list); coz we need a way to compare custom class object
		
		// to do this MyPojo needs to implement Comparable.
		
		// overriding compareTo method
		Collections.sort(list); 
		System.out.println(list);
	}
}