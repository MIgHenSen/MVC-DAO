package View;
import java.util.List;
import Model.Planeta;

public class PlanetaView {	
	public void exibiLIstaDePlanetas(List<Planeta> planets) {
		System.out.println(" Lista de Planetas: ");
		
		for (Planeta plan : planets) {
			System.out.println(" Planeta: " + plan.getNome());
		}
		
		System.out.println();
	}
	
	public void removePlaneta(boolean planetaRemovido) {
		if (planetaRemovido) {
			System.out.println(" Planeta Removido! ");
		} else {
			System.out.println(" Planeta n�o encontrado na lista ");
		}
	}
	
	public void limparListaDePlanetas() {
		System.out.println(" Lista Limpa! ");
	}
}
