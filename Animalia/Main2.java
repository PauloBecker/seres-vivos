package Animalia;

import java.util.ArrayList;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		
		//aqui o array deveria ser do tipo AnimaliaEspecie, mas a classe ainda está pronta 
		ArrayList<AnimaliaEspecie> animalia = new ArrayList<>(); 
		
		ArrayList<AnimaliaEspecie> plantae = new ArrayList<>();
		
		//aqui o array deveria ser do tipo FungiEspecie, mas a classe ainda está pronta 
		ArrayList<AnimaliaEspecie> fungi = new ArrayList<>();
		
		//aqui o array deveria ser do tipo MoneraEspecie, mas a classe ainda está pronta 
		ArrayList<AnimaliaEspecie> monera = new ArrayList<>();
		
		//aqui o array deveria ser do tipo ProtozoaEspecie, mas a classe ainda está pronta 
		ArrayList<AnimaliaEspecie> protozoa = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		String continua = "sim";
		
		do {
			System.out.println("Informe a operacao que deseja realizar");
			System.out.println("Digite 1 Cadastrar Especie");
			System.out.println("Digite 2 exibir Especies cadastradas");
			int operacao = scan.nextInt();
			
			if(operacao == 1) {
				
				System.out.println("Informe o ser vivo que deseja cadastrar");
				System.out.println("Digite 1 para Animalia");
				System.out.println("Digite 2 para Plantae");
				System.out.println("Digite 3 para Fungi");
				System.out.println("Digite 4 para Monera");
				System.out.println("Digite 5 para Protozoa");
				
				int choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					AnimaliaEspecie animaliaAux = new AnimaliaEspecie();
					animaliaAux.setDados("Animalia");
					animalia.add(animaliaAux);
					break;
				case 2:
					AnimaliaEspecie plantaeAux = new AnimaliaEspecie();
					plantaeAux.setDados("Plantae");
					plantae.add(plantaeAux);
					break;
				case 3:
					AnimaliaEspecie fungiAux = new AnimaliaEspecie();
					fungiAux.setDados("Fungi");
					fungi.add(fungiAux);
					break;
				case 4:
					AnimaliaEspecie moneraAux = new AnimaliaEspecie();
					moneraAux.setDados("Monera");
					monera.add(moneraAux);
					break;
				case 5:
					AnimaliaEspecie protozoaAux = new AnimaliaEspecie();
					protozoaAux.setDados("Protozoa");
					protozoa.add(protozoaAux);
					break;
				}
			}else {
				System.out.println(animalia.toString());
				System.out.println(plantae.toString());
				System.out.println(fungi.toString());
				System.out.println(monera.toString());
				System.out.println(protozoa.toString());
			}
			System.out.println("Deseja fazer uma nova operacao?");
			continua = scan.next();
		}while(continua.equalsIgnoreCase("sim"));
	}

}