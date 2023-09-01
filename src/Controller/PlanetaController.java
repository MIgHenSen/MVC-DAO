package Controller;

import java.util.List;

import Dao.PLanetaDao;
import Model.Planeta;
import View.PlanetaView;

public class PlanetaController {
	private PLanetaDao DaoPlanet;
	private PlanetaView ViewPlanet;
	
//Construtor
	public PlanetaController() {
		DaoPlanet = new PLanetaDao();
		ViewPlanet = new PlanetaView();
	}
	
//Metodos - Funcinalidades
	public void adicionaPlaneta(String nome) {
		Planeta planet = new Planeta(nome);
		DaoPlanet.adicionaPLaneta(planet);
	}
	
	public void exibiListaDePlanetas() {
		List<Planeta> planets = DaoPlanet.obtemListaDePlanetas();
		ViewPlanet.exibiLIstaDePlanetas(planets);
	}
	
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
	
	public void limpaListaDePlanetas() {
		DaoPlanet.limparListaDePlanetas();
		ViewPlanet.limparListaDePlanetas();
	}
}