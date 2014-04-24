package test;

import com.sun.org.apache.xpath.internal.SourceTree;
import experiment.ArrayGenerator;
import org.junit.Before;
import org.junit.Test;
import sort.Bubblesort;
import sort.Insertsort;
import sort.Mergesort;
import sort.Quicksort;

import static junit.framework.Assert.assertEquals;

/**
 * Created with IntelliJ IDEA.
 * User: Sebastián
 * Date: 16-04-14
 * Time: 02:37 PM
 * To change this template use File | Settings | File Templates.
 */
public class SortTest {
    static int[] A;
    int[] E;
    int N;

    @Before
    public void setup(){
        N = 10000000;
        A = ArrayGenerator.random(N);
        E = ArrayGenerator.sorted(N);
    }

   @Test
    public void BubbleTest(){
        int[] R = Bubblesort.sort(A);
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

    @Test
    public void MergeTest(){
        int[] R = Mergesort.sort(A);
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

    @Test
    public void QuickTest(){
        int[] R = Quicksort.sort(A);
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

    @Test
    public void InsertTest(){
        int[] R = Insertsort.sort(A);
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }
}
