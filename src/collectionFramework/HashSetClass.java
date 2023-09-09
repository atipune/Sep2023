package collectionFramework;

import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetClass {
	public static void main(String[] args) {
		System.out.println("HashSet program running");
		HashSet hs = new HashSet();
		hs.add("Akshay"); //String
		hs.add("Arora"); //String
		hs.add('A'); //Char
		hs.add(9876543210L);
		hs.add(95.462); //float
		hs.add("Pune"); //String
		hs.add(411028); //int
		hs.add(null); //String
		hs.add(null); //String
		hs.add(null); //String
		hs.add(true); //boolean
		hs.add("Akshay"); //String
		hs.add("Arora"); //String
		System.out.println(hs);
		System.out.println(hs.contains("Pune"));
		hs.remove('A');
		System.out.println(hs.size());
		System.out.println(hs);
		System.out.println("*****ForEach Loop*****");
		for(Object temp:hs)
		{
			System.out.print(temp+", ");
		}
		System.out.println("\n*****Iterator cursor*****");
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
			
	}
}
