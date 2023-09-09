package finalKeyword;

public class Parent {	//final for class- class can not be used for inheritance as Parent class
	int a=124;
	final int b=121;	//final for variable-value can't be changed later on
	public void m1()
	{
		a=20;
		//b=20;
		System.out.println("Parent m1");
	}
	final public void m2()	//final for method - method can't be override 
	{
		System.out.println("m1");
	}
}
