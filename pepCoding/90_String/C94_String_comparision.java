import java.util.*;

public class C94_String_comparision
{
    public static String comparison1(String str)
    {
        String s = ""+ str.charAt(0);

        for(int i = 1 ;i<str.length();i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
           if(curr != prev)
           {
             s += curr;
           }
        }

        return s;
    }
    

     public static String comparison2(String str){

        if(str.length() == 0 ) return"";

        int count = 0 ;
        String s2 ="" + str.charAt(0);
        char prev = str.charAt(0);

        for(int i = 1 ;i<str.length();i++)
        {
            char curr= str.charAt(i);

            if(curr == prev)
            {
                count++;
            }
            else if(curr != prev)
            {
                if(count < 1)
                {
                    s2 += curr;
                   count = 0 ;
                   prev = curr;

                }
                else
                {
                    count +=1;
                    s2 +=count;
                    count = 0;
                    s2 +=curr;
                    prev = curr;
                }
            }
        }

        return s2;

     }

    public static void main(String args[])
    {
        Scanner scn = new Scanner (System.in);
        String str = scn.nextLine();
        System.out.println(comparison1(str));
        System.out.println(comparison2(str));
       
    }
}