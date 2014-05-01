package sort;

public class Insertsort2 extends Sort {

    static public int comp = 0;

    static public int[] sort(int[] A){


        for(int i=1; i<A.length; i++){
            for(int j=i-1; j>=0 && A[i]<A[j]; j--){
                comp++;
                swap(A, i, j);
                i--;
            }
        }
        return A;
    }
}
