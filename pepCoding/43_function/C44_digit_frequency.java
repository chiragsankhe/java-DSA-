import java.util.*;

public class C44_digit_frequency
{

    static int getDigitFrequency(int n , int d)
    {
        int count = 0 ;

        while(n>0)
        {
            int last_digit = n%10;

            if(last_digit == d)
            {
                count++;
            }

            n= n/10;

        }

        return count ;


    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        
        int f = getDigitFrequency(n,d);
        System.out.println(f);
    }
    
    
}
