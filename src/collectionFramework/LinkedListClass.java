package collectionFramework;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListClass {
	public static void main(String[] args) {
		System.out.println("Arraylist program running");
		LinkedList ll = new LinkedList();
		ll.add("Akshay"); //String
		ll.add("Arora"); //String
		ll.add('A'); //Char
		ll.add(9876543210L);
		ll.add(95.462); //float
		ll.add("Pune"); //String
		ll.add(411028); //int
		ll.add(null); //String
		ll.add(null); //String
		ll.add(true); //boolean
		ll.add("Akshay"); //String
		ll.add("Arora"); //String
		System.out.println(ll);
		ll.add(3,"Aspire");
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		System.out.println(ll.contains(95.4621));
		ll.set(4,"Hi"); //set=remove+add
		System.out.println(ll);
		System.out.println(ll.get(4));
		System.out.println("*****Print all Arraylist elements with for loop");
		for(int i=0;i<=ll.size()-1;i++)
		{
			System.out.print(ll.get(i)+", ");
		}
		System.out.println("\n*****Print all Arraylist elements with forEach loop");
		for( Object temp:ll)
		{
			System.out.print(temp+", ");
		}
		System.out.println("\n*****Iterator cursor*****");
		Iterator itr = ll.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println("\n*****ListIterator cursor*****");
		ListIterator litr = ll.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+", ");
		}
	}
}
