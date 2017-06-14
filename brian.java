import java.util.*;
class brian
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int k=s.nextInt();
        int[] cost=new int[n];
        for(int i=0;i<n;i++)
        {
            cost[i]=s.nextInt();
        }
        int charge=s.nextInt();
        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i!=k)
            {
                sum+=cost[i];
            }
        }
        if((sum/2)-charge==0)
        {
            System.out.println("Bon Apetite");
        }
        else{
            System.out.println(charge-(sum/2));
        }
    }
}
