import java.util.*;
class removevowel
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        String str=s.nextLine();
        int count=0;
        char[] ch=str.toCharArray();
        for(int c=str.length()-1;c>=0;c--)
        {
            sb.append(ch[c]);
        }
        System.out.println(sb);
        String str2=sb.toString();
        char[] ch1=str2.toCharArray();
        for(int c=0;c<str.length();c++)
        {
            if(ch1[c]=='a'||ch1[c]=='e'||ch1[c]=='i'||ch1[c]=='o'||ch1[c]=='u')
            {
                count++;
            }
            else{
             sb1.append(ch1[c]);   
            }
        }
        System.out.println(sb1);
    }
}
