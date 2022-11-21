//Classe AnimaliaEspecie
//Herda as classes SeresVivos, AnimaliaFilo, AnimaliaClasse, AnimaliaOrdem, AnimaliaFamilia, AnimaliaGenero
//Possui 2 metodos principais: SetDados() e toSring()
// 1) SetDados() - Permite a entrada de todos os dados do ser vivo através desta herança
// 2) toString - Imprime todos os dados da ArrayList desejada (@Override)

package Animalia;

public class AnimaliaEspecie extends AnimaliaGenero{
	private String NomeAnimaliaEspecie;
		
	public AnimaliaEspecie() {
		super();
	}

	public String getNomeAnimaliaEspecie() {
		return NomeAnimaliaEspecie;
	}

	public void setNomeAnimaliaEspecie(String nomeAnimaliaEspecie) {
		NomeAnimaliaEspecie = nomeAnimaliaEspecie;
	}
			
	// Permite a entrada de todos os dados do ser vivo através desta herança
	public void setDados(String nmReino) {
		
		this.setNomeAnimalia(nmReino);
		
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
		this.setNomeAnimaliaFilo(scan.next());
		
		System.out.println("Nome da Classe:");
		this.setNomeAnimaliaClasse(scan.next());
		
		System.out.println("Nome da Ordem:");
		this.setNomeAnimaliaOrdem(scan.next());
		
		System.out.println("Nome da Familia:");
		this.setNomeAnimaliaFamilia(scan.next());
		
		System.out.println("Nome da Genero:");
		this.setNomeAnimaliaGenero(scan.next());
		
		System.out.println("Nome da Especie:");
		this.setNomeAnimaliaEspecie(scan.next());
	}
	
	// Imprime todos os dados cadastrados na classe Animalia (@Override)
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nReino: ");
		stringBuffer.append(this.getNomeAnimalia());
		
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
		stringBuffer.append(this.getNomeAnimaliaFilo());
		
		stringBuffer.append("\nClasse: ");
		stringBuffer.append(this.getNomeAnimaliaClasse());
		
		stringBuffer.append("\nOrdem: ");
		stringBuffer.append(this.getNomeAnimaliaOrdem());
		
		stringBuffer.append("\nFamilia: ");
		stringBuffer.append(this.getNomeAnimaliaFamilia());
		
		stringBuffer.append("\nGenero: ");
		stringBuffer.append(this.getNomeAnimaliaGenero());
		
		stringBuffer.append("\nEspecie: ");
		stringBuffer.append(this.getNomeAnimaliaEspecie());
		
		return stringBuffer.toString();
	}
}
