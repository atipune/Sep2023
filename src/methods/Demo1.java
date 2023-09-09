package methods;
//a name in java is called as identifier
//static --> you can call static But non static with object reference
//non static--> you can call static & non static
import methodsDiffPackage.Demo3;

public class Demo1 {
	public static void method1()
	{
		method4();
		System.out.println("Static method 1 : Same class");
	}
	public static void method4()
	{
		method5();
		System.out.println("Static method 4 : same class");
	}
	public static void method5()
	{
		System.out.println("Static method 5 : same class");
	}
	public void method6()	//non static or instance method
	{
		System.out.println("Non static method 6 : same class");
	}
	public static void main(String[] args) {
		method1(); 
		method1(); 
		Demo2.method2();
		Demo3.method3();
		//ClassName objectName= new ClassName();
		Demo1 object1= new Demo1();
		object1.method6();
		
		Demo2 object2=new Demo2();
		object2.method7();
		
		Demo3 object3=new Demo3();
		object3.method8();
		object3.method9();
	}
}
