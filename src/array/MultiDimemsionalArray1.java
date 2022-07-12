package array;

public class MultiDimemsionalArray1 {

	public static void main(String[] args) {
		
		int a [][]= {{1,2,3,7},{4,5,6,9}};
		
		for(int i=0;i<=1;i++) 
		{
			for(int j=0;j<=3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
