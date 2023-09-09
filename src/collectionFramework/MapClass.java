package collectionFramework;

import java.util.HashMap;

public class MapClass {
	public static void main(String[] args) {
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		hm.put(1, "Akshay");
		hm.put(4, "Ashwini");	//duplicate value-allowed
		hm.put(2, "Ashwini");
		hm.put(3, "Pooja");
		System.out.println(hm);
		hm.put(3, "Sachin");	//duplicate key-not allowed
		
		System.out.println(hm);
		System.out.println(hm.get(3));
		System.out.println(hm.size());
		System.out.println(hm.containsKey(2));
		System.out.println(hm.containsValue("Akshay"));
		System.out.println("*****For loop*****");
		for(int i=1; i<=hm.size();i++)
		{
			System.out.print(hm.get(i)+", ");
		}
	}
}
