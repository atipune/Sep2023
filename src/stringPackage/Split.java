package stringPackage;

public class Split {
	public static void main(String[] args) {
		String s1="aspire Training Institute Pune";
		String[] sar = s1.split("");
		//{aspire,Training,Institute,Pune}
		System.out.println(sar[0]);
		System.out.println(sar[1]);
		System.out.println(sar[2]);
		System.out.println(sar[3]);
	}
}
