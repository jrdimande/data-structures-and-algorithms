package sorting_algorithms.algorithms;

public class BubbleSort {
    public static void bubblesort(int a[]){
        for (int i = 0; i < a.length - 1; i++){
            for (int j = 0; j < a.length - 1 - i; j++){
                if (a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }


        }
    }

    public static void main(String[] args){
        int[] numbers = {3,7,1,9,0,11};
        bubblesort(numbers);

        System.out.println("New Array: ");

        for (int num : numbers){
            System.out.print(num + " ");
        }
    }
}
