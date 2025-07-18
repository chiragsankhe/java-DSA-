import java .util.*;
public class C10_user_input_2
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter a number:");

        // taking input int and string
        int num = scn.nextInt();
        String name = scn.nextLine();{
            System.out.println("hello" +name);
      
        for(int i = 1; i <= 10; i++ )
        System.out.println(" table "+ num*i);

        
         }



    }
}