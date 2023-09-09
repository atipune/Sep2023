package stringPackage;

public class Sample {
	public static void main(String[] args) {
		String a="Aspire"; //constant string pool area
		String b="Aspire";
		String c=new String("Aspire");
		String d=new String("Aspire");
		System.out.println(a==b); //true
		System.out.println(a==c); //false
		System.out.println(c==d); //false
		System.out.println(a.equals(b));	//true
		System.out.println(a.equals(c));	//true
		System.out.println(c.equals(d));	//true
	}
}
