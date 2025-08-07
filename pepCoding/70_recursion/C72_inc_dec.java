import java.util.*;

 public class C72_inc_dec
{
     static void print_inc_dec(int n )
    {
        if(n == 0) return;

        System.out.print(n + "\t");
        print_inc_dec(n-1);
        System.out.print(n + "\t");
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        print_inc_dec(n);
    }
}