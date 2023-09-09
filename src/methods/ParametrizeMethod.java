package methods;

public class ParametrizeMethod {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c = addition(2,3);
		System.out.println(c);
		int d = multiplication(a,c);
		System.out.println(d);
	}
	public static int addition(int i, int j)	
	{
		int sum=i+j;	//2+3
		return sum;		//5
	}
	public static int multiplication(int p, int q)
	{
		int multi=p*q;
		return multi;
	}
}
