package conditionalStatements;

public class ElseIf1 {
	public static void main(String[] args) {
		if(false)
		{
			System.out.println("1st Condition is true");
		}
		else if(true)
		{
			System.out.println("2nd Condition");
		}
		else if(false)
		{
			System.out.println("3rd Condition");
		}
		else
		{
			System.out.println("Last/default condition");
		}
	}
}
