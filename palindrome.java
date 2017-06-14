import java.util.*;
class palindrome
{
    public static String Lpalindrome(final String st)
    {
        int r = 0, l = 0;
        String cp = "", p = "";
        for (int c = 1; c < st.length() - 1; c++) {
            l = c - 1;  r = c + 1;
            while (l>= 0 && r < st.length()) {
                if (st.charAt(l) != st.charAt(r)) {
                    break;
                }
                cp = st.substring(l, r + 1);
                p = cp.length() > p.length() ? cp : p;
                l--;  r++;
            }
        }
        return p;
    }
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String lp=Lpalindrome(str);
        System.out.println(lp);
    }
}
