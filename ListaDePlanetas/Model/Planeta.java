package Model;

/* Classes sao representacoes de coisas do mundo real, onde normalmente 
 * declaramos atributos e metodos, que representam, respectivamente as 
 * caracteristicas e comportamentos desse objeto */
public class Planeta {
	// Atributo nome(String, conjunto de caracteres)
	private String nome;
	
/* Construtor, que torna obrigatório as informacoes para referenciar
 * esse objeto */
	public Planeta(String nome) {
		this.nome = nome;
	}

//Gets e Sets
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}