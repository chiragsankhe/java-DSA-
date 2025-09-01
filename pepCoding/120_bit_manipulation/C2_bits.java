// set bit 
import java.util.*;

public class C2_bits{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = 5; //0101
        int pos = 1;
        int bitMask = 1<<pos;

       int newNumber = bitMask | n;
       System.out.println(newNumber);

    }
}