package logicalLoops;
//*			1
//**		11
//***		111
//****		1111
//*****		11111
public class For5 {
	public static void main(String[] args) {
		int lines=5;
		for(int i=1; i<=lines; i++) //lines
		{				
			for(int j=1; j<=i; j++)	//stars
			{				 
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
