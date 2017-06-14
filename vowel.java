import java.util.*;
class vowel
{
    public static void main(String[] args)
    {
     Scanner s=new Scanner(System.in);
     char ch=s.next().charAt(0);
     if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
     {
         System.out.println("vowel");
     }
     else{
         System.out.println("consonant");
     }
    }
}
