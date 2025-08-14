import java.util.*;

public class C92_substring_palindrom
{
    static boolean palindrom(String str)
    {
        int i = 0 ;
        int j = str.length()-1;

        while(i<j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
                return false;
            }
            else
            {
                i++;
                j--;
            }
        }
        return true;
    }
    static void solution(String s)
    {
        for(int i = 0 ;i<s.length();i++)
        {
            for(int j = i+1 ;j<s.length();j++ )
            { 
                String str = s.substring(i,j);
                
                if(palindrom(str) == true) 
                {
                    System.out.println(str);
                }               
            }
        }
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        solution(s);

    }
}