import java.util.*;

public class C16_reverse_no
{
    public static void main(String args [])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();

        int reverse = 0;

        while (n > 0)
        {
            int dig = n % 10;

            reverse = reverse * 10 + dig;
            n = n / 10;
        }

        System.out.println(reverse);

        

    }
}