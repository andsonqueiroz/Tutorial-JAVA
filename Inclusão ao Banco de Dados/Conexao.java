package AtividadeBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	private static final String user = "root"; 		// Nome do usuário do banco de dados (mysql)
	
	private static final String senha = "an789123";		// Senha do banco de dados (mysql)
	
	private static final String url = "jdbc:mysql://localhost:3306/tarefa";		// Caminho do banco de dados, porta, nome do banco de dados
	
	public static Connection con;		// Variável de conexão
	
	
	/* CONEXÃO COM O BANCO DE DADOS */
	
		/* Função para criar a conexão */
	public static Connection criarConexao(){		
		
		try {			// TRY CATCH = Tenta executar, caso der erro de conexão, cai no CATCH
			
			if(con == null) {		// Se caso a conexão for nula (nunca ter feita antes), cria a conexão e retorna
				
				con = DriverManager.getConnection(url, user, senha);		// efetua a conexão usando o usuário, senha e o endereço do bd
				return con;
				
			}
			else {					// caso já tiver uma conexão feita, só retorna.
				return con;
			}
			
		} catch(SQLException e) {		// Se não conseguir executar, exibe a mensagem de erro.
			e.printStackTrace();
			return null;
		}
		
	}

}
