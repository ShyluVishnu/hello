import java.io.*;
import java.util.*;
import java.lang.Math.*;
class average
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        int sum1=0,sum2=0,count=0,count2=0;
        for(int j=0;j<n;j++)
        {
            if(j<n/2)
            {
            sum1+=Math.abs(a[j]);
            count++;
            }
            else{
                sum2+=Math.abs(a[j]);
                count2++;
            }
        }
        sum1=sum1/count;
        sum2=sum2/count2;
        if(sum1==sum2)
        {
            System.out.println("Possible");
        }
        else{
            System.out.println("Not Possible");
        }
    }
}
