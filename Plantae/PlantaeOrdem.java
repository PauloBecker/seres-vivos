package Plantae;

public class PlantaeOrdem extends PlantaeClasse{

	String nomeOrdem;
	public PlantaeOrdem(String nome, String nomeFilo, String nomeClasse, String nomeOrdem) {
		super(nome, nomeFilo, nomeClasse);
		this.nomeOrdem = nomeOrdem;
		
	}
	public PlantaeOrdem() {
		super();
	}
	public String getNomeOrdem() {
		return nomeOrdem;
	}
	public void setNomeOrdem(String nomeOrdem) {
		this.nomeOrdem = nomeOrdem;
	}

}
