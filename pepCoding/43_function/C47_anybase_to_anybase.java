import java.util.*;

public class C47_anybase_to_anybase
{ 
    static int decimaltoanybase (int n , int b)
    {
        int rv= 0;

        int p = 1 ;

        while(n>0)
        {
            int digit = n%10;
            n = n / 10;

            rv += digit*p;

            p = p*2;
        }
        return rv;
    }


    static int getValueInDecimal(int n , int b)
    {
        int rv= 0;
        int p = 1 ;

        while(n>0)
        {
            int digit = n%b;
            n = n / b;
            rv +=  digit * p;
            p = p *10;
        }
        return rv;
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int b = scn.nextInt();
        int b2 = scn.nextInt();

        int dn = getValueInDecimal(n,b);
        int da = decimaltoanybase(dn,b2);
        System.out.println(da);
    }
}