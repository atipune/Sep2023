package conditionalStatements;
//login--> un, pwd, otp/captcha
public class NestedIf {
	public static void main(String[] args) {
		String un="ABC";
		String pwd="Abc@123";
		if(un=="ABC")
		{
			System.out.println("Username is correct");
			if(pwd=="Abc@123")
			{
				System.out.println("Password is correct");
				System.out.println("login successful");
			}
			else
			{
				System.out.println("Passowrd is wrong");
			}
		}
		else
		{
			System.out.println("username is wrong");
		}
	}
}
