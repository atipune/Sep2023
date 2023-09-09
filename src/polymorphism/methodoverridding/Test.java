package polymorphism.methodoverridding;

public class Test {
	public static void main(String[] args) {
		Child c= new Child();
		c.bunglow();	//p&C   Child bunglow	
		c.farm();		//p 	Parent farm
		c.car();		//c		Child car
		c.jwellary();
	}
}
