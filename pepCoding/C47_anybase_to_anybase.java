import java.util.*;

public class C47_anybase_to_anybase
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int dn = decimalToanybase(n,b);
        System.out.println(dn);


    }
    public static int getValue(int n , int b1 ,int b2)
    {
        int dec =  anybaseToDecimal(n , b1);
        int dn = decimalToanybase(dec , b2);
        return dn;
    }


    public static int decimalToanybase( int n , int b)
    {
        int rv = 0;


        int p = 1 ;

        while(n > 0)
        {
            int dig = n % b;
            n = n/b;

            rv += dig * p;
            p = p *10;

        }
        return rv;
    }

    public static int anybaseToDecimal( int n , int b)
    {
        int rv = 0;


        int p = 1 ;

        while(n > 0)
        {
            int dig = n % 10;
            n = n/10;

            rv += dig * p;
            p = p *b;

        }
        return rv;
    }
}


