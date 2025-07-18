// import java.util.*;

// public class C11_prime_no
// {
//     public static void main(String args[])
//     {
//         Scanner scn= new Scanner(System.in);
//         int t = scn.nextInt();

//         for(int i = 1 ; i < t ; i++)
//         {
//             int n = scn.nextInt();
//             int count = 0;
//             for(int div = 1;div <= n; div++)
//             {
//                 if(n % div == 0)
//                 {
//                     count ++;
//                 }
//             }

//             if(count ==2)
//             {
//                 System.out.println("prime");
//             }
//             else{
//                 System.out.println("not prime");
//             }
//          }

//     }
// }


import java.util.*;

public class C11_prime_no
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int x= scn.nextInt();

        if(x == 2 || x == 3)
        {
            System.out.println("prime ");
        }
        else if{
            
        }
   
        int count = 0 ;
        (int i = 1 ; i<=x/2 ;i++)
        {
           
            if(x % i == 0)
            {
               count ++;
            }

            if(count == 2 )
            {
                System.out.println("its not prime no.");
                break;
            }
        }

        if(count <2 )
        {
            System.out.println("its prime no.");
        }

        

       


    }
}