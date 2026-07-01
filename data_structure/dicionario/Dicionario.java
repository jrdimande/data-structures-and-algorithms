package data_structure.dicionario;

import java.util.LinkedList;

public class Dicionario {
    private LinkedList<Vocabulo>[] tabelaHash = new LinkedList[26];

    public Dicionario(){
        for (int i = 0; i < 26; i++){
            tabelaHash[i] = new LinkedList<>();
        }
    }

    private int codigoHash(Vocabulo vocabulo){
        String palavra = vocabulo.getPalavra();
        return palavra.toLowerCase().charAt(0) % 26;
    }

    private int codigoHash(String palavra){
        return palavra.toLowerCase().charAt(0) % 26;
    }

    public void adicionaVocabulo(Vocabulo vocabulo){
        int indice = codigoHash(vocabulo);
        tabelaHash[indice].add(vocabulo);
    }

    public void removerVocabulo(Vocabulo vocabulo){
        int indice = codigoHash(vocabulo);
        tabelaHash[indice].remove(vocabulo);
    }

    public boolean contem(String palavra){
        int indice = codigoHash(palavra);
        LinkedList<Vocabulo> lista = tabelaHash[indice];

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getPalavra().equals(palavra)){
                return true;
            }
        }

        return false;
    }

    public void consultarSignificado(String palavra){
        int indice = codigoHash(palavra);
        LinkedList<Vocabulo> lista = tabelaHash[indice];

        for (int i = 0; i < lista.size(); i++){
            if (lista.get(i).getPalavra().equals(palavra)){
                System.out.println(lista.get(i).getSignificado());
                return;
            }
        }
    }


    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();
        Vocabulo vocabulo = new Vocabulo("casa", "Lugar onde vivem pessoas");
        dicionario.adicionaVocabulo(vocabulo);

        System.out.println(dicionario.contem("casa"));
        dicionario.consultarSignificado("casa");
    }

}
