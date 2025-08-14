import java.util.*;

public class C91_practice_string 
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        // String s1 = scn.next();
        // String s2 = scn.nextLine();

        String s = "chirag";
        // System.out.println(s.length());
        // char ch = s.charAt(5);
        // System.out.println(ch);

        // for(int i = 0 ;i<s.length();i++)
        // {
        //     char ch = s.charAt(i);
        //     System.out.println(ch);
        // }


        // String sb = s.substring(2);
        // String sb2 = s.substring(1,4);
        // String sb3 = s.substring();
        // System.out.println(sb3);

        String str = "chirag,prachi,pranjal,manoj,sankhe";
       String [] parts = str.split(",");

        for(int i = 0 ; i<parts.length;i++)
        {
            System.out.println(parts[i]);
        }

    
    }
}