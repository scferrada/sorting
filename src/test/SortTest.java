package test;

import com.sun.org.apache.xpath.internal.SourceTree;
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
    int N = 1024;
    static int[] A = {3, 4, 5, 6, 2, 1};
    int[] E = {1, 2, 3, 4, 5, 6};

   // @Test
    public void MergeTest(){
        int[] R = Mergesort.sort(A);
//        for(int i=0; i<6; i++){
//            System.out.print(R[i]);
//        }
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

    @Test
    public void QuickTest(){
        int[] R = Quicksort.sort(A);
//        for(int i=0; i<6; i++){
//            System.out.print(R[i]);
//        }
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

   // @Test
    public void InsertTest(){
        int[] R = Insertsort.sort(A);
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

   // @Test
    public void BubbleTest(){
        int[] R = Bubblesort.sort(A);
        for(int i=0; i<6; i++){
            assertEquals(E[i], R[i]);
        }
    }

}
