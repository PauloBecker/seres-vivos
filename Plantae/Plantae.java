//feito por Bruno Wilke

package Plantae;

import SeresVivos.SeresVivos;

public class Plantae extends SeresVivos{
	
	String nomeReino = "Plantae";
	
	public Plantae(String nome) {
		super();
		this.nomeReino = nome;
	}

	public Plantae() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nomeReino;
	}

	public void setNome(String nome) {
		this.nomeReino = nome;
	}
	
}
