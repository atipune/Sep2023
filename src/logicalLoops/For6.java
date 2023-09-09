package logicalLoops;
//1			1
//12		23
//123		345
//1234		4567
//12345		56789
public class For6 {
	public static void main(String[] args) {
		int lines=5;
		for(int i=1; i<=lines; i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			
			System.out.println();
		}
	}
}
