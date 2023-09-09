package stringPackage;

public class FunctionsOfString {
	public static void main(String[] args) {
		String s1="Aspire Pune";
		String s2="aspire";
		String s3="ASPIRE";
		System.out.println(s1.toUpperCase());
		System.out.println(s2.toUpperCase());
		System.out.println(s3.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s2.toLowerCase());
		System.out.println(s3.toLowerCase());
		System.out.println(s1.length());
		System.out.println(s2==s3); 		//false
		System.out.println(s2.equals(s3)); 	//false
		System.out.println(s2.equalsIgnoreCase(s3)); //true
	}
}
