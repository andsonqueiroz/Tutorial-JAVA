package Questao3;

public class Artigo extends Publicacao{		//A classe Artigo extende para Publicação, ou seja, herda todos os atributos e métodos dela.
											//  Utiliza "extends nomeSuperClasse" na frente do nome da classe que herdará.		
	
	private String conferencia;		// Atributo da classe Artigo, Este atributo é pertencente da classe Artigo, não sendo uma herança de nenhuma classe.
									// Apesar de estarem invisíveis, esta classe agora possui todos os atributos da superclasse Publicacao
	
	
	public Artigo(String titulo, String autor, String conferencia) {	//Constructor passando os parâmetros para inserirem os dados ao criar o objeto.
		super(titulo, autor);		//Esse "SUPER(parâmetros)" é o constructor da classe mãe/superclasse, como a subclasse possui todos os atributos da superclasse, precisa preencher o constructor da superclasse.
		this.conferencia = conferencia;		
	}
	
	public void exibirDetalhes() {
		super.exibirDetalhes();			//Aqui temos um polimorfismo, estamos "reescrevendo" o método da superclasse. Chamamos ela, executando as operações do método original, e acrescentando operações específicas desta classe.
		System.out.println("Conferencia: " + conferencia);	//Para reescrever um método da superclasse, temos que criar na subclasse um método com o mesmo nome do método da super
	}														//assim pode acrescentar qualquer operação que, ao chama-la na Main, irá executar as operações do método original + operações acrescentadas da subclasse. 
}
