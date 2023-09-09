package casting;

public class PrimitiveCasting {
	public static void main(String[] args) {
//		byte a=10;	//-128 to +127
//		short b=20;
//		int sum=a+b;
//		int c=a;
//		float d=c;
//		System.out.println(d);
		int i=130;
		byte j=(byte)i;
		System.out.println(j);
		float p=154.56465f;
		int q=(int)p;
		System.out.println(q);
	}
}
