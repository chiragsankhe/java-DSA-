// import java .util.*;

// public class C12_all_prime_no{
//     public static void main(String args[])
//     {
//         Scanner scn= new Scanner(System.in);
//         int L = scn.nextInt();
//         int H = scn.nextInt();

//         for (int n = L; n <= H; n++)
//         {
//             int count=0; 
          
//             for( int div = 2; div * div <= n; div++)
//             {
//                 if(n % div == 0)
//                 {
//                     count ++;
//                     break;
//                 }
              
//             }
//             if(count == 0)
//             {
//                 System.out.println(n);
//             }
//         }
//     }
// }


import java .util.*;

public class C12_all_prime_no
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int l = scn.nextInt();
         int h = scn.nextInt();


         for(int i = l ;i<=h;i++)
         {

               if(i == l )
               {
                continue;
               }
            int count = 0 ;

            for(int j = 2 ;j * j  <= i;j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }

            if(count == 0)
            {
                System.out.println(i);
            }
         }
    }
}