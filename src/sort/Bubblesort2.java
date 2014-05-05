package sort;

public class Bubblesort2 extends Sort {

    static public long comp = 0;
    static public long comp1 = 0;

    static public int[] sort(int[] A){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i=0; i<A.length-1; i++){
                comp1++;
                if(comp1>1000) {comp++; comp1=0;}
                if(A[i]>A[i+1]){
                    swap(A, i, i+1);
                    isSorted = false;
                }
            }
        }
        return A;
    }
}
