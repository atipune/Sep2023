package collectionFramework;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorClass {
	public static void main(String[] args) {
		System.out.println("Arraylist program running");
		Vector v = new Vector();
		v.add("Akshay"); //String
		v.add("Arora"); //String
		v.add('A'); //Char
		v.add(9876543210L);
		v.add(95.462); //float
		v.add("Pune"); //String
		v.add(411028); //int
		v.add(null); //String
		v.add(null); //String
		v.add(true); //boolean
		v.add("Akshay"); //String
		v.add("Arora"); //String
		System.out.println(v);
		v.add(3,"Aspire");
		System.out.println(v);
		v.remove(3);
		System.out.println(v);
		System.out.println(v.contains(95.4621));
		v.set(4,"Hi"); //set=remove+add
		System.out.println(v);
		System.out.println(v.get(4));
		System.out.println("*****Print all Arraylist elements with for loop");
		for(int i=0;i<=v.size()-1;i++)
		{
			System.out.print(v.get(i)+", ");
		}
		System.out.println("\n*****Print all Arraylist elements with forEach loop");
		for( Object temp:v)
		{
			System.out.print(temp+", ");
		}
		System.out.println("\n*****Iterator cursor*****");
		Iterator itr = v.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
		System.out.println("\n*****ListIterator cursor*****");
		ListIterator litr = v.listIterator();
		while(litr.hasNext())
		{
			System.out.print(litr.next()+", ");
		}
	}
}
