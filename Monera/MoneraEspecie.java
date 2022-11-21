package Monera;

public class MoneraEspecie extends MoneraGenero {
	
	private String especie;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	public void setDados(String nmReino) {
		
		this.setNomeMonera(nmReino);
		
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
	
    @Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nReino: ");
		stringBuffer.append(this.getNomeMonera());
		
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
	
	


