import java .util.*;

public class C15_digits_of_no
{
    
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();

        //  number of digits( nod)

        int nod = 0;
        int temp = n;

        while (temp != 0)
        {
            temp = temp / 10;
            nod++;
        }

      
      
        System.out.println(nod);
 
    

    }
}