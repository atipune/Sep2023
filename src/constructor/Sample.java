package constructor;

public class Sample {
	int a;		//0		//Non static data members (Variables & method) value assign
	boolean b;	//false
	char c;		//space
	float d;	//0.0
	short e;	//0
	String s;
	public static void main(String[] args) {
		Sample object= new Sample();
		//className objectname= new ConstructorName();
		
		object.method();
	}
	public void method()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(s);
	}
}
