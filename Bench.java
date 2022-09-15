import java.util.*;

public class Bench {
    public static void main(String[] args) {
        int k = 100_000;
        int[] bencharray = { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1100, 1200, 1300, 1400, 1500, 1600};
        Random rnd = new Random();
        long t0 = 0;
        long tsum = 0;
        long tsum1 = 0;
        long tsum2 = 0;

        System.out.println("Runtimes for Selection sort (n,time): ");

        for (int n : bencharray) {
            int[] array1 = new int[n];

            for (int i = 0; i < k; i++) {

                for (int j = 0; j < n; j++) {
                    array1[j] = rnd.nextInt(n);
                }

                t0 = System.nanoTime();
                Sort.selection_sort(array1);
                tsum += System.nanoTime() - t0;
            }

            System.out.print("(" + n + "," + (tsum / k)+ ")");

        }

        System.out.println("\n\n");
        System.out.println("Runtimes for insertion sort (n,time): ");

        for (int n : bencharray) {
            int[] array2 = new int[n];

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    array2[j] = rnd.nextInt(n);
                }
                t0 = System.nanoTime();
                Sort.insertion_sort(array2);
                tsum1 += System.nanoTime() - t0;
            }

            System.out.print("(" + n + "," + (tsum1 / k) + ")");

        }

        System.out.println("\n\n");
        System.out.println("Runtimes for merge sort (n,time): ");

        for (int n : bencharray) {
            int[] array2 = new int[n];

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    array2[j] = rnd.nextInt(n);
                }
                t0 = System.nanoTime();
                Sort.merge_sort(array2);
                tsum2 += System.nanoTime() - t0;
            }

            System.out.print("(" + n + "," + (tsum2 / k)+ ")");

        }
    }

}
