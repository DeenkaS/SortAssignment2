import java.util.*;

public class Bench {
    public static void main(String[] args) {
        int k = 1000;
        int[] bencharray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200,1300,1400,1500,1600,3200,6400 };
        Random rnd = new Random();
        long t0 = 0;
        long tsum = 0;

        for (int n : bencharray) {

            int[] array1 = new int[rnd.nextInt(n)];

            for (int i = 0; i < k; i++) {
                t0 = System.nanoTime();
                Sort.simple_sort(array1);
                tsum += System.nanoTime() - t0;
            }

            System.out.println("Length of array: " + n + " average runtime: " + (tsum / k));

        }

        for (int n : bencharray) {

            int[] array1 = new int[rnd.nextInt(n)];

            for (int i = 0; i < k; i++) {
                t0 = System.nanoTime();
                Sort.insertion_sort(array1);
                tsum += System.nanoTime() - t0;
            }

            System.out.println("Length of array: " + n + " average runtime: " + (tsum / k));

        }
    }

}
