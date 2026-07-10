package data_structure.conjunto;

public class Conjunto {
    private No inicio;
    private int tamanho;

    public Conjunto(){
        this.inicio = null;
        this.tamanho = 0;
    }

    public void adiciona(Object elemento){
        No novo = new No(elemento);

        if (inicio == null){
            inicio = novo;
            tamanho++;
            return;
        }

        if (pertence(elemento)) {
            throw new IllegalArgumentException("Elemento já existe no conjunto");
        }

        No actual = inicio;

        while (actual.getProximo() != null){
            actual = actual.getProximo();
        }
        actual.setProximo(novo);
        tamanho++;
    }

    public void remover(Object elemento){
        if (inicio == null){
            throw new NullPointerException("Conjunto vazio");
        }

        if (!pertence(elemento)){
            throw new IllegalArgumentException("Elemento não encontrado no conjunto");
        }

        if (inicio.getElemento().equals(elemento)) {
            inicio = inicio.getProximo();
            return;
        }

        No actual = inicio;

        while (actual != null){
            if (actual.getProximo().getElemento().equals(elemento)){
                actual.setProximo(actual.getProximo().getProximo());
            }
            actual = actual.getProximo();
        }
    }


    public void limpar(){
        inicio = null;
    }

    public boolean pertence(Object elemento){
        if (inicio == null){
            return false;
        }

        No actual = inicio;

        while (actual != null){
            if (actual.getElemento().equals(elemento)){
                return true;
            }
            actual = actual.getProximo();
        }

        return false;
    }

    public Conjunto uniao(Conjunto c){
        Conjunto novo = new Conjunto();

        if (inicio == null && c.inicio == null){
            throw new IllegalArgumentException("Ambos conjuntos estão vazios!");

        }

        No actual = inicio;
        while (actual != null){
            if (!novo.pertence(actual.getElemento())){
                novo.adiciona(actual.getElemento());
            }
            actual = actual.getProximo();
        }

        actual = c.inicio;

        while (actual != null){
            if (!novo.pertence(actual.getElemento())){
                novo.adiciona(actual.getElemento());
            }
            actual = actual.getProximo();
        }

        return novo;
    }

    public Conjunto intersecao(Conjunto c){
        Conjunto novo = new Conjunto();

        if (inicio == null && c.inicio == null){
            throw new IllegalArgumentException("Ambos conjuntos estão vazios!");

        }

        No actual = inicio;

        while (actual != null){
            if (c.pertence(actual.getElemento())){
                novo.adiciona(actual.getElemento());
            }
            actual = actual.getProximo();

        }

        return novo;

    }

    public boolean igual(Conjunto c){

        if (inicio == null && c.inicio == null){
            throw new IllegalArgumentException("Ambos conjuntos estão vazios!");

        }

        No actual = inicio;

        while (actual != null){
            if (!c.pertence(actual.getElemento())){
                return false;
            }
            actual = actual.getProximo();
        }

        return true;

    }

    public Conjunto diferenca(Conjunto c){
        Conjunto novo = new Conjunto();

        if (inicio == null && c.inicio == null){
            throw new IllegalArgumentException("Ambos conjuntos estão vazios!");

        }

        No actual = inicio;

        while (actual != null){
            if(!c.pertence(actual.getElemento())){
                novo.adiciona(actual.getElemento());
            }
            actual = actual.getProximo();
        }

        actual = c.inicio;

        while (actual != null){
            if (!pertence(actual.getElemento())){
                novo.adiciona(actual.getElemento());

            }
            actual = actual.getProximo();
        }

        return novo;
    }

    public void imprimir(){
        if (inicio == null){
            System.out.println("Conjunto está Vazio!");
            return;
        }

        No actual = inicio;

        while (actual != null){
            System.out.print(actual.getElemento() + " ");
            actual = actual.getProximo();
        }
        System.out.println();
    }


}
