import java.util.*;
public class Sortingtest {
    public static void main(String []args){
        Random rnd = new Random();

        int[] testarray = new int[100];

        for(int i = 0; i < testarray.length; i++){
            testarray[i] = rnd.nextInt(100); 
        }

        for(int k = 0; k < testarray.length; k++){
            System.out.println(testarray[k]);
        }

        Sort.simple_sort(testarray);

        for(int j = 0; j < testarray.length; j++){
            System.out.println(testarray[j]);
        }
    }  
    
}
