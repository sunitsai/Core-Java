package PraticeProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListdemo {
	
	public static void main(String[] args) {
		
		ArrayList arr =  new ArrayList();
		
		arr.add(2);
		arr.add(10);
		arr.add("Hello");
		arr.add("Java Developer");
		arr.add('J');
		arr.add(2.5);
		arr.add(2);
		arr.add(2);
		
		
		
		System.out.println(arr);
		System.out.println("Size of ArrayList :"+arr.size());
		
		Iterator itr = arr.iterator();
		while(itr.hasNext()){
			
			Object obj = itr.next();
			System.out.println("Elements :"+obj);
		}
	}

}
