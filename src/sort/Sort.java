package sort;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastián
 * Date: 17-04-14
 * Time: 11:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class Sort {

    static protected void swap(int[] A, int i, int j){
        A[i] += A[j];
        A[j] = A[i] - A[j];
        A[i] = A[i] - A[j];
    }

}
