package Protista;

import Animalia.AnimaliaEspecie;

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
		int choice;
		int operacao;
		
		do {
			System.out.println("Informe a operacao (1-Cadastrar   2-Exibir   3-Sair): ");
			operacao = scan.nextInt();
			
			if(operacao == 1) {
				
				System.out.println("Informe o ser vivo que deseja cadastrar: ");
				System.out.println("1-Animalia   2-Plantae  3-Fungi  4-Monera   5-Protozoa: ");
				choice = scan.nextInt();
				
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
				default:
					System.out.println("Reino inválido.");
				}
			}else if (operacao == 2) {
				System.out.println("Informe a lista do ser vivo que deseja visualizar: ");
				System.out.println("1-Animalia   2-Plantae  3-Fungi  4-Monera   5-Protozoa: ");
				choice = scan.nextInt();
				
				switch(choice) {
				case 1:
					System.out.println(animalia.toString());
					break;
				case 2:
					System.out.println(plantae.toString());
					break;
				case 3:
					System.out.println(fungi.toString());
					break;
				case 4:
					System.out.println(monera.toString());
					break;
				case 5:
					System.out.println(protozoa.toString());
					break;
				default:
					System.out.println("Reino inválido.");
				}
			}
		}while (operacao != 3);
	}
}