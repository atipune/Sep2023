package polymorphism;

public class Child extends Parent{
	public void multiplication(int a)
	{
		int b=200;
		int multi=a*b;
		System.out.println(multi);
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.multiplication();
		c.multiplication(1000);
	}
}
