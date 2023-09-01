package Principal;

import Controller.PlanetaController;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		PlanetaController controle = new PlanetaController();
		Scanner lerdados = new Scanner(System.in);
		int opcao = -1;
		
		while(opcao != 0) {
			System.out.println(" MENU ");
			System.out.println(" 1. Adicionar PLaneta ");
			System.out.println(" 2. Exibir lista de planetas ");
			System.out.println(" 3. Remover planeta da lista ");
			System.out.println(" 4. Limpar lista ");
			System.out.println(" 0. Sair ");
			System.out.println(" Escolha uma opcao: ");
			
			try {
				opcao = lerdados.nextInt();
				
				switch(opcao) {
				case 1:
					System.out.println(" Digite o nome do planeta: ");
					lerdados.nextLine();
					String nome = lerdados.nextLine();
					
					controle.adicionaPlaneta(nome);
					break;
				case 2:
					controle.exibiListaDePlanetas();
					break;
				case 3:
					System.out.println(" Digite o nome do planeta a ser removido: ");
					lerdados.nextLine();
					String planetaRemovido = lerdados.nextLine();
					
					controle.removePlantas(planetaRemovido);
					break;
				case 4:
					controle.limpaListaDePlanetas();
					break;
				case 0:
					System.out.println(" Saindo... ");
					break;
				default:
					System.out.println(" Opção Inválida ");
				}
			}catch(InputMismatchException e) {
				System.out.println(" Digite apenas valores válidos! ");
			}
		}
	}
}