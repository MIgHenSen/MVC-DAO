package Principal;

/* Biblioteca (library) e uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import Controller.PlanetaController;
import java.util.InputMismatchException;
import java.util.Scanner;

// A classe principal deveria apenas inicializar o sistema
public class Main {
	public static void main(String[] args) {
		// Variavel de controller para chamada de metodos
		PlanetaController controle = new PlanetaController();
		// Declaracao de scanner, para que o codigo leia o que o usuario digitar
		Scanner lerdados = new Scanner(System.in);
		// Variavel de controle do tipo inteiro
		int opcao = -1;
		
		// Estrutura de repeticao while
		while(opcao != 0) {
			// Menu de opcoes para o usuario
			System.out.println(" MENU ");
			System.out.println(" 1. Adicionar PLaneta ");
			System.out.println(" 2. Exibir lista de planetas ");
			System.out.println(" 3. Remover planeta da lista ");
			System.out.println(" 4. Limpar lista ");
			System.out.println(" 0. Sair ");
			System.out.println(" Escolha uma opcao: ");
			
			/* As clausulas try/catch garantem o tratamento de excecoes, codigos 
			 * que nao sao totalmente atendidos e geram algum erro */
			try {
				// Variavel que recebe opcao escolhida pelo usuario
				opcao = lerdados.nextInt();
				
				/* Switch/case é uma estrutura de condição que define o código a ser 
				 * executado com base em uma comparação de valores*/
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
					System.out.println(" Op��o Inv�lida ");
				}
				
			// Tratamento de excecoes
			/* InputMismatchException indica que um elemento solicitado nao existe, 
			* ou seja, o usuario digitou algo que nao deveria */
			}catch(InputMismatchException e) {
				System.out.println(" Digite apenas valores v�lidos! ");
			}
		}
	}
}