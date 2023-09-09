package stringPackage;

public class ReverseTheString {
	public static void main(String[] args) {
		String s="Firstname MiddleName LastName";
		//LastName MiddleName Firstname -word reverse
		//emaNtsaL emaNelddiM emantsriF -character reverse
//		String[] sar = s.split(""); //{Firstname,MiddleName,LastName}
//		String rev="";
//		
//		for(int i=sar.length-1; i>=0; i--)
//		{
//			rev=rev+sar[i];
//		}
//		System.out.println(rev);
		StringBuffer sbf= new StringBuffer(s);
		sbf.reverse();
		System.out.println(sbf);
	}
}
