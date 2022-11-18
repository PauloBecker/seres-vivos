package Fungi;

public class Genero extends Familia {
	
	private String genero;

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	@Override
	public void Cadastro() {
		
		System.out.println("Digite o Genêro: ");
		setGenero(scan.nextLine());
		
	}
	

}

