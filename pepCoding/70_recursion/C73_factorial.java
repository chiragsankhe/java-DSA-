import java.util.*;

public class C73_factorial
{
    public static int factorial(int n )
    { 
        if(n == 1) return 1;
           
           int fac = n * factorial(n-1);
           return fac ;
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int res = factorial(n);
        System.out.print(res);
    }
}