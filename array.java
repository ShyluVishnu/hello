import java.util.*;
class array
{
	public static void main(String[] as)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int[] a=new int[n];
		int[] out=new int[n];
		int p;
		for(int i=0;i<n;i++)
		{
			a[i]=s.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			p=1;
			for(int j=0;j<n;j++)
			{
				if(i!=j)
				{
					p=p*a[j];
				}
			}
			out[i]=p;
		}
		for(int k=0;k<n;k++)
		{
			System.out.println(out[k]);
		}
		
	}
}
