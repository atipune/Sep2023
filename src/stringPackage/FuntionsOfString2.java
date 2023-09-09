package stringPackage;

public class FuntionsOfString2 {
	public static void main(String[] args) {
		String s1="aspire";
		String s2="AsPire";
		String s3="aspire Pune";
		String s4="";
//		System.out.println(s3.contains(s1)); //true
//		System.out.println(s3.contains(s2.toLowerCase()));
//		System.out.println(s3.contains("Pune"));
//		System.out.println(s4.isEmpty());
//		System.out.println(s3.charAt(7));
//		System.out.println(s3.charAt(s3.length()-1));
		System.out.println(s3.indexOf('n'));
		System.out.println(s3.lastIndexOf('n'));
//		System.out.println(s3.startsWith("pune"));
//		System.out.println(s3.endsWith("aspire"));
		System.out.println(s3.substring(2)); //substring from given index to last index
		System.out.println(s3.substring(2,8)); //substring from given 1st index to before the given 2nd index
		String s5=s1+s2+s3;
		System.out.println(s5);
		System.out.println(s1.concat(s2).concat(s3));
		System.out.println(s3.replace("aspire",s2));
	}
}
