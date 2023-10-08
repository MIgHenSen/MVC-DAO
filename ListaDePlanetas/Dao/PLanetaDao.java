package Dao;

/* Biblioteca (library) e uma coleção de subprogramas, que contem dados
 * auxiliares. Chamamos essas bibliotecas através dos imports */
import java.util.ArrayList;
import java.util.List;
import Model.Planeta;

// A camada Dao e responsavel pela manipulacao de informacoes
public class PLanetaDao {
	// Atributo do tipo lista
	private List<Planeta> listaDePlanetas;
	
//Construtor para refenciar lista
	public PLanetaDao() {
		listaDePlanetas = new ArrayList<>();
	}
	
// Metodos/Funcionalidades
	// Metodo que recebe um objeto e adicna-o a lista
	public void adicionaPLaneta(Planeta planet) {
		listaDePlanetas.add(planet);
		System.out.println();
	}
	
	// Metodo que retorna lista de planetas
	public List<Planeta> obtemListaDePlanetas() {
		return listaDePlanetas;
	}
	
	// Metodo que remove objeto da lista
	public void removePlaneta(Planeta planet) {
		listaDePlanetas.remove(planet);
	}
	
	// Metodo que esvazia lista
	public void limparListaDePlanetas() {
		listaDePlanetas.clear();
	}
}