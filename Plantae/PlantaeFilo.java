package Plantae;

public class PlantaeFilo extends Plantae{

	String nomeFilo;
	
	public PlantaeFilo(String nome, String nomeFilo) {
		super(nome);
		this.nomeFilo = nomeFilo;
		
	}

	public PlantaeFilo() {
		super();
	}

	public String getNomeFilo() {
		return nomeFilo;
	}

	public void setNomeFilo(String nomeFilo) {
		this.nomeFilo = nomeFilo;
	}
	
}
