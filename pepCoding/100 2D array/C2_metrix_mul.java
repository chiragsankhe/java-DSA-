import java.util.*;

public class C2_metrix_mul
{
    static void  mat_mul(int mat1[][] , int mat2[][])
    {  int n = mat1.length;
       int m = mat2[0].length;
       int c = mat1[0].length;
        int mul[][] = new int[n][m];

        for(int i = 0 ;i<n;i++)
        {
            for(int j = 0; j<m;j++)
            {
                for(int k = 0 ;k<c;k++)
                {
                   mul[i][j] += mat1[i][k] * mat2[k][j];

                }
            }

        }



         for(int i = 0 ;i<mul.length;i++)
        {
            for(int j = 0 ;j<mul[0].length;j++)
            {
                System.out.print(mul[i][j] +" ");
            }
            System.out.println();
        }



        
    }
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);
        // matrix 1 
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int mat1[][] = new int[n1][m1];
        for(int i = 0 ;i<n1;i++)
        {
            for(int j = 0 ;j<m1;j++)
            {
            mat1[i][j] = scn.nextInt();
            }
        }

        // matrix 2
        int n2 = scn.nextInt();
        int m2 = scn.nextInt();
        int mat2[][] = new int[n2][m2];
        for(int i = 0 ;i<n2;i++)
        {
            for(int j = 0 ;j<m2;j++)
            {
            mat2[i][j] = scn.nextInt();
            }
        }


        if(mat1[0].length != mat2.length)
        {
            System.out.print("Invalid");
        }
        else{
             mat_mul(mat1,mat2);
        }

    }
}