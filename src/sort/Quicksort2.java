package sort;

import java.util.Random;

public class Quicksort2 extends Sort {
    static public long comp = 0;
    static public long comp1 = 0;

    static public int[] sort(int[] A){
        return quicksort(A, 0, A.length-1);
    }

    private static int[] quicksort(int[] A, int start, int end) {
        if(end-start<1) return A;
        int mid = partition(A,start, end);
        quicksort(A, start, mid);
        quicksort(A, mid+1, end);
        return A;
    }

    private static int partition(int[] A, int start, int end) {
        int index = start + new Random().nextInt(end-start);
        int pivot = A[index];
        int i = start, j = end;
        while(i<j){
            while(A[i] < pivot){
                i++;
                comp++;
//                if(comp1>1000) {comp++; comp1=0;}
            }
            while(A[j] > pivot){
                j--;
                comp++;
//                if(comp1>1000) {comp++; comp1=0;}
            }
            swap(A, i, j);
            //i++; j--;
        }
        return i;
    }
}
