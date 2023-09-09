package execptionHandling;

public class NestedTry {
	public static void main(String[] args) {
		int a=100;
		int b=20;
		int[] c= {-20,3,0,4};
		int div=0;
		int sum=0;
		try {
			sum=b+c[0];	
			try {
				div=a/sum;
			}
			catch(ArithmeticException ae){
				System.out.println("Div number with zero");
			}
		}
		catch(ArrayIndexOutOfBoundsException ai)
		{
			System.out.println("Array index out of capacity");
		}
	}
}
