package experiment;

import sort.Bubblesort;
import sort.Insertsort;
import sort.Mergesort;
import sort.Quicksort;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastián
 * Date: 17-04-14
 * Time: 12:40 PM
 * To change this template use File | Settings | File Templates.
 */
public class Experiment {

    static public void main(String[] args){
        int N = 100;
        long[] mTime = new long[N], qTime = new long[N],
               iTime = new long[N], bTime = new long[N];
        long start, end, time;
        double mstd, qstd, istd, bstd;
        for(int pow=11; pow<21; pow++){
            for(int i=0; i<N; i++){
                int[] A = ArrayGenerator.random((int) Math.pow(2, pow));

                //Mergesort
                start = System.currentTimeMillis();
                Mergesort.sort(A);
                end = System.currentTimeMillis();
                time = end - start;
                mTime[i] = time;

                //Quicksort
                start = System.currentTimeMillis();
                Quicksort.sort(A);
                end = System.currentTimeMillis();
                time = end - start;
                qTime[i] = time;

                //Insertsort
                start = System.currentTimeMillis();
                Insertsort.sort(A);
                end = System.currentTimeMillis();
                time = end - start;
                iTime[i] = time;

                //Bubblesort
                start = System.currentTimeMillis();
                Bubblesort.sort(A);
                end = System.currentTimeMillis();
                time = end - start;
                bTime[i] = time;

                qstd = standardDeviation(qTime);
            }
        }
    }

    private static double standardDeviation(long[] qTime) {
        return 0;  //To change body of created methods use File | Settings | File Templates.
    }


}
