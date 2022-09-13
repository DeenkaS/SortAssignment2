import java.util.*;
public class Sortingtest {
    public static void main(String []args){
        Random rnd = new Random();

        int[] testarray = new int[100];

        for(int i = 0; i < testarray.length; i++){
            testarray[i] = rnd.nextInt(100); 
        }

        System.out.println("\n\n\nunsorted array: ");
        for(int k = 0; k < testarray.length; k++){
            System.out.print(testarray[k] + " ");
        }

        Sort.insertion_sort(testarray);

        System.out.println(" \n\n\nsorted array: ");
        for(int j = 0; j < testarray.length; j++){
            System.out.print(testarray[j] + " ");
        }
    }  
    
}
