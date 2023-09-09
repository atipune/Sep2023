package conditionalStatements;
//Pune to Banglore
public class ElseIf2 {
	public static void main(String[] args) {
		int money=1500;
		if(money>=2000)//flight
		{
			System.out.println("I can travel with flight");
		}
		else if(money>=1000)
		{
			System.out.println("I can travel with bus");
		}
		else if(money>=200)
		{
			System.out.println("I can travel with train");
		}
		else
		{
			System.out.println("I can not travel due to less amount");
		}
	}
}
