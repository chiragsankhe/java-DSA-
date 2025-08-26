import java.util.*;

public class C4_sprial_mat
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int m =scn.nextInt();
        int arr[][] = new int[n][m];
         for(int i = 0 ;i<n;i++)
            { for(int j = 0 ;j<m;j++)
                {
                arr[i][j] = scn.nextInt();
                }
            }

            int minr = 0;
            int minc = 0;
            int maxr = arr.length-1;
            int maxc = arr[0].length-1;

            // left wall = minc++
            // bottom wall = maxr--
            // right wall = maxc--
            // top wall = minr++


            while (true) { 
               
                // left wall
                for(int i = minr , j = minc; i<=maxr; i++)
                {
                    System.out.println(arr[i][j]);
                }
                minc++;

                 // bottom wall
                for(int i = maxr, j = minc; j<=maxc; j++)
                {
                    System.out.println(arr[i][j]);
                }
                maxr--;

                 // right wall
                for(int i = maxr , j = maxc; i>=minr; i--)
                {
                    System.out.println(arr[i][j]);
                }
                maxc--;

                 // left wall
                for(int i = minr , j = maxc; j>minc; j--)
                {
                    System.out.println(arr[i][j]);
                }
                minr++;

                
            }




    }
}