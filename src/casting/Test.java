package casting;

public class Test {
	public static void main(String[] args) {
		Parent p = new Parent();
		p.bunglow();	//p & c
		p.farm();		//p
		System.out.println(p.a); //10
		
		Child c= new Child();
		c.bunglow();	//p& C
		c.farm();		//p
		c.car();		//c
		System.out.println(c.a);	//20
		
		Parent pc=new Child();	//upcasting-method parent class and code-child class 
		pc.bunglow();
		pc.farm();
		pc.jwellary();
		System.out.println(pc.a);	//10 -parent
	}
}
