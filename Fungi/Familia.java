package Fungi;

public class Familia extends Ordem {
	
	private String familia;

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}
	
	@Override
	public void Cadastro() {
		
		System.out.println("Digite a Família: ");
		setFamilia(scan.nextLine());
		
	}
	
	

}
