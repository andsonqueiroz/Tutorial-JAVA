//Andson de Queiroz Domingues, 3ADS

package Questao1;

public class Livro {
	private String titulo;
	private String autor;
	private String editora;
	private int nroPaginas;
	private double preco;
	
	public Livro(String titulo, String autor, String editora, int nroPaginas, double preco) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
		this.nroPaginas = nroPaginas;
		this.preco = preco;
	}
	
	public String getTitulo() {
		return titulo;
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
		this.titulo = titulo;
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
	
	public void exibirLivro() {
		System.out.println("Titulo: " + getTitulo() + " | Autor" + getAutor());
	}
}
