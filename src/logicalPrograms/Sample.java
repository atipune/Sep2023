package logicalPrograms;
//    *
//   **
//  ***
// ****
//*****
//lines=5; stars=5; space=4
public class Sample {
	public static void main(String[] args) {
		int lines=5;
		for(int i=1; i<=lines; i++)
		{
			//space
			for(int j=4; j>=i; j--)
			{
				System.out.print(" ");
			}
			//star
			for(int k=1; k<=i; k++) 
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
	}
}
