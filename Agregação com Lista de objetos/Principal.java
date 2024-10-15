package Questao2;

public class Principal {

	public static void main(String[] args) {
		Museu museu = new Museu("Museu da Artes");		//criando o objeto Museu
		
		ObrasDeArte obra1 = new ObrasDeArte("Mona lisa", "Leo da Vinci");		//criando os objetos ObrasDeArte
		ObrasDeArte obra2 = new ObrasDeArte("Noite estrelada", "Van Gogh");
		
		Exposicao exposicao1 = new Exposicao("Exposicao primária");		//criando uma exposição		(objeto Exposicao)
		exposicao1.adicionarObra(obra1);		//adicionando a obra de arte na exposição	(objeto ObrasDeArte)
		
		Exposicao exposicao2 = new Exposicao("Exposicao secundária");	//criando outra Exposição 	(objeto Exposicao)
		exposicao2.adicionarObra(obra2);			//adicionando outra obra de arte na exposição 	(objeto ObrasDeArte)
		
		museu.adicionarExposicao(exposicao1);	//adicionando a primeira exposição no Museu
		museu.adicionarExposicao(exposicao2);	//adicionando a segunda exposição criada no Museu
		
		museu.exibirExposicoes();	//Exibindo as exposições e suas obras.
	}

}
