package Protista;

public class ProtistaGenero extends ProtistaFamilia{

    private String generoProtista;

    public ProtistaGenero() {
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
