package logicalLoops;
//print numebrs from 1 to 100 which is divible by 2 & 3
public class For4 {
	public static void main(String[] args) {
		for(int i=1; i<=100; i++)
		{
			if(i%2==0 && i%3==0)
			{
				System.out.println(i);
			}
		}
	}
}
