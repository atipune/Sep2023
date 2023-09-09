package collectionFramework;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetClass {
	public static void main(String[] args) {
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.add("Akshay"); //String
		lhs.add("Arora"); //String
		lhs.add('A'); //Char
		lhs.add(9876543210L);
		lhs.add(95.462); //float
		lhs.add("Pune"); //String
		lhs.add(411028); //int
		lhs.add(null); //String
		lhs.add(null); //String
		lhs.add(null); //String
		lhs.add(true); //boolean
		lhs.add("Akshay"); //String
		lhs.add("Arora"); //String
		System.out.println(lhs);
		System.out.println(lhs.contains("Pune"));
		lhs.remove('A');
		System.out.println(lhs.size());
		System.out.println(lhs);
		System.out.println("*****ForEach loop*****");
		for(Object temp:lhs)
		{
			System.out.print(temp+", ");
		}
		System.out.println("\n*****Iterator cursor*****");
		Iterator itr = lhs.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
	}
}
