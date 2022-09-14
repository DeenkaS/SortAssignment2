public class Sort {

    public static void simple_sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            // let's set the first candidate to the index itself
            int cand = i;

            for (int j = i; j < array.length; j++) {
                // If the element at position j is smaller than the value
                // at the candidate position - then you have a new candidate
                // posistion.
                if (array[j] < array[cand]) {
                    cand = j;
                }
            }
            // Swap the item at position i with the item at the candidate position.
            int temp = array[i];
            array[i] = array[cand];
            array[cand] = temp;
        }
    }

    public static void insertion_sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            // for each element from i towards 1, swap the item found with the
            // item before it if it is smaller
            for (int j = i; j > 0; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }

    }

}