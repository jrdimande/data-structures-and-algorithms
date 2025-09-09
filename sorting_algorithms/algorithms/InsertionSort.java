package sorting_algorithms.algorithms;
import java.util.Arrays;

public class InsertionSort {

    public static void InsertionSort(int[] array){
        int length = array.length;

        for (int i = 1; i < length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key){
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }
    }

    public static void main(String[] args){
        int[] nums = {
                3, 1, 5,
                2, 8, 4,
                3, 8, 9,
                0, 5, 2
        };

        System.out.println("Antes de ordenar: " + Arrays.toString(nums));
        InsertionSort(nums);
        System.out.println("Depois de ordenar: " + Arrays.toString(nums));

    }
}
