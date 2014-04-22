package sort;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastián
 * Date: 16-04-14
 * Time: 03:25 PM
 * To change this template use File | Settings | File Templates.
 */
public class Bubblesort extends Sort{

    static public int[] sort(int[] A){
        boolean isSorted = false;
        while (!isSorted){
            isSorted = true;
            for(int i=0; i<A.length-1; i++){
                if(A[i]>A[i+1]){
                    swap(A, i, i+1);
                    isSorted = false;
                }
            }
        }
        return A;
    }

}
