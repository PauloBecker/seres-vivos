package Monera;

public class Classe extends Filo {
	
	private String classe;
	
	public String getClasse() {
		return classe;
	}

	public void setClasse(String classe) {
		this.classe = classe;
	}
	
	@Override
	public void Cadastro() {
		
		System.out.println("Digite a Classe: ");
		setClasse(scan.nextLine());
		
	}
	

}
