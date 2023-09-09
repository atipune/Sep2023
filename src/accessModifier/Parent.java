package accessModifier;

public class Parent {
	private void bunglow()
	{
		System.out.println("Parent bunglow");
	}
	void farm()	//default
	{
		System.out.println("Parent farm");
	}
	protected void jwellary()
	{
		System.out.println("Parent jwellary");
	}
	public void car()
	{
		System.out.println("Parent car");
	}
	public static void main(String[] args) {
		Parent p =new Parent();
		p.bunglow();	//private
		p.farm();		//default
		p.jwellary();	//protected
		p.car();		//public
	}
}
