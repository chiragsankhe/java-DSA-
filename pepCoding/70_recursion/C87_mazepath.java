import java.util.*;

public class C87_mazepath
{
    public static ArrayList<String> mazpath(int sr , int sc , int dr , int dc)
    {
        if(sr == dr && sc == dc ) {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }

         ArrayList<String> hpaths = new ArrayList<>();
         ArrayList<String> vpaths = new ArrayList<>();

         if(sc < dc)
         {
            hpaths = mazpath(sr , sc+1,dr,dc);
         }
         
          if(sr < dr)
         {
            vpaths = mazpath(sr+ 1, sc,dr,dc);
         }

         ArrayList<String> path = new ArrayList<>();

         for(String hpath : hpaths)
         {
            path.add("h" + hpath);
         }

          for(String vpath : vpaths)
         {
            path.add("v" + vpath);
         }


      return path;


    }
    public static void main(String args[])
    {

     Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
     ArrayList<String> result = mazpath(1, 1 , n , m);
      System.out.println(result); 
    }
}