import java.util.*;

public class C18_rotate_no
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        // take a any number
        int n =scn.nextInt();
        // k is  rorate no.

        int k = scn.nextInt();


        int temp = n;
        // Num Of Digit
        int nod = 0 ;

        while (temp > 0){
            temp = temp /10;
            nod ++;
        }

        k = k % nod;
        if(k < 0){
            k = k+nod;
        }

        int div = 1;
        int mult = 1;
       for(int i = 1; i <= nod; i++ ) 
        {
            if (i <= k)
            {
                div = div *10;

            }
            else{
                mult = mult * 10;

            }

            int q = n / div;
            int r = n % div;

            int rot = r * mult + q;
            System.out.println(rot);


        }



    }
}