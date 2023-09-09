package oops.HirarchicalInheritence;

public class Test {
	public static void main(String[] args) {
		Parent p= new Parent();
		p.bunglow();
		p.car();
		Child1 c1=new Child1();
		c1.smartphone();
		c1.bike();
		c1.bunglow();
		c1.car();
		Child2 c2= new Child2();
		c2.smartphone();
		c2.bicycle();
		c2.bunglow();
		c2.car();
		Child3 c3= new Child3();
		c3.smartphone();
		c3.scooter();
		c3.bunglow();
		c3.car();
	}
}
