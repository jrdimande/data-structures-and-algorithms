package data_structure.lists.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        // Preencher o ArrayList
        for (int i = 0; i < 5; i++){
            System.out.printf("Insira um nome [%d]: ", i);
            String name = read.nextLine();
            names.add(name);
            System.out.println();
        }

        // Mostrar os nomes
        System.out.println("Nomes:");
        for (int i = 0; i < 4; i++){
            System.out.println(" " + names.get(i));
        }

        // Buscar nome na lista
        System.out.println("Escreva um nome: ");
        String name = read.nextLine();

        if (names.contains(name)) {
            names.remove(name);
        }else {
            System.out.println("Nome não encontrado");
        }
        System.out.println(Arrays.toString(names.toArray()));




    }
}
