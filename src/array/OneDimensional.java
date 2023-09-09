package array;

public class OneDimensional {
	public static void main(String[] args) {
		int[] a= {4,6,7,1,8,9,1,5,4,7,6,2};
		System.out.println(a[0]); //4
		System.out.println(a[3]); //1
		System.out.println(a.length);
		System.out.println(a[a.length-1]);
		int[] b=new int[6];
		b[0]=2;
		b[1]=5;
		b[2]=7;
		b[3]=4;
		b[4]=6;
		b[5]=8;
		for(int i=0; i<=b.length-1;i++)
		{
		System.out.print(b[i]+", ");
		}
		System.out.println();
		for(int j=0; j<=a.length-1;j++)
		{
			System.out.print(a[j]+", ");
		}
	}
}
