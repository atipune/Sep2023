package execptionHandling;

public class MultipleCatchBlocks {
	public static void main(String[] args) {
		int[] a= {1,2,6,4,8,9,2,0,61,5,80};
		int b=20;
		int div=0;
		try {
			div=b/a[17]; //20/0
		}
		catch(ArithmeticException e)
		{
			System.out.println("Dividing the number with zero");
		}
		catch(ArrayIndexOutOfBoundsException f)
		{
			System.out.println("Array index count is overflow");
		}
		catch(Exception h) //last catch block-Parent exception
		{
			System.out.println("Parent exception class");
		}
		finally 
		{
			System.out.println("Running from finally block");
		}
	
		System.out.println(div);
	}
}
