package Fungi;

import java.util.Scanner;

public class Filo {
	
	Scanner scan = new Scanner(System.in);
	private String filo;
	
	public Filo() {
		super();
	}

	public Filo(String filo) {
		super();
		this.filo = filo;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}
	
	public void Cadastro() {
		
		System.out.println("Digite o Filo: ");
		setFilo(scan.nextLine());
		
	}

}