package Protista;

public class ProtistaFamilia extends ProtistaOrdem{

    private String familiaProtista;

    public ProtistaFamilia() {
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
