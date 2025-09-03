package sorting_algorithms.exercises;
import java.util.Arrays;

/*
Implemente o algoritmo Prime Sort
(Ordenação de Primos Primeiro)
Regra:
Coloque todos os números primos no início em
ordem crescente.
Depois coloque os números não primos em ordem
crescente.
Exemplo:
Entrada: [8, 7, 4, 5, 9, 11]
Saída: [5, 7, 11, 4, 8, 9]

 */

public class Ex4 {

    // Método para verificar se o número é par
    public static boolean isPrime(int num){
        boolean isPrime = false;
        if (num < 0){
            isPrime = false;
        }

        int divs = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0){
                divs++;
            }
        }

        if (divs == 2){
            isPrime = true;
        }

        return isPrime;

    }

    // Implementação do primeSort
    public static void primeSort(int[] array){
        int sizePrimes = 0;


        for (int i = 0; i < array.length; i++){
            if (isPrime(array[i])){
                sizePrimes++;
            }

        }

        int[] primes = new int[sizePrimes];
        int[] nonPrimes = new int[array.length - sizePrimes];

        int j = 0, k = 0;
        for (int i = 0; i < array.length; i++){
            if (isPrime(array[i])){
                primes[j++] = array[i];
            }else {
                nonPrimes[k++] = array[i];
            }
        }

        int idx = 0;
        for (int i = 0; i < primes.length; i++){
            array[idx++] = primes[i];
        }

        for (int i = idx; i < nonPrimes.length; i++){
            array[idx++] = nonPrimes[i];
        }

        selectionSort(primes);
        selectionSort(nonPrimes);

        idx = 0;
        for (int i = 0; i < primes.length; i++){
            array[idx++] = primes[i];
        }
        for (int i = 0; i < primes.length; i++){
            array[idx++] = nonPrimes[i];
        }
    }

    // Método para ordenar os números em ordem crescente
    public static void selectionSort(int[] array){
        int len = array.length;
        for (int i = 0; i < len; i++){
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

    public static void main(String[] args){
        int[] numbers = {8, 7, 4, 5, 9, 11};

        System.out.println("Antes de ordenar: " + Arrays.toString(numbers));
        primeSort(numbers);
        System.out.println("Depois de ordenar" + Arrays.toString(numbers));

    }

}
