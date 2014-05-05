package sort;

import java.util.Random;

public class Quicksort extends Sort{

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
            while(A[i] < pivot) i++;
            while(A[j] > pivot) j--;
            swap(A, i, j);
        }
        return i;
    }
}
