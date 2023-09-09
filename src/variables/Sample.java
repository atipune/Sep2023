package variables;
//Global Variables-inside class but not in any method
	//scope- can be used through out the class
//Local variables-Inside class also inside a method/loop
	//scope- only inside that block where it is declared
public class Sample {
	int a=10;		//global
	public void addition()
	{
		int b=20;	//local
		int sum=a+b+z;
		System.out.println(sum);
	}
	public void multipliation()
	{
		int c=30;	//local
		
		for(int i=1; i<=5;i++)	//local
		{
			int d=a+i;
		}
	//	int multi=a*c*b*i*z;
	}
	int z=50;	//global	
	public static void main(String[] args) {
		Sample object = new Sample();
		object.addition();
		object.multipliation();
		System.out.println(object.a);
	}
}
