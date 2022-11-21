package SeresVivos;

import java.util.Scanner;

public class SeresVivos {
    public Scanner scan = new Scanner(System.in);
    
    private String celula;

    private String materialGenetico;

    private String metabolismo;

    private String nutricao;

    private String reproducao;

    private String respiracao;

    private String locomocao;
    
    private String nomePopular;
    
    private String reino;
    
    private String filo;
    
    private String classe;
    
    private String ordem;
    
    private String familia;
    
    private String genero;
    
    private String especie;
    
    
    public SeresVivos(String celula, String materialGenetico, String metabolismo, String nutricao, String reproducao,
			String respiracao, String locomocao, String nomePopular, String reino, String filo, String classe,
			String ordem, String familia, String genero, String especie) {
		super();
		this.celula = celula;
		this.materialGenetico = materialGenetico;
		this.metabolismo = metabolismo;
		this.nutricao = nutricao;
		this.reproducao = reproducao;
		this.respiracao = respiracao;
		this.locomocao = locomocao;
		this.nomePopular = nomePopular;
		this.reino = reino;
		this.filo = filo;
		this.classe = classe;
		this.ordem = ordem;
		this.familia = familia;
		this.genero = genero;
		this.especie = especie;
	}

	public String getRespiracao() {
        return respiracao;
    }

    public void setRespiracao(String respiracao) {
        this.respiracao = respiracao;
    }

    public String getNomePopular() {
		return nomePopular;
	}

	public void setNomePopular(String nomePopular) {
		this.nomePopular = nomePopular;
	}

	public String getLocomocao() {
        return locomocao;
    }

    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
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
    
    
	public String getReino() {
		return reino;
	}

	public void setReino(String reino) {
		this.reino = reino;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}

	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	public void setDados(String nmReino) {
		
		this.setReino(nmReino);
		
		System.out.println("Nome Popular: ");
		this.setNomePopular(scan.next());
		
		System.out.println("Tipo de organismo (Unicelular ou Multicelular): ");
		this.setCelula(scan.next());
		
		System.out.println("Tipo de material genético (DNA ou RNA): ");
		this.setMaterialGenetico(scan.next());
		
		System.out.println("Critério de nutrição (Autotróficos ou Heterotróficos: ");
		this.setNutricao(scan.next());
		
		System.out.println("Tipo de reprodução (Sexuada ou Assexuada): ");
		this.setReproducao(scan.next());
		
		System.out.println("Tipo de respiração (Aeróbia ou Anaeróbia: ");
		this.setRespiracao(scan.next());
		
		System.out.println("Tipo de locomoção (Autônoma ou Imóvel: ");
		this.setLocomocao(scan.next());
		
		System.out.println("Tipo de metabolismo (Via degradativa ou Via biossintética): ");
		this.setMetabolismo(scan.next());
		
		System.out.println("Nome da Filo:");
		this.setFilo(scan.next());
		
		System.out.println("Nome da Classe:");
		this.setClasse(scan.next());
		
		System.out.println("Nome da Ordem:");
		this.setOrdem(scan.next());
		
		System.out.println("Nome da Familia:");
		this.setFamilia(scan.next());
		
		System.out.println("Nome da Genero:");
		this.setGenero(scan.next());	
		
		System.out.println("Nome da Especie:");
		this.setEspecie(scan.next());
				
	}
	
    
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nReino: ");
		stringBuffer.append(this.getReino());
		
		stringBuffer.append("\nNome Popular: ");
		stringBuffer.append(this.getNomePopular());
		
		stringBuffer.append("\nTipo de organismo: ");
		stringBuffer.append(this.getCelula());
		
		stringBuffer.append("\nTipo de material genético: ");
		stringBuffer.append(this.getMaterialGenetico());
		
		stringBuffer.append("\nCritério de nutrição: ");
		stringBuffer.append(this.getNutricao());
		
		stringBuffer.append("\nTipo de reprodução: ");
		stringBuffer.append(this.getReproducao());
		
		stringBuffer.append("\nTipo de respiração: ");
		stringBuffer.append(this.getRespiracao());
		
		stringBuffer.append("\nTipo de locomoção: ");
		stringBuffer.append(this.getLocomocao());
		
		stringBuffer.append("\nTipo de metabolismo: ");
		stringBuffer.append(this.getMetabolismo());
		
		stringBuffer.append("\nFilo: ");
		stringBuffer.append(this.getFilo());
		
		stringBuffer.append("\nClasse: ");
		stringBuffer.append(this.getClasse());
		
		stringBuffer.append("\nOrdem: ");
		stringBuffer.append(this.getOrdem());
		
		stringBuffer.append("\nFamilia: ");
		stringBuffer.append(this.getFamilia());
		
		stringBuffer.append("\nGenero: ");
		stringBuffer.append(this.getGenero());
		
		stringBuffer.append("\nEspecie: ");
		stringBuffer.append(this.getEspecie());
		
		return stringBuffer.toString();
	}
}




