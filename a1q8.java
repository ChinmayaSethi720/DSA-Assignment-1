import java.util.Scanner;
public class a1q8 {

	public static void main(String[] args) {
		
		Dotproduct();		
	}

	private static void Dotproduct() 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int x= sc.nextInt();
		
		int a[]= {2,5,6,4,8,85};
		int b[]= {5,10,21,9,6,12};
		int c[]= new int[x];
		
		for(int i=0; i<x; i++)
		{
			c[i]= (int) (a[i]*b[i]);
		
		System.out.println(c[i]);
		}
	}

}
