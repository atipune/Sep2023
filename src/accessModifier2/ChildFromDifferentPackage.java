package accessModifier2;

import accessModifier.Parent;

public class ChildFromDifferentPackage extends Parent{
	public static void main(String[] args) {
		Parent p =new Parent();
//		p.bunglow();	//private
//		p.farm();		//default
//		p.jwellary();	//protected
		p.car();		//public
		
		ChildFromDifferentPackage c= new ChildFromDifferentPackage();
//		c.bunglow();	//private
//		c.farm();		//default
		c.jwellary();	//protected
		c.car();		//public
	}
}
