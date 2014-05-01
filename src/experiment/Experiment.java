package experiment;

import sort.*;

import java.util.Arrays;

public class Experiment {

    static public void main(String[] args){
        int N = 10000;
        long[] mTime = new long[N], qTime = new long[N],
               iTime = new long[N], bTime = new long[N];
        int[] mComp = new int[N], qComp = new int[N],
                iComp = new int[N], bComp = new int[N];
        long start, end, time;
        double mstd1 = 1, qstd1 = 1, istd1 = 1, bstd1 = 1;
        double mstd2 = 1, qstd2 = 1, istd2 = 1, bstd2 = 1;
        int a1 = 0, a2= 0, a3= 0,a4 = 0, a5 = 0, a6 = 0, a7 = 0, a8 = 0;



        for(int pow=11; pow<12; pow++){
            for(int i=0; i<N; i++){
                int[] A = ArrayGenerator.random((int) Math.pow(2, pow));
                //Quicksort
                if(qstd1>0.05){
                     start = System.nanoTime();
                     Quicksort.sort(Arrays.copyOf(A,A.length));
                     end = System.nanoTime();
                     time = end - start;
                     qTime[i] = time;
                     if(i>3) qstd1 = standardDeviation(qTime,i)/mean(qTime,i);
                }
                else{
                    if(a1==0){
                        a1++;
                        System.out.println("Prueba tiempo Quicksort. N="+N+", i="+i+", error ="+qstd1 );
                    }
                    }
                //Quicksort2
                if(qstd2>0.05){
                    Quicksort2.sort(Arrays.copyOf(A,A.length));
                    qComp[i] = Quicksort2.comp;
                    Quicksort2.comp = 0;
                    if(i>3) qstd2 = standardDeviation(qComp,i)/mean(qComp,i);
                } else {
                    if(a2==0){
                        a2++;
                        System.out.println("Prueba comparaciones Quicksort. N="+N+", i="+i+", error ="+qstd2+" comp="+ mean(qComp,i-1));}
                }

                //Mergesort
                if(mstd1>0.05){
                    start = System.nanoTime();
                    Mergesort.sort(Arrays.copyOf(A,A.length));
                    end = System.nanoTime();
                    time = end - start;
                    mTime[i] = time;
                    if(i>3) mstd1 = standardDeviation(mTime,i)/mean(mTime,i);
                }
                else{
                    if(a3==0){
                        a3++;
                        System.out.println("Prueba tiempo Mergesort. N="+N+", i="+i+", error ="+mstd1); }
                }
                //Mergesort2
                if(mstd2>0.05){
                    Mergesort2.sort(Arrays.copyOf(A,A.length));
                    mComp[i] = Mergesort2.comp;
                    Mergesort2.comp = 0;
                    if(i>3) mstd2 = standardDeviation(mComp,i)/mean(mComp,i);
                } else {
                    if(a4==0){
                        a4++;
                        System.out.println("Prueba comparaciones Mergesort. N="+N+", i="+i+", error ="+mstd2+" comp="+ mean(mComp,i-1));  }
                }



                if(istd1>0.05){
                    start = System.nanoTime();
                    Insertsort.sort(Arrays.copyOf(A,A.length));
                    end = System.nanoTime();
                    time = end - start;
                    iTime[i] = time;
                    if(i>3) istd1 = standardDeviation(iTime,i)/mean(iTime,i);
                }
                else{
                    if(a5==0){
                        a5++;
                        System.out.println("Prueba tiempo Insertsort. N="+N+", i="+i+", error ="+istd1);             }
                }
                //Insertsort2
                if(istd2>0.05){
                    Insertsort2.sort(Arrays.copyOf(A,A.length));
                    iComp[i] = Insertsort2.comp;
                    Insertsort2.comp = 0;
                    if(i>3) istd2 = standardDeviation(iComp,i)/mean(iComp,i);
                } else {
                    if(a6==0){
                        a6++;
                        System.out.println("Prueba comparaciones Insertsort. N="+N+", i="+i+", error ="+istd2+" comp="+ mean(iComp,i-1));       }
                }

                //Mergesort
                if(bstd1>0.05){
                    start = System.nanoTime();
                    Bubblesort.sort(Arrays.copyOf(A,A.length));
                    end = System.nanoTime();
                    time = end - start;
                    bTime[i] = time;
                    if(i>3) bstd1 = standardDeviation(bTime,i)/mean(bTime,i);
                }
                else{
                    if(a7==0){
                        a7++;
                        System.out.println("Prueba tiempo Bubblesort. N="+N+", i="+i+", error ="+bstd1);               }
                }
                //Mergesort2
                if(bstd2>0.05){
                    Bubblesort2.sort(Arrays.copyOf(A,A.length));
                    bComp[i] = Bubblesort2.comp;
                    Bubblesort2.comp = 0;
                    if(i>3) bstd2 = standardDeviation(bComp,i)/mean(bComp,i);
                } else {
                    if(a8==0){
                        a8++;
                        System.out.println("Prueba comparaciones Bubblesort. N="+N+", i="+i+", error ="+bstd2+" comp="+ mean(bComp,i-1));         }
                }

            }
        }

        if(a1==0) System.out.println("Prueba tiempo Quicksort. N="+N+", error ="+qstd1);
        if(a2==0) System.out.println("Prueba comparaciones Quicksort. N="+N+", error ="+qstd2);
        if(a3==0) System.out.println("Prueba tiempo Mergesort. N="+N+", error ="+mstd1);
        if(a4==0) System.out.println("Prueba comparaciones Mergesort. N="+N+", error ="+mstd2);
        if(a5==0) System.out.println("Prueba tiempo Insertsort. N="+N+", error ="+istd1);
        if(a6==0) System.out.println("Prueba comparaciones Insertsort. N="+N+", error ="+istd2);
        if(a7==0) System.out.println("Prueba tiempo Bubblesort. N="+N+", error ="+bstd1);
        if(a8==0) System.out.println("Prueba comparaciones Bubblesort. N="+N+", error ="+bstd2);

    }

    private static double standardDeviation(int[] a, int n) {


        double prom = mean(a,n);
        double aux = 0;

        for(int i = 0; i < n ; i++){
            aux+= Math.pow((double)a[i]-prom,2);
        }

        return Math.sqrt(aux/n);

    }

    private static double standardDeviation(long[] a, int n){
        if(n == 0) return 1;
        int[]b = new int[a.length];
        for(int i = 0;i<a.length;i++){
            b[i] = (int)a[i];
        }
        return standardDeviation(b, n);
    }

    private static double mean(int[] a, int n){
        double sum = 0;

        for(int i = 0; i < n ; i++){
            sum+= (double)a[i];
        }

        return sum/n;

    }

    private static double mean(long[] a, int n){
        if(n==0) return 1;
        int[]b = new int[a.length];
        for(int i = 0;i<a.length;i++){
            b[i] = (int)a[i];
        }
        return mean(b,n);

    }

}
