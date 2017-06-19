import java.io.*;
import java.util.*;
class rotation
{
    public static void main(String[] ardg)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int i=0;i<k;i++)
        {
            for(int j=n-1;j>0;j--)
            {
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }
        
    }
}
