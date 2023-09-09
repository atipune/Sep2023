package assignments;

public class Sample1 {
	public static void main(String[] args) {
		int min=100;
		int max=300;
		//evenNumbers(min,max);
		numberDivisibleBy5(min, max);
	}
	public static void evenNumbers(int i, int j) // i=min=10, j=max=15
	{
		for(int k=i; k<=j; k++)
		{
			if(k%2==0)
			{
				System.out.println(k);
			}
		}
	}
	public static void numberDivisibleBy5(int i, int j)
	{
		for(int k=i; k<=j; k++)
		{
			if(k%5==0)
			{
				System.out.println(k);
			}
		}
	}
}
