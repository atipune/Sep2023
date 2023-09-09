package array;

public class MultiD {
	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3,4},{1,2,3,4,5}};
		//1 2 3
		//1 2 3 4
		//1 2 3 4 5
		System.out.println(a[2][4]); //5
		System.out.println(a.length); //3
		System.out.println(a[1].length); //4
		int[][] b= new int[2][3];
		//1 2 3
		//1 2 3
		b[0][0]=1;
		b[0][1]=2;
		b[0][2]=3;
		b[1][0]=1;
		b[1][1]=2;
		b[1][2]=3;
		for(int i=0; i<=a.length-1;i++)	//rows
		{
			for(int j=0; j<=a[i].length-1;j++) //columns
			{
				System.out.print(a[i][j]+", ");
			}
			System.out.println();
		}
	}
}
