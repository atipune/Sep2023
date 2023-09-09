package polymorphism.methodoverridding;

public class Child extends Parent{
	public Child() {}
	public void bunglow()	//parent & Child
	{
		System.out.println("Child Bunglow");
	}
	public void car()  //Child
	{
		System.out.println("Child car");
	}
	
}
