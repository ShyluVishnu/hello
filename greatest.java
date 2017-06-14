import java.util.*;
class greatest
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     int a=s.nextInt();
     int b=s.nextInt();
     int c=s.nextInt();
     int great=(a > b ? ( a > c ? a : c) : (b > c ? b : c));
     System.out.println(great);
    }
}
