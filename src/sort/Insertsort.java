package sort;

public class Insertsort extends Sort{

    static public int[] sort(int[] A){

        for(int i=1; i<A.length; i++){
            for(int j=i-1; j>=0; j--){
                if(A[i]<A[j]){
                    swap(A, i, j);
                    i--;
                }
            }
        }
        return A;
    }
}
