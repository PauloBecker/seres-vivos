package Monera;

import java.util.Scanner;

public class MoneraFilo extends Monera {
	
	Scanner scan = new Scanner(System.in);
	private String filo;
	
	public MoneraFilo() {
		super();
	}

	public MoneraFilo(String filo) {
		super();
		this.filo = filo;
	}

	public String getFilo() {
		return filo;
	}

	public void setFilo(String filo) {
		this.filo = filo;
	}
	
}
