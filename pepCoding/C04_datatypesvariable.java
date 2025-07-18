public class C04_datatypesvariable{
    public static void main(String args[]){
    
        // variable

        int x = 10;
        int y = 20;
        int z = 10;
        int sum = x+y+z ;
        int sub= x-y-z ;
        int mul = x*y*z ;
        int div = y/x ;
        int rem = y%x;
        // both are write
                // addition 
       System.out.println("sum of 3 value" +sum);
        System.out.println("sum of 3 value\n"+x+"and"+y+"and"+z+"is\n" +sum);

                //subration
        System.out.println("sub of 3 value\n " +sub);

                // multipication
                System.out.println("mul of 3 vakue\n " +mul);


                
                // division
                System.out.println("div of 3 vakue\n " +div);


                
                // remainder
                System.out.println("rem of 3 vakue\n " +rem);

                // exprestion 
                int exp = ((x*y)/(x+y));
                System.out.println("ans is :"+exp);
    }
} 