import java .util.*;

public class C09_user_input
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int M  =scn.nextInt();
        int S = scn.nextInt();
        int E = scn.nextInt();

        int T = M+S+E ;

         if(T > 24)
         {
            System.out.println(T +" you pass ");

         }
         else
            if(T == 24)
            {
            System.out.println("you just pass");

          }
         else if(24 < T &  T > 20){
            System.out.println("you will get extra marks");

         }
    }
}