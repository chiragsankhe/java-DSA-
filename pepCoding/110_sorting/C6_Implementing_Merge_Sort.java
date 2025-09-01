import java.util.*;

public class C6_Implementing_Merge_Sort{
    public static void merge(int arr[],int left , int mid,int right){
        int n1 = mid -left +1;
        int n2 = right -mid;

        int L[] = new int[n1];
        int R[] = new int[n2];

        for(int i = 0 ;i<n1;i++){
            L[i]=arr[left+i];
        }

         for(int i = 0 ;i<n2;i++){
            R[i]=arr[mid+1+i];
        }

        int i = 0 ,j=0,k=left;

        while(i<n1 && j<n2){
            if(L[i]<=R[j]){
               arr[k++] = L[i++];
            }else
            {
                arr[k++] = R[j++];
            }
        }


        while(i<n1){arr[k++]= L[i++];}
        while(j<n2){arr[k++]= R[j++];}
    }
    public static void mergesort(int arr[],int left,int right){
        if(left<right){
            int mid = left +(right - left)/2;

            mergesort(arr,left,mid);
            mergesort(arr,mid+1,right);

            merge(arr,left,mid,right);
        }
    }
    public static void main(String args[]){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int arr[] = new int[n];

        for(int i = 0 ;i<n;i++)
        {
            arr[i] =scn.nextInt();
        }

        mergesort(arr,0,arr.length-1);

        for(int val:arr){
            System.out.print(val +" ");
        }
    }
}