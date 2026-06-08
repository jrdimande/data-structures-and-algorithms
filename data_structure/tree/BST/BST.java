package data_structure.tree.BST;

import java.util.ArrayList;

public class BST implements InterfaceBT {
    private No raiz;

    public BST(){
        raiz = null;
    }

    public void inserir(int valor){
        raiz = insert(raiz, valor);
    }

    public No insert(No no, int valor){
        if (no == null){
            return new No(valor);
        }

        if (valor < no.getInfo()){
            no.setEsq(insert(no.getEsq(), valor));
        } else {
            no.setDir(insert(no.getDir(), valor));
        }

        return no;
    }

    @Override
    public void listInOrder(No no){
        if (no != null){
            listInOrder(no.getEsq());
            System.out.print(no.getInfo() + " ");
            listInOrder(no.getDir());
        }
    }

    @Override
    public void listPosOrder(No no){
        if (no != null){
            listPosOrder(no.getEsq());
            listPosOrder(no.getDir());
            System.out.print(no.getInfo() + " ");
        }
    }

    @Override
    public void listPreOrder(No no){
        if (no != null){
            System.out.print(no.getInfo() + " ");
            listPreOrder(no.getEsq());
            listPreOrder(no.getDir());
        }
    }

}