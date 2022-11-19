package Protista;

import java.util.Scanner;

public class ProtistaEspecie extends ProtistaGenero{

    Scanner scan = new Scanner(System.in);
    private String especieProtista;

    public ProtistaEspecie() {
    }

    public ProtistaEspecie(String filoProtista, String classeProtista, String ordemProtista, String familiaProtista, String generoProtista, String especieProtista) {
        super(filoProtista, classeProtista, ordemProtista, familiaProtista, generoProtista);
        this.especieProtista = especieProtista;
    }

    public String getEspecieProtista() {
        return especieProtista;
    }

    public void setEspecieProtista(String especieProtista) {
        this.especieProtista = especieProtista;
    }

    public void setDados(String nmReino) {

        this.setNomeReinoProtista(nmReino);

        System.out.println("Nome da Especie:");
        this.setEspecieProtista(scan.next());

        System.out.println("Nome da Genero:");
        this.setGeneroProtista(scan.next());

        System.out.println("Nome da Familia:");
        this.setFamiliaProtista(scan.next());

        System.out.println("Nome da Ordem:");
        this.setOrdemProtista(scan.next());

        System.out.println("Nome da Classe:");
        this.setClasseProtista(scan.next());

        System.out.println("Nome da Filo:");
        this.setNomeFiloProtista(scan.next());
    }

    @Override
    public String toString() {

        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("\nReino: ");
        stringBuffer.append(this.getNomeReinoProtista());
        stringBuffer.append("\nFilo: ");
        stringBuffer.append(this.getNomeFiloProtista());
        stringBuffer.append("\nClasse: ");
        stringBuffer.append(this.getClasseProtista());
        stringBuffer.append("\nOrdem: ");
        stringBuffer.append(this.getOrdemProtista());
        stringBuffer.append("\nFamilia: ");
        stringBuffer.append(this.getFamiliaProtista());
        stringBuffer.append("\nGenero: ");
        stringBuffer.append(this.getGeneroProtista());
        stringBuffer.append("\nEspecie: ");
        stringBuffer.append(this.getEspecieProtista());

        return stringBuffer.toString();
    }

//    @Override
//    public void classificar(){
//        int opc = 0;
//        System.out.println(
//                "Informe a \"espécie\" Protista: \n" +
//                        "Digite 1 - Eukaryota: \n" +
//                        "Opção: ");
//        opc = scan.nextInt();
//
//        switch (opc){
//            case 1:
//                setEspecieProtista("Eukaryota");
//                break;
//            default:
//                System.out.println("Opção inválida!!!");
//        }
//    }

}
