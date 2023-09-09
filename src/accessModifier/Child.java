package accessModifier;

public class Child extends Parent{

	public static void main(String[] args) {
		Parent p =new Parent();
	//	p.bunglow();	//private
		p.farm();		//default
		p.jwellary();	//protected
		p.car();		//public
		
		Child c =new Child();
		//	c.bunglow();	//private
			c.farm();		//default
			c.jwellary();	//protected
			c.car();		//public
	}
}
