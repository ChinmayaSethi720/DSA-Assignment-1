import java.util.Scanner;
public class a1q6 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);

			int n=sc.nextInt();
			int a[]=new int[n];
			
			for(int j=0;j<=a.length;j++) 
			{
				a[j]=sc.nextInt();
			}
			int max=a[0];
			int min=a[0];
			
			for(int i=1;i<=a.length;i++)
			{
				if (a[i]>max)
					max=a[i];
			}
			for(int j=1;j<=a.length;j++) 
			{
			if(a[j]<min)
				min=a[j];
			}

}
	}
