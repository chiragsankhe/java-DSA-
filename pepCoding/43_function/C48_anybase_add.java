import java.util.*;

public class C48_anybase_add
{
   public static int getSum(int b , int n1 , int n2)
    {
        int rv = 0;

        int c = 0 ;
        int p = 1 ;

        while(n1>0 || n2>0 || c>0)
        {
            int n1_val = n1%10;
            int n2_val = n2%10;

            n1 = n1/10;
            n2 = n2/10;

            int d = n1_val  + n2_val + c;

            c = d/b;
            d = d%b;

            rv += d * p ;
            p = p*10; 
        }
        return rv;
    }


    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        

        int d = getSum(b, n1, n2);
        System.out.println(d);
    }
    
}


















