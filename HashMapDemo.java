package PraticeProgram;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		HashMap map = new HashMap();
		
		map.put(1, "ABC");
		map.put(2, "DEF");
		map.put(3, "GHI");
		map.put(4, "LMN");
		map.put(5, "OPQ");
		
		System.out.println(map);
		
		
		Set s = map.entrySet();
		
		Iterator itr = s.iterator();
		
		while(itr.hasNext()){
			
			Map.Entry entry = (Entry) itr.next();
			System.out.println("Key :"+entry.getKey());
			System.out.println("Value :" +entry.getValue());
		}
	}

}
