package sorting_algorithms.exercises;
import java.util.Arrays;

/*
1. Implemente uma versão do Insertion Sort,
mas ao invés de ordenar crescente, ele deve
ir montando a lista em ordem decrescente.
Exemplo:
Entrada: [5, 2, 9, 1]
Saída: [9, 5, 2, 1]
 */

public class Ex1 {
    public static void insertionSort(int[] array){
        int length = array.length;
        for (int i = 1; i < length; i++){
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] < key){
                array[j + 1] = array[j];
                j -= 1;
            }
            array[j + 1] = key;
        }

    }

    public static void main(String[] args){
        int[] nums = {5, 2, 9, 1};

        System.out.println("Antes de ordenar:" + Arrays.toString(nums));
        insertionSort(nums);

        System.out.println("Depois de ordenar:" + Arrays.toString(nums));
    }
}

