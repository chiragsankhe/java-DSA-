import java.util.*;

public class C35_pattern13
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int val = 1;

        for(int i = 1; i <= n; i++)
        {
            int icj = 1;
            for(int j = 1; j <= i; j++)
            {
                 System.out.print(icj + "\t");
                 int icjp1 = icj * (i - j) / (j + 1);
                 icj = icjp1;

                


            }
                System.out.println();

           
        }


    }


}