import java.util.*;

public class C36_pattern14
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        for( int i = 1; i <= 10; i++){
            int v = n * i;
            System.out.println(n + "*" + i + "=" + v );
        }
    }
}