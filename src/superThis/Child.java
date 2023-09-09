package superThis;

public class Child extends Parent{
	final int a=100;	//same class global -this.variablename
	int b=200;
	int d=40;
	
	public void addition()
	{
	//	z=100;
		int a=1000;
		int b=2000;
		int e=50;
		int sum=a+this.a+super.a;
		System.out.println(sum); //1110
		System.out.println(z);
	}
	public static void main(String[] args) {
		Child c= new Child();
		c.addition();
	}
}
