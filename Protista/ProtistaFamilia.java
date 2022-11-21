package Protista;

public class ProtistaFamilia extends ProtistaOrdem{

    private String familiaProtista;

    public ProtistaFamilia() {
    }

    public ProtistaFamilia(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao, String respiracao, String locomocao, String nomeReinoProtista, String nomeFiloProtista, String classeProtista, String ordemProtista, String familiaProtista) {
        super(celula, materialGenetico, metabolismo, nutricao, reproducao, respiracao, locomocao, nomeReinoProtista, nomeFiloProtista, classeProtista, ordemProtista);
        this.familiaProtista = familiaProtista;
    }

    public String getFamiliaProtista() {
        return familiaProtista;
    }

    public void setFamiliaProtista(String familiaProtista) {
        this.familiaProtista = familiaProtista;
    }

//    public void classificar(){
//        int opc = 0;
//        System.out.println(
//                "Informe a familia do reino Protista: \n" +
//                        "Digite 1 - Amoebidae: \n" +
//                        "Opção: ");
//        opc = scan.nextInt();
//
//
//        switch (opc){
//            case 1:
//                setFamiliaProtista("Amoebidae");
//                break;
//            default:
//                System.out.println("Opção inválida!!!");
//        }
//    }
}
