package Questao2;

public class ObrasDeArte {
	private String nome;	//atributos do objeto
	private String autor;
	
	public ObrasDeArte(String nome, String autor) {
		this.nome = nome;		//Construtor para criar o objeto com informações inseridas (no parâmetro)
		this.autor = autor;
	}
	
	public String getNome() {
		return nome;		//GETTER que retorna o nome da obra de arte
	}
	
	public String getAutor() {
		return autor;		// GETTER que retorna o autor da obra de arte
	}
}
