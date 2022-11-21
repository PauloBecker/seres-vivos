package Monera;

public class MoneraEspecie extends Genero {
	
	private String especie;

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}
	
	@Override
	public void Cadastro() {
		
		System.out.println("Digite a Espécie: ");
		setEspecie(scan.nextLine());
		
	}
	
	

}
