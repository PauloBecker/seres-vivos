package Animalia;

import java.util.Scanner;

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
			
	public void setDados(String nmReino) {
		
		this.setNomeAnimalia(nmReino);
		
		System.out.println("Nome da Especie:");
		this.setNomeAnimaliaEspecie(scan.next());
		
		System.out.println("Nome da Genero:");
		this.setNomeAnimaliaGenero(scan.next());
				
		System.out.println("Nome da Familia:");
		this.setNomeAnimaliaFamilia(scan.next());
		
		System.out.println("Nome da Ordem:");
		this.setNomeAnimaliaOrdem(scan.next());
		
		System.out.println("Nome da Classe:");
		this.setNomeAnimaliaClasse(scan.next());
		
		System.out.println("Nome da Filo:");
		this.setNomeAnimaliaFilo(scan.next());
	}
	
	@Override
	public String toString() {
		
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("\nReino: ");
		stringBuffer.append(this.getNomeAnimalia());
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
