import java.util.Scanner;
public class a1q4{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt()
				;
		String a[]=new String[n];
		
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextLine();		
		}
		
		for (int i=n-1; i>=0; i--)
		{
			System.out.println(a[i]);
		}
		
		
	}
	

}