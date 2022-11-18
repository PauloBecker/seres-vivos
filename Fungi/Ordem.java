package Fungi;

public class Ordem extends Classe {
	
	private String ordem;

	public String getOrdem() {
		return ordem;
	}

	public void setOrdem(String ordem) {
		this.ordem = ordem;
	}
	
	@Override
	public void Cadastro() {
		
		System.out.println("Digite a Ordem: ");
		setOrdem(scan.nextLine());
		
	}
	
	

}