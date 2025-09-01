// get bit 
import java.util.*;

public class C1_bits{
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = 5; //0101
        int pos = 2;
        int bitMask = 1<<pos;

        if((bitMask & n) ==0 ){
            System.out.println("bit was zero") ;
        }
        else {
            System.out.println("bit was one");
        }

    }
}