import java.util.*;

public class C32_pattern10
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int ot = n / 2; //Outer space
        int in = -1;   // Inere space



        for(int i = 1 ; i <= n; i++){

            for(int j = 1; j <= ot; j++){
                System.out.print("\t");
            }
            System.out.print("*\t");

            for(int j = 1; j <= in; j++){
                System.out.print("\t");
            }

            if(i < n && i > 1){
                System.out.print("*\t");
            }
              if( i <= n / 2){
                
                    
                    ot--;
                    in += 2;

                }   
                else{

                

                    ot++;
                    in -= 2;



              

                }
                System.out.println("");
            

        }


   
    }
    }
