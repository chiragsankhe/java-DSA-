import java.util.*;

public class C5_Exit_point
{
    public static void main(String args[])
    {
        Scanner scn = new Scanner(System.in);

        int n= scn.nextInt();
        int m =scn.nextInt();
        int arr[][] = new int[n][m];
         for(int i = 0 ;i<n;i++){ 
            for(int j = 0 ;j<m;j++){
                arr[i][j] = scn.nextInt();
                }
            }


            int dir = 0 ;  // 0 - e , 1 - s , 2 - w , 3 - n
            int i = 0 ; 
            int j = 0 ;

            while (true) { 
                dir = (dir + arr[i][j]) % 4;

                if(dir == 0) { // east
                    j++;
                }
                else if(dir == 1){ //south
                    i++;
                }else if(dir == 2){ //west
                    j--;
                }else if(dir == 3){ //north
                    i--;
                }

                 if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                 break;
            }else if(i==arr.length){
                i--;
                   break;
            }else if(j==arr[0].length){
                j--;
                      break;
            }
            }

            System.out.println(i);
            System.out.println(j);

           


    }

}    
