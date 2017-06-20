import java.util.*;

public class binary
{
public static void main(String[] args) 
{
	Scanner s=new Scanner(System.in);
	int k=s.nextInt();
	int len=(int) Math.pow(2,k);
	for(int i=0;i<len;i++)
	{
	System.out.println(Integer.toBinaryString(i));
	}
}
}
