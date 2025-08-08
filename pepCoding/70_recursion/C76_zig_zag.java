import java.util.*;

public class C76_zig_zag
{
    public static void zig_zag(int n  )
    {
        if(n == 0) return;
        System.out.println("pre" + n);
        zig_zag(n-1);
        System.out.println("in" + n);
        zig_zag(n-1);
        System.out.println("post" + n);
        

    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();


        zig_zag(n);
    }
}