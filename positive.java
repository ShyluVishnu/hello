import java.io.*;
import java.util.*;
class positive
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n==0)
{
System.out.println("Zero");
}
else if(n>=1)
{
System.out.println("positive");
}
else{
System.out.println("negative");
}
}
}
