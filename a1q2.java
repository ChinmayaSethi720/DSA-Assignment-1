import java.util.Scanner;
public class a1q2 
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number greater than 2");
		int a = sc.nextInt();
		int sum=0;
		
		for(int p=a; p>=2; p=p/2)
		{
			sum+=1;
		}
		System.out.println(a+" is divided "+sum+" times by 2 to get a number less than 2");
		

	}

}
