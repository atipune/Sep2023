package polymorphism;

public class Sample {
	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=30;
		Sample object = new Sample();
		object.addition(a,b);
		object.addition(100,200);
		object.addition(100,200,300);
	}
	public void addition(int a, int b) //2 variable addition
	{
		int sum=a+b;
		System.out.println(sum);
	}
	public void addition(int a, int b, int c) //3 variables
	{
		int sum=a+b+c;
		System.out.println(sum);
	}
	public void addition()
	{
		
	}
	public static void addition(char a)
	{
		
	}
	public void addition(int a, boolean b)
	{
		
	}
	public void addition(boolean b, int a)
	{
		
	}
}
