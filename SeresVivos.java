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
                setMaterialGenetico("DNA");
                break;
            case 2:
                setMaterialGenetico("RNA");
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
        System.out.println(getMaterialGenetico());

        System.out.print(
                    "Os organismos vivos podem ser divididos, a partir do critério de nutrição, em autotróficos e heterotróficos.\n" +
                    "Digite 1 - Autotróficos\n" +
                    "Digite 2 - Heterotrófico \n" +
                    "Opção: ");
        opc = scan.nextInt();
        switch (opc){
            case 1:
                setNutricao("Autotróficos");
                break;
            case 2:
                setNutricao("Heterotrófico");
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
        System.out.println(getNutricao());

        System.out.print(
                "Os seres vivos são capazes de reproduzir-se, ou seja, produzir descendentes.\n " +
                "A reprodução pode ocorrer de forma sexuada ou de maneira Assexuada\n" +
                "Digite 1 - Sexuada\n" +
                "Digite 2 - Assexuada\n" +
                "Opção: ");
        opc = scan.nextInt();
        switch (opc){
            case 1:
                setReproducao("Sexuada");
                break;
            case 2:
                setReproducao("Assexuada");
                break;
            default:
                System.out.println("Opção inválida!!!");
        }
        System.out.println(getNutricao());
    }

}


