package Protista;

public class ProtistaOrdem extends ProtistaClasse{

    private String ordemProtista;

    public ProtistaOrdem() {
        super();
    }

    public ProtistaOrdem(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao, String respiracao, String locomocao, String nomeReinoProtista, String nomeFiloProtista, String classeProtista, String ordemProtista) {
        super(celula, materialGenetico, metabolismo, nutricao, reproducao, respiracao, locomocao, nomeReinoProtista, nomeFiloProtista, classeProtista);
        this.ordemProtista = ordemProtista;
    }

    public String getOrdemProtista() {
        return ordemProtista;
    }

    public void setOrdemProtista(String ordemProtista) {
        this.ordemProtista = ordemProtista;
    }


//    @Override
//    public void classificar(){
//        int opc = 0;
//        System.out.println(
//                "Informe a ordem Protista: \n" +
//                        "Digite 1 - Tubulinida: \n" +
//                        "Opção: ");
//        opc = scan.nextInt();
//
//        switch (opc){
//            case 1:
//                setOrdemProtista("Tubulinida");
//                break;
//            default:
//                System.out.println("Opção inválida!!!");
//        }
//    }

}
