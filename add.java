import java.util.*;
class add
{
	public static void main(String[] as)
	{
	 Scanner s=new Scanner(System.in);
	 int n=s.nextInt();
	 int tar=s.nextInt();
	 int[] a=new int[n];
	 for(int i=0;i<n;i++)
	 {
	 	a[i]=s.nextInt();
	 }
	 for(int i=0;i<n;i++)
	 {
	 	for(int j=i+1;j<n;j++)
	 	{
	 		if(a[i]+a[j]==tar)
	 		{
	 			System.out.println(" "+a[i]);
	 			System.out.println(" "+a[j]);
	 		}
	 	}
	 }
	}
}
