package execptionHandling;

public class Sample {
	public static void main(String[] args) {
		int a=0;
		int b=20;
		int div=0;
		try 
		{
		div=b/a; // risky code
		}
		catch(ArithmeticException e)
		{
			//alternate code
			System.out.println("Do not divide any number with zero");
		}
		System.out.println(b);
		System.out.println(div);
	}
	
}
