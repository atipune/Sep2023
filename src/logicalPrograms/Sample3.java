package logicalPrograms;
//1
//23
//345
//4567
//56789
public class Sample3 {
	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(i+j-1);
			}
			System.out.println();
		}
	}
}
