package Questao3;

public class Principal {
	public static void main(String[] args) {
		Livro livro1 = new Livro("POO: Orientação a Objetos", "Andson", 300);
		livro1.exibirDetalhes();
		
		System.out.println();
		
		Artigo artigo1 = new Artigo("Curiosidades sobre POO.", "Woquiton", "WEB");
		artigo1.exibirDetalhes();
	}

}
