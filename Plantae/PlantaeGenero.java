package Plantae;

public class PlantaeGenero extends PlantaeFamilia{

	String nomeGenero;
	
	public PlantaeGenero(String nome, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia, String nomeGenero) {
		super(nome, nomeFilo, nomeClasse, nomeOrdem, nomeFamilia);
		this.nomeGenero = nomeGenero;
		// TODO Auto-generated constructor stub
	}

	public PlantaeGenero() {
		super();
	}

	public String getNomeGenero() {
		return nomeGenero;
	}

	public void setNomeGenero(String nomeGenero) {
		this.nomeGenero = nomeGenero;
	}

}
