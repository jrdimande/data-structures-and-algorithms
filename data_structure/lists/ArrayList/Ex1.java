package data_structure.lists.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {

    // Selection Sort para ArrayList<Integer>
    public static void selectionSort(ArrayList<Integer> array) {
        int length = array.size();

        for (int i = 0; i < length; i++) {
            int min = array.get(i);
            int index = i;

            for (int j = i + 1; j < length; j++) {
                if (array.get(j) < min) {
                    min = array.get(j);
                    index = j;
                }
            }


            int temp = array.get(index);
            array.set(index, array.get(i));
            array.set(i, temp);
        }
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();

        // Preenchendo o ArrayList de inteiros
        for (int i = 0; i < 9; i++) {
            System.out.printf("Insira um número [%d]: ", i);
            int num = read.nextInt();
            nums.add(num);
        }

        // Antes de ordenar
        System.out.println("Antes: " + nums);

        // Ordenar
        selectionSort(nums);

        // Depois de ordenar
        System.out.println("Depois: " + nums);
        read.close();
    }

}
