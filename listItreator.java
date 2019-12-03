package PraticeProgram;

import java.util.ArrayList;
import java.util.ListIterator;

public class listItreator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList arr = new ArrayList();

		arr.add(2);
		arr.add(10);
		arr.add("Hello");
		arr.add("Java Developer");
		arr.add('J');
		arr.add(2.5);
		arr.add(2);
		arr.add(2);

		System.out.println(arr);
		System.out.println("Size of ArrayList :" + arr.size());
		
		ListIterator itr = arr.listIterator();
		while(itr.hasNext()){
			
			Object obj = itr.next();
			itr.set(obj +"Tops");
		}
		
		
		System.out.println("After the modification");
		
		itr = arr.listIterator();
		
		while(itr.hasNext()){
			
			Object obj = itr.next();
			System.out.println("Ele :"+obj);
		}
		
		System.out.println("Reverse Order");
		while(itr.hasPrevious()){
			
			Object obj = itr.previous();
			System.out.println("Ele :" +obj);
		}

	}

}
