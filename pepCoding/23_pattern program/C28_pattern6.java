// import java.util.*;

// public class C28_pattern6
// {
//     public static void main(String args[])
//     {
//         Scanner scn = new Scanner(System.in);
//         int n = scn.nextInt();


//         int st= n/ 2 + 1;
//         int sp = 1 ;

//         for(int i = 1; i <= n; i++)
//         {
//             for(int j = 1; j <= st; j++)
//             {
//                 System.out.print("*\t");
//             }
//             for(int j = 1; j <= sp; j++)
//             {
//                 System.out.print("\t");
//             }
//               for(int j = 1; j <= st; j++)
//             {
//                 System.out.print("*\t");
//             }

//             if(i <= n/2){
//                 st--;
//                 sp += 2;
//             }
//             else{
//                 st++;
//                 sp -= 2;
//             }

//             System.out.println();
//         }
//     }
// }


import java.util.*;

public class C28_pattern6
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int st = n/2 +1 ;
        int sp = 1;



        for(int i = 1 ;i<=n;i++)
        {
            // star 
            for(int j = 1;j<=st;j++ )
            {
                System.out.print("*\t");
            }

            for(int j = 1 ;j<=sp ;j++ )
            {
                System.out.print("\t");
            }

            for(int j = 1;j<=st;j++ )
            {
                System.out.print("*\t");
            }


            if(i <=n/2)
            {
                st--;
                sp += 2;

            }
            else 
            {
                st++;
                sp -= 2;
            }

            System.out.println();
        }
    }
}