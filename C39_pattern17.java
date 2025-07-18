import java.util.*;

public class C39_pattern17
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // int sp = n / 2;
        // int st = 1;

        // for(int i = 1; i <=n ;i++)
        // {
        //     for(int j = 1; j <=sp; j++)
            
        //         if(i == n/2 + 1){
        //             System.out.print("*\t");

        //         }else{
        
        //         System.out.print("\t");
        //     }

        //     for(int j = 1; j <= st; j++)
        //     {
        //         System.out.print("*\t");
        //     }
        //     for(int j = 1; j <= sp; j++)
        //     {
        //         System.out.print("\t");
        //     }

        //     if(i <= n / 2)
        //     {
        //         st++;
        //     }else{
        //         st--;
        //     }


        //     System.out.println();
        // }


        int sp = n/2;
        int st = 1;


        for(int i = 1;i<=n;i++)
        {
            if(i == n/2 + 1)
            {
                for(int j = 1 ;j<=n;j++)
                {
                    System.out.print("* ");
                }
                st--;
                
            }
            else 
            { 
                

                for(int j = 1 ;j<=sp;j++)
                {
                    System.out.print("  ");
                }

                for(int j = 1 ;j<=st;j++)
                {
                    System.out.print("* ");
                }


                if(i <= n/2)
                {
                    st++;
                }
                else{
                    st--;
                }
                
            }
            

            System.out.println();

        }

       
         
    }
}