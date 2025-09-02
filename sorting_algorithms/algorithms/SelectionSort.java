package sorting_algorithms.algorithms;
import java.util.Random;
import java.util.Arrays;

public class SelectionSort  {
    public static void SelectionSort(int[] a){
        int length = a.length;

        for (int i = 0; i < length; i++){
            int min = a[i];
            int indexOfMin = i;

            for (int j = i + 1; j < length; j++){
                if (a[j] < min){
                    min = a[j];
                    indexOfMin = j;
                }

            }
            swap(a, i, indexOfMin);

        }

    }

    public static void swap(int[] a, int x, int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;

    }

    public static void fillArray(int[] a, int min, int max, Random rand){
        for (int i = 0; i < a.length; i++){
            a[i] = rand.nextInt((max-min) + min);
        }

    }


    public static void main(String[] args){
        Random rand = new Random();
        int[] numbers = new int[5];

        fillArray(numbers, 0, 5, rand);

        System.out.println("Antes de ordenar: " + Arrays.toString(numbers));
        SelectionSort(numbers);
        System.out.println("Depois de ordenar: " + Arrays.toString(numbers));


    }


}
