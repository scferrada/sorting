package sort;

public class Sort {

    static protected void swap(int[] A, int i, int j){
        A[i] += A[j];
        A[j] = A[i] - A[j];
        A[i] = A[i] - A[j];
    }
}
