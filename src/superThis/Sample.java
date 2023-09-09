package superThis;

public class Sample {
	int a;
	int b;
	public void setValues(int a, int b)// (10,20)
	{
		this.a=a; //Global a = local a
		this.b=b;
	}
	public static void main(String[] args) {
		Sample object = new Sample();
		object.setValues(10,20);
		System.out.println(object.a);
		System.out.println(object.b);
	}
}
