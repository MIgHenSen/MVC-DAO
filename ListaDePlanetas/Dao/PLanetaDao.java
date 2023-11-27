package Dao;
import java.util.ArrayList;
import java.util.List;
import Model.Planeta;

public class PLanetaDao {
	private List<Planeta> listaDePlanetas;
	
//Construtor
	public PLanetaDao() {
		listaDePlanetas = new ArrayList<>();
	}
	
// Metodos/Funcionalidades
	public void adicionaPLaneta(Planeta planet) {
		listaDePlanetas.add(planet);
		System.out.println();
	}
	
	public List<Planeta> obtemListaDePlanetas() {
		return listaDePlanetas;
	}
	
	public void removePlaneta(Planeta planet) {
		listaDePlanetas.remove(planet);
	}
	
	public void limparListaDePlanetas() {
		listaDePlanetas.clear();
	}
}
