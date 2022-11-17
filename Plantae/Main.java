package Plantae;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//aqui o array deveria ser do tipo AnimaliaEspecie, mas a classe ainda está pronta 
		ArrayList<PlantaeEspecie> animalia = new ArrayList<>(); 
		
		ArrayList<PlantaeEspecie> plantae = new ArrayList<>();
		
		//aqui o array deveria ser do tipo FungiEspecie, mas a classe ainda está pronta 
		ArrayList<PlantaeEspecie> fungi = new ArrayList<>();
		
		//aqui o array deveria ser do tipo MoneraEspecie, mas a classe ainda está pronta 
		ArrayList<PlantaeEspecie> monera = new ArrayList<>();
		
		//aqui o array deveria ser do tipo ProtozoaEspecie, mas a classe ainda está pronta 
		ArrayList<PlantaeEspecie> protozoa = new ArrayList<>();
		
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
				
				System.out.println("Digite o nome da Especie:");
				String especie = scan.next();
				
				System.out.println("Digite o nome da Genero:");
				String genero = scan.next();
				
				System.out.println("Digite o nome da Familia:");
				String familia = scan.next();
				
				System.out.println("Digite o nome da Ordem:");
				String ordem = scan.next();
				
				System.out.println("Digite o nome da Classe:");
				String classe = scan.next();
				
				System.out.println("Digite o nome da Filo:");
				String filo = scan.next();
				
				switch(choice) {
				case 1:
					animalia.add(new PlantaeEspecie("Animalia", filo, classe, ordem, familia, genero, especie));
					break;
				case 2:
					plantae.add(new PlantaeEspecie("Plantae", filo, classe, ordem, familia, genero, especie));
					break;
				case 3:
					fungi.add(new PlantaeEspecie("Fungi", filo, classe, ordem, familia, genero, especie));
					break;
				case 4:
					monera.add(new PlantaeEspecie("Monera", filo, classe, ordem, familia, genero, especie));
					break;
				case 5:
					protozoa.add(new PlantaeEspecie("Protozoa", filo, classe, ordem, familia, genero, especie));
					break;
				}
			}else {
				System.out.println(animalia.toString());
				System.out.println(plantae.toString());
				System.out.println(fungi.toString());
				System.out.println(monera.toString());
				System.out.println(protozoa.toString());
			}
			System.out.println("Diseja fazer uma nova operacao?");
			continua = scan.next();
		}while(continua.equalsIgnoreCase("sim"));
	}

}
