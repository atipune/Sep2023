package logicalLoops;
//print 50 to 1
public class Do_While1 {
	public static void main(String[] args) {
		int i=50;	//initialization
		do
		{
			System.out.println(i);	//body
			i--;					//increment/decrement
		}
		while(i>=0);				//condition
	}
}
