package Questao2;

import java.util.ArrayList;
import java.util.List;

public class Exposicao {
	private String nome;
	private List<ObrasDeArte> obras;	//uma exposição possui várias obras de arte, assim, possui uma Lista de ObrasDeArte, chamado "obras"
	
	public Exposicao(String nome) {
		this.nome = nome;		//um construtor que cria o objeto com o nome inserido no parâmetro, e a lista "obras" é um ArrayList
		this.obras = new ArrayList<>();
	}
	
	public void adicionarObra(ObrasDeArte arte) {
		obras.add(arte);		//método para adicionar ObraDeArte á lista "obras", passando por parâmetro o objeto ObraDeArte que criar no Main.
	}
	
	public void exibirObras() {
		for(ObrasDeArte obra : obras) {			//método para exibir todas as obras, 
									//usando um FOR do tipo ObrasDeArte que percorre todos os objetos da lista "obras", que também é do tipo ObrasDeArte
				System.out.println("Obra: " + obra.getNome() + " | Autor: " + obra.getAutor());	//print para exibir as informações, usando as funções de retorno da classe ObraDeArte (getNome e getAutor)
		}
	}
	
	public String getNome() {
		return nome;	//getter para retornar o nome da exposição
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public List<ObrasDeArte> getObras() {
		return obras;			//getter para retornar a lista "obras" da classe Exposição, assim podendo acessar as informações de "obras" e métodos da classe ObrasDeArte em outras classes.
	}						//exemplo:Na classe MUSEU declarou uma Lista Exposicao, assim dentro do for: exposicao.getObras().getAutor() -> irá retornar o autor do objeto ObrasDeArte da lista obras, que está na classe Exposicao
	
	public void setObras(List<ObrasDeArte> obras) {
		this.obras = obras;
	}
}
