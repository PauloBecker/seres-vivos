package Plantae;

public class PlantaeEspecie extends PlantaeGenero{

	String nomeEspecie;
	
	public PlantaeEspecie(String nome, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia,
			String nomeGenero, String nomeEspecie) {
		super(nome, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia, nomeGenero);
		this.nomeEspecie = nomeEspecie;
		
	}

	public PlantaeEspecie() {
		super();
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
	 @Override
	public void setDados(String nmReino) {
		
		this.setNome(nmReino);
		
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
		
		System.out.println("Nome da Especie:");
		this.setNomeEspecie(scan.next());
		
		System.out.println("Nome da Genero:");
		this.setNomeGenero(scan.next());
				
		System.out.println("Nome da Familia:");
		this.setNomeFamilia(scan.next());
		
		System.out.println("Nome da Ordem:");
		this.setNomeOrdem(scan.next());
		
		System.out.println("Nome da Classe:");
		this.setNomeClasse(scan.next());
		
		System.out.println("Nome da Filo:");
		this.setNomeFilo(scan.next());
	}
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nReino: ");
		stringBuffer.append(this.getNome());
		
		stringBuffer.append("\nFilo: ");
		stringBuffer.append(this.getNomeFilo());
		
		stringBuffer.append("\nClasse: ");
		stringBuffer.append(this.getNomeClasse());
		
		stringBuffer.append("\nOrdem: ");
		stringBuffer.append(this.getNomeOrdem());
		
		stringBuffer.append("\nFamilia: ");
		stringBuffer.append(this.getNomeFamilia());
		
		stringBuffer.append("\nGenero: ");
		stringBuffer.append(this.getNomeGenero());
		
		stringBuffer.append("\nEspecie: ");
		stringBuffer.append(this.getNomeEspecie());
		
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
		
		return stringBuffer.toString();
	}
}
