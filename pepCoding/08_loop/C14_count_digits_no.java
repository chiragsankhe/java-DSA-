import java.util.*;

public class C14_count_digits_no
{
    public static void main(String args[])
    {
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();

     int digit_count = 0 ;

     while(n>0)
     {
         digit_count++;

        n = n/10;
     }

     System.out.println(digit_count);

   
   
    }

}