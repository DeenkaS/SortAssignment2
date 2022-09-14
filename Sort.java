public class Sort {

    public static void selection_sort(int[] array) {

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
            for (int j = i; j > 0 && array[j - 1] > array[j]; j--) {

                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;

            }
        }
    }

    public static void merge_sort(int[] array) {

        if (array.length == 1) {
            return;
        }

        int mid = array.length / 2;

        int[] left = new int[array.length-mid];
        int[] right = new int[mid];

        for (int i = 0; i < right.length; i++) {
            right[i] = array[i];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[mid + i];
        }

        merge_sort(left);
        merge_sort(right);

        merge(left, right, array);
    }

    public static void merge(int[] left, int[] right, int[] array) {

        int r = 0;
        int l = 0;
        int k = 0;

        int[] merged = new int[left.length + right.length];

        while(l < left.length && r <  right.length){
            if(left[l] < right[r]){
                merged[k] = left[l];
                k++;
                l++;
            }
            else{
                merged[k] = right[r];
                r++;
                k++;
            }
        }



    }

}