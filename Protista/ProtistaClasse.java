package Protista;

public class ProtistaClasse extends ProtistaFilo{

    private String classeProtista;


   public String getClasseProtista() {
        return classeProtista;
    }
    public void setClasseProtista(String classeProtista) {
        this.classeProtista = classeProtista;
    }

//    @Override
//    public void classificar(){
//
//        int opc = 0;
//        System.out.println(
//                "Informe a classe do reino Protista: \n" +
//                        "Digite 1 - Kinetoplastea: \n" +
//                        "Digite 2 - Tubulinea" +
//                        "Opção: ");
//        opc = scan.nextInt();
//
//
//        switch (opc){
//            case 1:
//                setClasseProtista("Kinetoplastea");
//                break;
//            case 2:
//                setClasseProtista("Tubulinea");
//                break;
//            default:
//                System.out.println("Opção inválida!!!");
//        }
//    }
}
