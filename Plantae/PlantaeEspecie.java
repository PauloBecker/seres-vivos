package Plantae;

public class PlantaeEspecie extends PlantaeGenero{

	String nomeEspecie;
	
	public PlantaeEspecie(String nome, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia,
			String nomeGenero, String nomeEspecie) {
		super(nome, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia, nomeGenero);
		this.nomeEspecie = nomeEspecie;
		
	}

	public String getNomeEspecie() {
		return nomeEspecie;
	}

	public void setNomeEspecie(String nomeEspecie) {
		this.nomeEspecie = nomeEspecie;
	}
	
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
		
		return stringBuffer.toString();
	}
}
