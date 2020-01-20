import java.util.Scanner;
public class a1q7 {

	public static void main(String[] args) {
		int x[]= {2,3,5,8,7};
		int n = 5;
		findDistinctProduct(x, n);
	}

	private static void findDistinctProduct(int[] x, int n) {
		// TODO Auto-generated method stub
		{
			for(int i=0; i<n; i++)
			{
				for(int j=i+1; j<n; j++)
				{
					if(x[i]!=x[j])
					{
						if((x[i]*x[j])%2!=0)
						{
							System.out.println(x[i]+" "+x[j]);
						}
					}
				}
			}
			
		}
	}}
