package Protista;

import SeresVivos.SeresVivos;

public class Protista extends SeresVivos {

    private String nomeReinoProtista;


    public Protista(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao, String respiracao, String locomocao, String nomeReinoProtista) {
        super(celula, materialGenetico, metabolismo, nutricao, reproducao, respiracao, locomocao);
        this.nomeReinoProtista = nomeReinoProtista;
    }

    public Protista() {

    }

    public String getNomeReinoProtista() {
        return nomeReinoProtista;
    }

    public void setNomeReinoProtista(String nomeReinoProtista) {
        this.nomeReinoProtista = nomeReinoProtista;
    }
}
