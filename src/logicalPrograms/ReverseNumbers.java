package logicalPrograms;

public class ReverseNumbers {
	public static void main(String[] args) {
		int num=545487;	//486/10=48 6		48/10=4 8
		int rev=0;		//6*10=60+8=68*10+4=684
		while(num>0)
		{
			int rem=num%10;	//6		8		4
			num=num/10;		//48
			rev=rev*10+rem;
		}
		System.out.println(rev);
	}
}
