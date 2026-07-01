package data_structure.dicionario;

public class Vocabulo {
    private String palavra;
    private String significado;

    public Vocabulo(){

    }

    public Vocabulo(String palavra, String significado){
        this.palavra = palavra;
        this.significado = significado;
    }

    public String getPalavra() {
        return palavra;
    }

    public void setPalavra(String palavra) {
        this.palavra = palavra;
    }

    public String getSignificado() {
        return significado;
    }

    public void setSignificado(String significado) {
        this.significado = significado;
    }
}
