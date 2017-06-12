import java.util.*;
class Duplicates
{
	void remove(String str)
	{
		int len=str.length();
		LinkedHashSet<Character> l=new LinkedHashSet<>();
		for(int i=0;i<len;i++)
		{
			l.add(str.charAt(i));
		}
		for(Character ch:l)
		{
			System.out.print(ch);
		}
	}
	public static void main(String[] ar)
	{
		String s="sshhyllluvvisshnu";
		Duplicates d=new Duplicates();
		d.remove(s);
	}
}
