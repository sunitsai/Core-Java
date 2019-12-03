package collection_framework;

import java.util.HashMap;

public class HashMapDemo {

    public static void main(String[] args) {
        //put, get
        HashMap <Integer, String> customer = new HashMap<Integer, String>();
//        customer.put(key, value);
        customer.put(101, "Tops");
        customer.put(102, "Technologies");
        customer.put(103, "Java");

        System.out.println(customer.get(101));
        System.out.println(customer.get(102));
        System.out.println(customer.get(103));
    }

}
