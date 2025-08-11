import java.util.*;

 public class C71_dec
{
     static void print_decresing(int n )
    {
        if(n == 0) return;

        System.out.print(n + "\t");
        print_decresing(n-1);
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        print_decresing(n);
    }
}