//Andson de Queiroz Domingues, 3ADS

package Questao1;

public class Encapsulamento {
	private String titulo;		// atributos privados, na qual ficarão invisiveis em outras classes
	private String autor;
	private String editora;
	private int nroPaginas;
	private double preco;
	
	public Livro(String titulo, String autor, String editora, int nroPaginas, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;			// construtor, para inserir dados na hora de criar o objeto
		this.nroPaginas = nroPaginas;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;			//o GET é um método para retornar dado do atributo privado (já que serão invisíveis, não podem ser chamados ou alterados diretamente.)
	}
	
	public String getAutor() {
		return autor;
	}
	
	public String getEditora() {
		return editora;
	}
	
	public int getNroPaginas() {
		return nroPaginas;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;			// o SET é um método para setar informações nos atributos privados, já que serão invisíveis, não podem ser chamados ou alterados diretamente.
	}
	
	public void setAutor(String autor) {
		this.autor = autor;
	}
	
	public void setEditora(String editora) {
		this.editora = editora;
	}
	
	public void setNroPaginas(int nroPaginas) {
		this.nroPaginas = nroPaginas;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void exibirLivro() {			// método para exibir as informações.
		System.out.println("Titulo: " + getTitulo() + " | Autor" + getAutor());
	}
}
