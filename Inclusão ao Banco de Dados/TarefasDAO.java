package AtividadeBD;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TarefasDAO {
	
	public void adicionarTarefa(Tarefa tarefa) {		// Método para adicionar tarefa ao banco de dados
	
		String sql = "INSERT INTO tarefas(titulo, descricao) VALUES(?, ?)";		// comando para adicionar no mysql
		
		PreparedStatement ps = null;		// Preparar o comando SQL para ser executado no banco de dados
		
		try {	// TRY tenta executar esse bloco, caso der algum erro, irá executar o CATCH
			
			ps = Conexao.criarConexao().prepareStatement(sql);		// Estabeçece a conexão com o banco de dados e prepara (envia ao bd) a string "sql" contendo o comando de inserção para ser executado
//O método criarConexao() deve retornar um objeto do tipo Connection, que é a classe responsável por gerenciar a comunicação entre o Java e o banco de dados. 
			
			
			ps.setString(1, tarefa.getTitulo());	// O método setString() é usado para definir o valor de um parâmetro que espera uma string no comando SQL.
// Os parâmetros em um PreparedStatement são representados por pontos de interrogação (?) e são indexados a partir de 1 (ou seja, o primeiro ? tem índice 1, o segundo ? tem índice 2, e assim por diante).
			
			
			ps.setString(2, tarefa.getDescricao());		// o "2" se refere ao segundo parâmetro "?", e o getDescricao() é a string que irá substituir o "?"
			
			ps.execute();		// Executa o comando da string "sql", que foi enviada ao banco através do comando prepareStatement(sql)
			
			System.out.println("Tarefa criada com sucesso!");
			
			ps.close();
		
		} catch (SQLException e) {
			e.printStackTrace();		// Caso o TRY der erro, executa o CATCH e exibe a mensagem de erro
		}	
				
	}
	
	
	
	public void listarTarefas() {		// Método para consultar a tabela TAREFAS e exibir todas as tarefas
		
		String sql = "SELECT * FROM tarefas";		// Sintaxe para mostrar todos os dados da tabela no mysql
		
		PreparedStatement ps = null;	// O comando SQL é preparado com PreparedStatement
		
	    ResultSet rs = null;		// A consulta é executada com executeQuery() que retorna um ResultSet contendo os dados da consulta.
	    
	    try {
	    	
            ps = Conexao.criarConexao().prepareStatement(sql);
            
            rs = ps.executeQuery(); // Executa a consulta SELECT e retorna o resultado

            // Processa o resultado da consulta
            while (rs.next()) {				// while para obter os dados de cada tarefa e exibi-los.
                
                int id = rs.getInt("id");		// cria uma variável ID para guardar o dado do retorno da coluna "id" da tabela
                
                String titulo = rs.getString("titulo");		// variável TITULO para guardar o dado da coluna "titulo" da tabela do banco de dados
                
                String descricao = rs.getString("descricao");		// variável DESCRICAO para guardar o dado da coluna "descricao"

               
                System.out.println("ID: " + id);
                System.out.println("Título: " + titulo);		//Imprime as informações (as variáveis que guardaram os retornos da consulta da tabela)
                System.out.println("Descrição: " + descricao);
                System.out.println("----------------------------");
            }

            rs.close();
            
            ps.close();
            
        } catch (SQLException e) {		
            e.printStackTrace();
        }
	}
	
	
	
	public void excluirTarefa(String titulo) {
		String sql = "delete from tarefas where titulo = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.criarConexao().prepareStatement(sql);
			
			ps.setString(1, titulo);
			
			ps.execute();
			
			System.out.println("Tarefa excluída com sucesso!");
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void editarTitulo(String novoTitulo, String titulo) {
		String sql = "update tarefas set titulo = ? where titulo = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.criarConexao().prepareStatement(sql);
			
			ps.setString(1, novoTitulo);
			ps.setString(2, titulo);
			
			ps.execute();
			
			System.out.println("Título da tarefa: " + titulo + " editada para: " + novoTitulo);
			
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public void editarDescricao(String novaDesc, String titulo) {
		String sql = "UPDATE tarefas SET descricao = ? where titulo = ?";
		
		PreparedStatement ps = null;
		
		try {
			ps = Conexao.criarConexao().prepareStatement(sql);
			
			ps.setString(1, novaDesc);
			ps.setString(2, titulo);
			
			ps.execute();
			
			ps.close();
			
			System.out.println("Descrição da tarefa: " + titulo + " editada para: " + novaDesc);
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
