import java.util.Scanner;

public class SeresVivos {

    Scanner scan = new Scanner(System.in);
    private String celula;

    private String materialGenetico;

    private String metabolismo;

    private String nutricao;

    private String reproducao;

    public SeresVivos(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao) {
        this.celula = celula;
        this.materialGenetico = materialGenetico;
        this.metabolismo = metabolismo;
        this.nutricao = nutricao;
        this.reproducao = reproducao;
    }

    public SeresVivos() {

    }

    public String getCelula() {
        return celula;
    }

    public void setCelula(String celula) {
        this.celula = celula;
    }

    public String getMaterialGenetico() {
        return materialGenetico;
    }

    public void setMaterialGenetico(String materialGenetico) {
        this.materialGenetico = materialGenetico;
    }

    public String getMetabolismo() {
        return metabolismo;
    }

    public void setMetabolismo(String metabolismo) {
        this.metabolismo = metabolismo;
    }

    public String getNutricao() {
        return nutricao;
    }

    public void setNutricao(String nutricao) {
        this.nutricao = nutricao;
    }

    public String getReproducao() {
        return reproducao;
    }

    public void setReproducao(String reproducao) {
        this.reproducao = reproducao;
    }


    public void entradaDeDados(){

        int opc = 0;


        System.out.println("============ CLASIFICAÇÃO DE SERES VIVOS =============");
        System.out.print("Informe se o organismo é unicelular ou multicelular:\n" +
                "Digite 1 - Unicelular \n" +
                "Digite 2 - Multicelular \n" +
                "Opção: ");
        opc = scan.nextInt();
        switch (opc){
            case 1:
                setCelula("Unicelular");
                break;
            case 2:
                setCelula("Multicelular");
                break;
            default:
                System.out.println("Opção inválida!!!");

        }
        System.out.println(getCelula());
        System.out.print("Quanto ao material genético informe:\n" +
                "Digite 1 - DNA \n" +
                "Digite 2 - RNA \n" +
                "Opção: ");
        opc = scan.nextInt();
        switch (opc){
            case 1 :
                setMaterialGenetico("DNS");
                break;
            case 2:
                setMaterialGenetico("RNA");
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
        System.out.println(getMaterialGenetico());
    }

}


