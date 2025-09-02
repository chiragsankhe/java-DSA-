// clean bit 
import java.util.*;

public class C3_bits{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;
        
        int notBitMask = ~(bitMask);
       int newNumber = notBitMask & n;
       System.out.println(newNumber);

    }
}