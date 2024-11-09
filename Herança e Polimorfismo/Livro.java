package Questao3;

// * A classe Livro extende para Publicação, ou seja, todos os métodos e atributos de Publicação foram herdadas para Livro.
public class Livro extends Publicacao{	
	private int numeroPaginas;		//Esse atributo só a classe Livro terá, ou seja, é um atributo próprio da subclasse Livro.
	// Apesar de estarem invisíveis, esta classe agora possui todos os atributos da superclasse Publicacao
	
	
	public Livro(String titulo, String autor, int numero) {
		super(titulo, autor);	// Esse "SUPER(parâmetros)" é o constructor da classe mãe/superclasse,
					// como a subclasse possui todos os atributos da superclasse, precisa preencher o constructor da superclasse.
		this.numeroPaginas = numero;	
	}
	
// * Aqui temos um polimorfismo, estamos "reescrevendo" o método da superclasse.
	public void exibirDetalhes() { 
		super.exibirDetalhes();		// Chamamos ela, executando as operações do método original, e acrescentando operações específicas desta classe.
		System.out.println("Numero de paginas do livro " + titulo + ": " + numeroPaginas);
		//Para reescrever um método da superclasse, temos que criar na subclasse um método com o mesmo nome do método da super
		//assim pode acrescentar qualquer operação que, ao chama-la na Main, irá executar as operações do método original + operações acrescentadas da subclasse. 
	}
}
