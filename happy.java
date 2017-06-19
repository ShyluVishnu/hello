import java.io.*;
import java.util.*;
class happy
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int sum=0;
        while(n!=0)
        {
            while(n!=0)
            {
             int m=n%10;
             sum+=m*m;
             n=n/10;
            }
            if(sum==1)
            {
                System.out.println("Happy");
                break;
            }
            else{
                n=sum;
                sum=0;
            }
        }
    }
}
