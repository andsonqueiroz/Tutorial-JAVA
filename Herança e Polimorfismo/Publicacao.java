package Questao3;

public class Publicacao {		// PUBLICACAO é a classe mãe, todas as outras classes que possuirem "extends Publicacao" herdarão os métodos e atributos desta classe
	
	protected String titulo;		//Atributos da classe. #PROTECTED podem ser acessados nas classes mães e nas subclasses.	
	protected String autor;

	public Publicacao(String titulo, String autor) {
		this.titulo = titulo;		//Constructor da superclasse.
		this.autor = autor;
	}
	
	public void exibirDetalhes() {
		System.out.println("Titulo: " + titulo);		//Método da superclasse
		System.out.println("Autor: " + autor);
	}
}
