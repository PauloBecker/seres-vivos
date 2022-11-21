package Protista;

public class ProtistaGenero extends ProtistaFamilia{

    private String generoProtista;

    public ProtistaGenero() {
    }

    public ProtistaGenero(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao, String respiracao, String locomocao, String nomeReinoProtista, String nomeFiloProtista, String classeProtista, String ordemProtista, String familiaProtista, String generoProtista) {
        super(celula, materialGenetico, metabolismo, nutricao, reproducao, respiracao, locomocao, nomeReinoProtista, nomeFiloProtista, classeProtista, ordemProtista, familiaProtista);
        this.generoProtista = generoProtista;
    }

    public ProtistaGenero(String filoProtista, String classeProtista, String ordemProtista, String familiaProtista, String generoProtista) {
    }

    public String getGeneroProtista() {
        return generoProtista;
    }

    public void setGeneroProtista(String generoProtista) {
        this.generoProtista = generoProtista;
    }

//    @Override
//    public void classificar(){
//        int opc = 0;
//        System.out.println(
//                "Informe a gênero Protista: \n" +
//                        "Digite 1 - Amoeba: \n" +
//                        "Opção: ");
//        opc = scan.nextInt();
//
//
//        switch (opc){
//            case 1:
//                setGeneroProtista("Amoeba");
//                break;
//            default:
//                System.out.println("Opção inválida!!!");
//        }
//    }
}
