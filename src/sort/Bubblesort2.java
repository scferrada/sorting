package sort;

public class Bubblesort2 extends Sort {

    static public int comp = 0;

    static public int[] sort(int[] A){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i=0; i<A.length-1; i++){
                if(A[i]>A[i+1]){
                    comp++;
                    swap(A, i, i+1);
                    isSorted = false;
                }
            }
        }
        return A;
    }
}
