package collectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListClass {
	public static void main(String[] args) {
		System.out.println("Arraylist program running");
		ArrayList al = new ArrayList();
		al.add("Akshay"); //String
		al.add("Arora"); //String
		al.add('A'); //Char
		al.add(9876543210L);
		al.add(95.462); //float
		al.add("Pune"); //String
		al.add(411028); //int
		al.add(null); //String
		al.add(null); //String
		al.add(true); //boolean
		al.add("Akshay"); //String
		al.add("Arora"); //String
		System.out.println(al);
		al.add(3,"Aspire");
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
		System.out.println(al.contains(95.4621));
		al.set(4,"Hi"); //set=remove+add
		System.out.println(al);
		System.out.println(al.get(4));
		System.out.println("*****Print all Arraylist elements with for loop");
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i)+", ");
		}
		System.out.println("\n*****Print all Arraylist elements with forEach loop");
		for( Object temp:al)
		{
			System.out.print(temp+", ");
		}
		System.out.println("\n*****Iterator cursor*****");
		Iterator itr = al.iterator();
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.hasNext());
//		itr.remove();
//		System.out.println(al);
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println("\n*****ListIterator cursor*****");
		ListIterator litr = al.listIterator();
//		System.out.println(litr.next());
//		System.out.println(litr.next());
//		System.out.println(litr.next());
//		System.out.println(litr.hasNext());
//		System.out.println(litr.previous());
//		System.out.println(litr.previous());
//		System.out.println(litr.hasPrevious());
//		System.out.println(litr.previous());
//		litr.remove();
//		System.out.println(al);
		while(litr.hasNext())
		{
			System.out.print(litr.next()+", ");
		}
	}
}
