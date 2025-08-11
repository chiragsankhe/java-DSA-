import java.util.*;
public class C07_stuent_marks
{
    public static void main(String args[])
    {
       Scanner scn = new Scanner(System.in);
        int marks = scn.nextInt();
      

        if(marks  > 90){
            System.out.println("execullant");

        } else if(marks > 80){
            System.out.println("good");

         }
         else if(marks > 70){
            System.out.println("fair");

         }
         else if(marks > 60){
            System.out.println("meets expextion");

         }
         else if(marks > 50){
            System.out.println("below par");

         }
         else{
            System.out.println("fail");
         }
        
    }

         
  }
