import java.util.*;

public class C17_inverse_no
{
    public static void main(String args [])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int inv = 0;
        int op = 1;

        while( n != 0)
        {
            int od = n % 10;
            int id = op;
            int ip = od;


        //  change the inv using ip and id
        inv = inv + id *(int)Math.pow(10, ip * 1 );

        n = n / 10;
        op++; 
        }
        System.out.println(inv);
    }
}