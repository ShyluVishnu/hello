import java.util.*;
class alphabet
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     char ch=s.next().charAt(0);
     int k=(int)(ch);
     if(k>=65&&k<=90||k>=97&&k<=122)
     {
         System.out.println("alphabet");
     }
     else{
         System.out.println("not a alphabet");
     }
    }
}
