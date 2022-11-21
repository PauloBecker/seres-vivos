package Plantae;

public class PlantaeFamilia extends PlantaeOrdem{
	
	String nomeFamilia;
	
	public PlantaeFamilia(String nome, String nomeFilo, String nomeClasse, String nomeOrdem, String nomeFamilia) {
		super(nome, nomeFilo, nomeClasse, nomeOrdem);
		this.nomeFamilia = nomeFamilia;
		
	}

	public PlantaeFamilia() {
		super();
	}

	public String getNomeFamilia() {
		return nomeFamilia;
	}

	public void setNomeFamilia(String nomeFamilia) {
		this.nomeFamilia = nomeFamilia;
	}
}
