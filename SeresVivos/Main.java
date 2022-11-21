//Composto por 2 menus para cadastro e visualização de dados de SeresVivos em estruturas ArrayList
//Serão instanciadas 5 listas para cadastro individual de cada reino

package SeresVivos;

import java.util.ArrayList;
import java.util.Scanner;

import Animalia.AnimaliaEspecie;
import Fungi.FungiEspecie;
import Monera.MoneraEspecie;
import Plantae.PlantaeEspecie;
import Protista.ProtistaEspecie;

public class Main {

	public static void main(String[] args) {
		
		//aqui o array deveria ser do tipo AnimaliaEspecie, mas a classe ainda está pronta 
		ArrayList<AnimaliaEspecie> animalia = new ArrayList<>(); 
		
		ArrayList<PlantaeEspecie> plantae = new ArrayList<>();
		
		//aqui o array deveria ser do tipo FungiEspecie, mas a classe ainda está pronta 
		ArrayList<FungiEspecie> fungi = new ArrayList<>();
		
		//aqui o array deveria ser do tipo MoneraEspecie, mas a classe ainda está pronta 
		ArrayList<MoneraEspecie> monera = new ArrayList<>();
		
		//aqui o array deveria ser do tipo ProtozoaEspecie, mas a classe ainda está pronta 
		ArrayList<ProtistaEspecie> protozoa = new ArrayList<>();
		
		Scanner scan = new Scanner(System.in);
		int choice;
		int operacao;
		
		do {
			System.out.println("Informe a operacao (1-Cadastrar   2-Exibir   3-Sair): ");
			operacao = scan.nextInt();
			
			//Cadastro do ser vivo mediante opção desejada
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
					PlantaeEspecie plantaeAux = new PlantaeEspecie();
					plantaeAux.setDados("Plantae");
					plantae.add(plantaeAux);
					break;
				case 3:
					FungiEspecie fungiAux = new FungiEspecie();
					fungiAux.setDados("Fungi");
					fungi.add(fungiAux);
					break;
				case 4:
					MoneraEspecie moneraAux = new MoneraEspecie();
					moneraAux.setDados("Monera");
					monera.add(moneraAux);
					break;
				case 5:
					ProtistaEspecie protozoaAux = new ProtistaEspecie();
					protozoaAux.setDados("Protozoa");
					protozoa.add(protozoaAux);
					break;
				default:
					System.out.println("Reino inválido.");
				}
			}
			// Visualização da lista do ser vivo escolhido
			else if (operacao == 2) {
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