package sorting_algorithms.exercises;
import java.util.Arrays;

/*
3. Implemente o algoritmo Absolute Value Sort
Regra:
Ordene o vetor com base no valor absoluto dos
números.
Exemplo:
Entrada: [7, -3, 2, -10, 5]
Saída: [2, -3, 5, 7, -10]
 */


public class Ex3 {

    public static int transformToPositive(int num){
        if (num < 0){
            num = -1 * num;
        }
        return num;
    }

    public static void absoluteValueSort(int[] array){
        int len = array.length;
        for (int i = 0; i < len - 1; i++){
            for (int j = 0; j < len - 1 - i; j++){
                if (transformToPositive(array[j]) > transformToPositive(array[j + 1])){
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

    public static void main(String[] args){
        int[] numbers = {7, -3, 2, -10, 5};
        System.out.println("Antes de ordenar: " + Arrays.toString(numbers));
        absoluteValueSort(numbers);
        System.out.println("Depois de ordenar: " + Arrays.toString(numbers));


    }

}
