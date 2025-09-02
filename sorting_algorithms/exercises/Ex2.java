package sorting_algorithms.exercises;


/*
2. Implemente o algoritmo Even-Odd Sort (ParImpar Sort)
Regra:
Primeiro coloque todos os números pares em ordem
crescente.
Depois coloque todos os números ímpares em
ordem decrescente.
Exemplo:
Entrada: [7, 2, 9, 4, 1, 6, 5]
Saída: [2, 4, 6, 9, 7, 5, 1]

 */

public class Ex2 {

    public static void EvenOddSort(int[] array){
        int sizeEven = 0;
        int sizeOdd = 0;

        // Contar pares e ímpares
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                sizeEven++;
            } else {
                sizeOdd++;
            }
        }

        int[] evenNums = new int[sizeEven];
        int[] oddNums = new int[sizeOdd];
        int k = 0, j = 0;

        // Preencher arrays de pares e ímpares
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0){
                evenNums[k++] = array[i];
            } else {
                oddNums[j++] = array[i];
            }
        }

        selectionSortInc(evenNums);
        selectionSortDec(oddNums);

        // Colocar de volta no array original
        int idx = 0;
        for (int i = 0; i < evenNums.length; i++){
            array[idx++] = evenNums[i];
        }
        for (int i = 0; i < oddNums.length; i++){
            array[idx++] = oddNums[i];
        }
    }

    public static void selectionSortInc(int[] array){
        int len = array.length;

        for (int i = 0; i < len - 1; i++){
            int min = array[i];
            int idx = i;

            for (int j = i + 1; j < len; j++){
                if (array[j] < min){
                    min = array[j];
                    idx = j;
                }
            }

            if (idx != i){
                array[idx] = array[i];
                array[i] = min;
            }
        }
    }

    public static void selectionSortDec(int[] array){
        int len = array.length;

        for (int i = 0; i < len - 1; i++){
            int max = array[i];
            int idx = i;

            for (int j = i + 1; j < len; j++){
                if (array[j] > max){
                    max = array[j];
                    idx = j;
                }
            }

            if (idx != i){
                array[idx] = array[i];
                array[i] = max;
            }
        }
    }

    public static void main(String[] args){
        int[] array = {7, 2, 9, 4, 1, 6, 5};
        EvenOddSort(array);

        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
