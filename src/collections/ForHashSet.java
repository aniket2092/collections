package collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class ForHashSet {
	public static void main(String[] args) {
		HashSet<String> values = new HashSet<String>();
		values.add("df");
		values.add("df");
		values.add("df1");
		
		// Order is not maintained but can't keep duplicate values.
		for(String s: values) {
			System.out.println(s);
		}
		
		System.out.println("**************************************");
		// Order is maintained but can't keep duplicate values. 
		LinkedHashSet<String> values1 = new LinkedHashSet<String>();
		values1.add("df");
		values1.add("df");
		values1.add("d1f");
		
		// Order is maintained but can't keep duplicate values.
		for(String s: values1) {
			System.out.println(s);
		}
		
		
		HashSet<MyPojo> myPojoList = new HashSet<MyPojo>();
		myPojoList.add(new MyPojo("df1",1));
		myPojoList.add(new MyPojo("df2",2));
		myPojoList.add(new MyPojo("df3",3));
		myPojoList.add(new MyPojo("df1",1));
		
		// Order is not maintained but can't keep duplicate values.
		for(MyPojo s: myPojoList) {
			//it will not filter duplicates  as MyPojo is custom defined class
			// to get unique we need to override hashcode
			System.out.println(s);
		}
		MyPojo a = new MyPojo("df1",1);
		MyPojo b = new MyPojo("df1",1);
		System.out.println(a.hashCode());
		System.out.println(b.hashCode() );
		
		// but after overriding equals method both will become equal= field by field comparison
		System.out.println(a.equals(b));
		
	}

}
