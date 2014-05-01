package sort;

import java.util.Arrays;

public class Mergesort2 extends Sort {
    static public int comp = 0;
    static public int[] sort(int[] A) {

        if(A.length == 1) return A;

        int mid = A.length/2;
        int[] A1 = Arrays.copyOfRange(A, 0, mid);
        int[] A2 = Arrays.copyOfRange(A, mid, A.length);

        return merge(sort(A1), sort(A2));
    }

    static private int[] merge(int[] A, int[] B){

        int i=0, j=0, n=A.length+B.length;
        int[] res = new int[n];

        for(int k=0; k<n; k++){
           if(i<A.length && j<B.length){
               if(A[i]<=B[j]){
                   comp++;
                   res[k] = A[i];
                   i++;
               }else{
                   res[k] = B[j];
                   j++;
               }
           } else if(i == A.length){
               for(;k<n;){
                   res[k] = B[j];
                   k++; j++;
               }
           }else{
               for(;k<n;){
                   res[k] = A[i];
                   k++; i++;
               }
           }
        }
        return res;
    }
}
