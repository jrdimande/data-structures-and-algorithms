package data_structure.conjunto;

public class Teste {
    public static void main(String[] args){
        Conjunto a = new Conjunto();
        Conjunto b = new Conjunto();

        a.adiciona(1);
        a.adiciona(2);
        a.adiciona(3);

        b.adiciona(1);
        b.adiciona(2);
        b.adiciona(3);

        // Operações entre conjuntos
        Conjunto c = a.uniao(b);
        Conjunto d = a.intersecao(b);
        Conjunto e = a.diferenca(b);

        c.imprimir();
        d.imprimir();
        e.imprimir();

        System.out.println(a.igual(b));


    }
}
