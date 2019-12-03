
package PraticeProgram;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		HashSet hs = new HashSet();
		
		hs.add(10);
		hs.add("tops");
		hs.add('t');
		hs.add(10.1);
		hs.add(true);
		hs.add(null);
		hs.add(10);
		
		System.out.println(hs);
		System.out.println("Size :"+hs.size());
		
		
		Iterator itr = hs.iterator();
		
		while(itr.hasNext()){
			
			Object obj = itr.next();
			System.out.println("Ele :" +obj);
		}
	
		
		
	}

}
