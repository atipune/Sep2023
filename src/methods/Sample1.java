package methods;

import logicalPrograms.Switch2Numbers;
import methodsDiffPackage.Sample3;

public class Sample1 {
	static int a=10;
	static int b=20;
	public static void main(String[] args) {
		System.out.println("Main method - Hi");
		staticRegularMethod();
		subtraction();
		addition();
		subtraction();
		multiplication();
		Sample2.staticRegularMethodFromDifferentClass();
		Sample3.staticRegularMethodDifferentPackage();
	}
	public static void staticRegularMethod()
	{
		System.out.println("Regular method - Hi");
	}
	public static void addition()
	{
		int sum=a+b;
		System.out.println("Sum of a & b ="+sum);
	}
	public static void subtraction()
	{
		int sub=a-b;
		System.out.println("subtraction of a & b ="+sub);
	}
	public static void multiplication()
	{
		int multi=a*b;
		System.out.println("Multiplication of a & b ="+multi);
	}
}
