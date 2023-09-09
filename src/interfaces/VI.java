package interfaces;

public class VI implements Parent{
	public void calling() {
		System.out.println("1p/s calls");
	}
	public void sms() {
		System.out.println("50sms per day");
	}
	public void internet() {
		System.out.println("30GB per Month");
	}
	public void netflix()
	{
		System.out.println("Free subscription to netflix");
	}
}
