package collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class Class1 {

	public static void main(String[] args) {
		// uses array internally
		// initially 10 elements are allocated after that for every overflow it doubles
		// its size
		// 10, 20 , 40 , 80 like that
		// resizable array of objects, showing raw type warnings
		ArrayList words = new ArrayList(); // add Objects retrieve Objects
		words.add("1");
		words.add(2); // its asking to add Objects

		// resizable array of strings
		ArrayList<String> word2 = new ArrayList<String>();
		System.out.println(word2);

		// cant have resizable array of int - as int doesnot have class
		// Syntax error, insert "Dimensions" to complete ReferenceType
		// ArrayList<int> word2 = new ArrayList<int>();
		// System.out.println(word2);
		// same for float, only wrapper class is allowed, or interfaces

		// resizable array of numbers
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println(numbers);

		// LinkedList uses nodes internally, it keeps aDDIND NODES AT THE END
		LinkedList<Integer> numbers1 = new LinkedList<Integer>();
		System.out.println(numbers1);

		// linkedlists are better in handing data as when we delete first item in
		// arraylist all the elements need to go 1 step forward

		// but linkedlist is faster for manupulating data
		// arraylist faster for retrieveing data

		ArrayList<MyPojo> list = new ArrayList<MyPojo>();
		list.add(new MyPojo("ani", 7));
		MyPojo myPojo = new MyPojo("ani2", 8);
		list.add(myPojo);
		MyPojo myPojo1 = new MyPojo(); // invisible default constructor
		myPojo1.setFeild1("ani3");
		myPojo1.setFeild2(9);
		list.add(myPojo1);

		for (MyPojo z : list) {
			System.out.println(z);
		}

	}

}
