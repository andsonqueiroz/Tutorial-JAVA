package AtividadeBD;

import java.util.Date;

public class Tarefa {
	
	private int id;
	private String titulo;			// Os mesmos atributos que contém na tabela "tarefa" no banco de dados.
	private String descricao;
	private Date dataCriacao;
	
	public Tarefa(String titulo, String descricao) {
		this.titulo = titulo;				//Construtor para criar o objeto TAREFA com as informações dos parâmetros inseridas.
		this.descricao = descricao;
	}

	
	/* GETTERS E SETTERS */
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	
}
