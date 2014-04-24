package sort;

import java.util.Random;

public class Quicksort extends Sort{

    static public int[] sort(int[] A){
        return quicksort(A, 0, A.length-1);
    }

    private static int[] quicksort(int[] A, int start, int end) {
        if(end-start<=1) return A;
        int mid = partition(A,start, end);
        quicksort(A, start, mid);
        quicksort(A, mid, end);
        return A;
    }

    private static int partition(int[] A, int start, int end) {
        int pivot = A[start+new Random().nextInt(end-start)];
        int i = start-1, j = end+1;
        for(;;){
            do{j--;}while (A[j]>pivot);
            do{i++;}while (A[i]<pivot);
            if(i<j) swap(A, i, j);
            else return j;
        }
    }
}
