package experiment;

import sort.Sort;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastián
 * Date: 17-04-14
 * Time: 12:11 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArrayGenerator extends Sort {

    static public int[] random(int N){
        int[] A = sorted(N);
        for(int i=0; i<N; i++){
            swap(A, i, i + new Random().nextInt(N-i));
        }
        return A;
    }

    static public int[] sorted(int N){
        int[] A = new int[N];
        for(int i=0; i<N; i++){
            A[i] = i+1;
        }
        return A;
    }

    static public int[] almostSorted(int N){
        int[] A = sorted(N);
        int top = (int) Math.ceil(Math.log(N));
        int inversions = new Random().nextInt(top);
        for(int i=0; i<inversions; i++){
            swap(A, i, new Random().nextInt(N));
        }
        return A;
    }

}
