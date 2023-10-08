package View;

/* Biblioteca (library) e uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.List;
import Model.Planeta;

// A camada View e responsavel por exibir conteudos ao usuario 
public class PlanetaView {	
	
	// Metodo que recebe lista de paises e a exibe
	public void exibiLIstaDePlanetas(List<Planeta> planets) {
		System.out.println(" Lista de Planetas: ");
		
		for (Planeta plan : planets) {
			System.out.println(" Planeta: " + plan.getNome());
		}
		
		System.out.println();
	}
	
	/* Metodo de mensagem para o usuario, confirmando  remocao
	 * da lista */ 
	public void removePlaneta(boolean planetaRemovido) {
		if (planetaRemovido) {
			System.out.println(" Planeta Removido! ");
		} else {
			System.out.println(" Planeta n�o encontrado na lista ");
		}
	}
	
	/* Metodo de mensagem para o usuario, confirmando que lista foi 
	 * limpa*/
	public void limparListaDePlanetas() {
		System.out.println(" Lista Limpa! ");
	}
}