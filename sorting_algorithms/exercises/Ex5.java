package sorting_algorithms.exercises;
import java.util.Arrays;

/*
Implemente o algoritmo Length-Based String
Sort
Regra:
Dada uma lista de strings, ordene pela quantidade
de caracteres (crescente).
Se tiverem o mesmo tamanho, ordene em ordem
alfabética.
Exemplo:
Entrada: [“uva”, “banana”, “maçã”, “kiwi”]
Saída: [“uva”, “kiwi”, “maçã”, “banana”]
 */

public class Ex5 {

    public static void lengthBasedStringSort(String[] array) {
        int len = array.length;

        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - 1 - i; j++) {
                if (array[j].length() > array[j + 1].length()) {
                    // troca
                    String temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        String[] names = {"uva", "banana", "maca", "kiwi"};

        System.out.println("Antes de ordenar: " + Arrays.toString(names));
        lengthBasedStringSort(names);
        System.out.println("Depois de ordenar: " + Arrays.toString(names));
    }
}
