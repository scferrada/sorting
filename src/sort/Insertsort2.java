package sort;

public class Insertsort2 extends Sort {

    static public long comp = 0;
    static public long comp1 = 0;

    static public int[] sort(int[] A){


        for(int i=1; i<A.length; i++){
            for(int j=i-1; j>=0 && A[i]<A[j]; j--){
                comp++;
                if(comp1>1000) {comp++; comp1=0;}
                swap(A, i, j);
                i--;
            }
        }
        return A;
    }
}
