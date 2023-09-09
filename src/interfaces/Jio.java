package interfaces;

public class Jio implements Parent,Parent2  {
	static int a=10;
	
	public void calling() {
		System.out.println("Unlimited calling");
	}
	public void sms() {
		System.out.println("100 SMS per day");
	}
	public void internet() {
		System.out.println("Daily 1.5GB");
	}
	public void hotstar()
	{
		System.out.println("Free subscription for Hotstar");
	}
	public void demo() {
		
	}
}
