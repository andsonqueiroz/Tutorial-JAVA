package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Museu {
	private String nome;	//atributos de Museu
	private List<Exposicao> exposicoes;		//um Museu possui várias exposições, assim, possui uma LISTA de EXPOSIÇÕES
	
	public Museu(String nome) {
		this.nome = nome;			//construtor, que na hora de criar o objeto recebe como parâmetro o nome
		this.exposicoes = new ArrayList<>();	// e a lista "exposicoes" é um ArrayList
	}
	
	public void adicionarExposicao(Exposicao exposicao) {
		exposicoes.add(exposicao);		//método para adicionar uma nova exposição á lista (o objeto Exposição que for criado no Main será passado por parâmetro
	}									//assim adicionando na lista de exposições do Museu ( exposicoes.add() )
	
	public void exibirExposicoes() {		//método para exibir todas as exposições e suas obras de arte
		
		for(Exposicao exposicao : exposicoes) {		//FOR do tipo objeto Exposicao, que percorre todos os objetos da lista "exposicoes"
			System.out.println("Exposicao: " + exposicao.getNome());	//imprime o nome da exposição através do getter da classe Exposicao ( exposicao.getNome() )
			
			for(ObrasDeArte obra : exposicao.getObras()) {		//outro FOR do tipo ObrasDeArte que percorre todos os objetos da lista "obras", da lista "exposições" do Museu, através do getter que retorna a lista obras ( exposicao.getObras() )
				System.out.println("Obra: " + obra.getNome());	//imprime o nome da obra
			}
		}
	}
	
	public String getNome() {
		return nome;	//getter para retornar o nome do museu
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Exposicao> getExposicoes() {
		return exposicoes;		//getter para retornar a lista de EXPOSICOES do MUSEU
	}

}
