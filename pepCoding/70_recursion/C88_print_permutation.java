
import java.util.Scanner;

public class C88_print_permutation
{
    public static void permutation(String str , String asf)
    { 
        if(str.length() == 0 ) 
        {
            System.out.println(asf);
            return ;
        }


         for(int i = 0 ; i<str.length(); i++)
         {
            char ch = str.charAt(i);
            String strl = str.substring(0,i);
            String strr = str.substring(i+1);
            String join = strl + strr;
            permutation(join , asf + ch);


         }
    }
    

    public static void main(String args[])
    {
       Scanner scn = new Scanner(System.in);

       String str = scn.nextLine();
       String asf = "";

       permutation(str,asf);
    }
}