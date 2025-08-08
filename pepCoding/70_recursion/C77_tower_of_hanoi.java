import java.util.*;

public class C77_tower_of_hanoi
{
    public static void toh(int n , int start , int end , int help)
    {
        if(n == 0 ) return;

        toh(n-1 , start , help , end);
        System.out.println(n + "{" + start + "}" + "->" + "{" + end + "}");
        toh(n-1 , help ,end , start);
    }

    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int t1id = scn.nextInt();
        int t2id = scn.nextInt();
        int t3id = scn.nextInt();

        toh(n , t1id , t2id ,t3id);

    }
}