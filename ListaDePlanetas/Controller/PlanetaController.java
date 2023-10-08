package Controller;

/* Biblioteca (library) e uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.List;
import Dao.PLanetaDao;
import Model.Planeta;
import View.PlanetaView;

// A camada Controller e uma intermediaria entre dao e view
public class PlanetaController {
	
	// Atributos de dao e view
	private PLanetaDao DaoPlanet;
	private PlanetaView ViewPlanet;
	
//Construtor que referencia objetos de dao e view
	public PlanetaController() {
		DaoPlanet = new PLanetaDao();
		ViewPlanet = new PlanetaView();
	}
	
//Metodos - Funcinalidades
	
	// Metodo que recebe nome e adiciona planet a lista
	public void adicionaPlaneta(String nome) {
		Planeta planet = new Planeta(nome);
		DaoPlanet.adicionaPLaneta(planet);
	}
	
	// Metodo que chama funcao de view para exibir lista
	public void exibiListaDePlanetas() {
		List<Planeta> planets = DaoPlanet.obtemListaDePlanetas();
		ViewPlanet.exibiLIstaDePlanetas(planets);
	}
	
	// Metodo para remover planeta da lista
	public void removePlantas(String nomePlanetaRemover) {
		boolean planetaRemvido = false;
		
		for (Planeta planet : DaoPlanet.obtemListaDePlanetas()) {
			if (planet.getNome().equalsIgnoreCase(nomePlanetaRemover)) {
				DaoPlanet.removePlaneta(planet);
				planetaRemvido = true;
				break;
			}
		}
		
		ViewPlanet.removePlaneta(planetaRemvido);
	}
	
	// metodo que limpa lista
	public void limpaListaDePlanetas() {
		DaoPlanet.limparListaDePlanetas();
		ViewPlanet.limparListaDePlanetas();
	}
}