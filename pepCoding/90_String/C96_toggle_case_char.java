import java.util.*;

public class C96_toggle_case_char
{
    static String toggle_case(String str)
    {
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0 ;i<sb.length();i++)
        {
          char ch = sb.charAt(i);

          if(ch >= 'a' && ch<= 'z')
          {
            char up = (char) ('A' + ch - 'a');
            sb.setCharAt(i,up);
          } 
          else
          {
             char low = (char) ('a' + ch - 'A');
            sb.setCharAt(i,low);
          }
        }

        return sb.toString();

    }
    public static void main(String args[])
    {
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       String result =  toggle_case(str);

       System.out.print(result);


       
    }
}