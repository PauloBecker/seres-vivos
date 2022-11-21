package Plantae;

public class PlantaeClasse extends PlantaeFilo{

	String nomeClasse;
	
	public PlantaeClasse(String nome, String nomeFilo, String nomeClasse) {
		super(nome, nomeFilo);
		this.nomeClasse = nomeClasse;
		
	}

	public PlantaeClasse() {
		super();
	}

	public String getNomeClasse() {
		return nomeClasse;
	}

	public void setNomeClasse(String nomeClasse) {
		this.nomeClasse = nomeClasse;
	}

}
