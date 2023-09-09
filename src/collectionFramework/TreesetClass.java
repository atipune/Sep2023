package collectionFramework;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetClass {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		System.out.println(ts.isEmpty());
		ts.add(8651); //String
		ts.add(654872); //String
		ts.add(45); 
		ts.add(5451);
		ts.add(15);
		ts.add(54654); 
		ts.add(-21657); 
		ts.add(5451); 
		System.out.println(ts);
		System.out.println(ts.contains(5451));
		ts.remove(15);
		System.out.println(ts.size());
		System.out.println(ts);
		System.out.println("\n*****Iterator cursor*****");
		Iterator itr = ts.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+", ");
		}
	}
}
