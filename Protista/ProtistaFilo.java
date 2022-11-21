package Protista;

import SeresVivos.SeresVivos;

import java.util.Scanner;

public class ProtistaFilo extends Protista {

    private String nomeFiloProtista;

    public ProtistaFilo(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao, String respiracao, String locomocao, String nomeReinoProtista) {
        super(celula, materialGenetico, metabolismo, nutricao, reproducao, respiracao, locomocao, nomeReinoProtista);
    }

    public ProtistaFilo(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao, String respiracao, String locomocao, String nomeReinoProtista, String nomeFiloProtista) {
        super(celula, materialGenetico, metabolismo, nutricao, reproducao, respiracao, locomocao, nomeReinoProtista);
        this.nomeFiloProtista = nomeFiloProtista;
    }

    public ProtistaFilo() {
        super();
    }


    public String getNomeFiloProtista() {
        return nomeFiloProtista;
    }

    public void setNomeFiloProtista(String nomeFiloProtista) {
        this.nomeFiloProtista = nomeFiloProtista;
    }

    //    public void classificar(){
//
//        int opc = 0;
//        entradaDeDados();
//
//        System.out.println(
//                "======= CLASSIFICAÇÃO DOS PROTOZOARIOS  ======== \n" +
//                "Para facilitar a apresentação e o estudo da diversidade dos protozoários, vamos dividi-los em quatro grupos:\n" +
//                "\n" +
//                "protozoários ameboides;\n" +
//                "protozoários ciliados;\n" +
//                "protozoários flagelados;\n" +
//                "protozoários apicomplexos.");
//        System.out.println(
//                "Informe o tipo de filo Protista: \n" +
//                        "Digite 1 - Amoebozoa:\n" +
//                        "Opção: ");
//
//        opc = scan.nextInt();
//        switch (opc){
//            case 1:
//                setChytridiomycota("Amoebozoa");
//                break;
//
//            default:
//                System.out.println("Opção inválida!!!");
//        }
//    }
}
