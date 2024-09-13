// Andson de Queiroz Domingues - 3ADS

package br.com;
import java.util.Scanner;
import java.util.ArrayList;

public class Sisteminha {
	private static String admin = "admin";
	private static int senha = 123;
	private static double Caixinha = 0.00;
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		ArrayList<String> clientes = new ArrayList<String>();
		ArrayList<String> produtos = new ArrayList<String>();
		ArrayList<Double> preco = new ArrayList<Double>();
		ArrayList<Integer> estoque = new ArrayList<Integer>();
		
		produtos.add("Feijao");
		preco.add(3.29);				// Dados já inseridos para já poder iniciar e testar as funções.
		estoque.add(45);
		
		clientes.add("Andson");		// Sistema já inicia com 1 cliente cadastrado.
		
		boolean logado = false;
		
		Login(ler, admin, senha, logado);
		
		int escolha;
		
		if(!logado) {
			do {
				
				Menuzinho();
				escolha = ler.nextInt();
				
				switch(escolha) {
				case 1:
					ExibirProdutos(ler, produtos, preco, estoque);
					break;
				case 2:
					ExibirClientes(ler, clientes);
					break;
				case 3:
					Cadastro(ler, clientes);
					break;
				case 4:
					MostrarCaixa(ler);
					break;
				case 5:
					VenderProduto(ler, estoque, produtos, preco, clientes);
					break;
				case 6:
					Limpar();
					break;
				case 7:
					System.out.println("Volte sempre!");
					break;
				case 8:
				CadastroProduto(ler, produtos, estoque, preco);
				
				}
				
			}while(escolha != 7);
		}
	}


	private static void Login(Scanner ler, String admin, int senha, boolean logado) {
		
		while(!logado) {
			System.out.println("- - - - - L O G I N - - - - -");
			System.out.println("Digite o seu nome de usuario: ");
			String nome = ler.nextLine();
			
			if(nome.equals(admin)) {
				System.out.println("Digite a senha: ");
				int password = ler.nextInt();
				
				if(password == senha) {
					System.out.print("\033c");	
					System.out.println("Logado com Sucesso!");
					
					logado = true;
				}
				else {
					System.out.println("Senha invalida. tente novamente.");
					ler.nextLine();
				}
			}
			else{
				System.out.println("Nome de usuario invalido. tente novamente.");
			}
		}
	}

	private static void Menuzinho() {
		System.out.println("======== M E N U ========");
		System.out.println("1. Exibir produtos em estoque.");
		System.out.println("2. Exibir Clientes Cadastrados");
		System.out.println("3. Cadastrar Novo Cliente");
		System.out.println("4. Mostrar Dinheiro em Caixa");
		System.out.println("5. Vender Produto");
		System.out.println("6. Limpar Tela");
		System.out.println("7. Sair do programa");
		System.out.println("8. Cadastrar produto");
		System.out.println("Escolha uma opção");
	}
	

	private static void ExibirProdutos(Scanner ler, ArrayList<String> produtos, ArrayList<Double> preco, ArrayList<Integer> estoque) {
		System.out.println("======== P R O D U T O S ========");
		for(int i = 0; i<produtos.size(); i++) {
			System.out.print("ID " + i + ": " + produtos.get(i) + " | ");
			System.out.print("Valor unitário: " + preco.get(i) + " | ");
			System.out.println("Estoque: " + estoque.get(i));
		}
		
		int escolha = RetornarMenu(ler);
		
		 if (escolha == 1) {
			 System.out.println("Volte sempre!");
		        System.exit(0);
		    }
		
	}

	private static int RetornarMenu(Scanner ler) {	
		System.out.println("1. Sair do Programa");
		System.out.println("2. Voltar ao Menu");
		System.out.println("Escolha: ");
		int escolha = ler.nextInt();
		
		return escolha;
		
	}
	
	private static void Cadastro(Scanner ler, ArrayList<String> clientes) {
		System.out.println("======== C A D A S T R O ========");
		ler.nextLine(); 
		System.out.println("Digite o nome do cliente: ");
		String novocliente = ler.nextLine();					
		clientes.add(novocliente);
		System.out.println("Cadastro realizado!");
		
		int escolha = RetornarMenu(ler);
		
		 if (escolha == 1) {
			 System.out.println("Volte sempre!");
		        System.exit(0);
		    }
		
	}
	
	private static void MostrarCaixa(Scanner ler) {
		System.out.println("======== C A I X A ========");
		System.out.println("Dinheiro em caixa: " + Caixinha);
		int escolha = RetornarMenu(ler);
		
		 if (escolha == 1) {
			 System.out.println("Volte sempre!");
		        System.exit(0);
		    }
		
	}
	
	private static void ExibirClientes(Scanner ler, ArrayList<String> clientes) {
		System.out.println("======== C L I E N T E S ========");
		for(int i = 0; i<clientes.size(); i++) {
			System.out.println("ID " + i + ": " + clientes.get(i));
		}
		
		int escolha = RetornarMenu(ler);
		
		 if (escolha == 1) {
			 System.out.println("Volte sempre!");
		        System.exit(0);
		    }
		
	}
	
	private static void VenderProduto(Scanner ler, ArrayList<Integer> estoque, ArrayList<String> produtos, ArrayList<Double> preco, ArrayList<String> clientes) {
		System.out.println("======== C O M P R A ========");
		int OutraCompra = 1;
		
		while(OutraCompra != 2) {
			System.out.println("Digite o ID do Produto: ");
			int IDproduto = ler.nextInt();
			
			if(IDproduto >= 0 && IDproduto < produtos.size()) {
				System.out.println("Digite a Quantidade: ");
				int QTDproduto = ler.nextInt();
				
				if(QTDproduto > estoque.get(IDproduto)) {
					System.out.println("Estoque insuficiente. Digite outra quantidade.");
				}
				else if(QTDproduto <= 0) {
					System.out.println("Digite uma quantidade superior a 0.");
					QTDproduto = ler.nextInt();
				}
				else {
					System.out.println("======== R E C I B O ========");
					System.out.println("Produto: " + produtos.get(IDproduto));
					System.out.println("Valor unitário: " + preco.get(IDproduto));
					System.out.println("Quantidade sendo comprada: " + QTDproduto);
					System.out.println("=============================");
					double ValorPagar = preco.get(IDproduto) * QTDproduto;
					System.out.println("Valor a pagar: " + ValorPagar);
					System.out.println("");
					
					System.out.println("Confirmar compra? 1-Sim | 2-Não ");
					int escolha = ler.nextInt();
					
					if(escolha == 1) {
						System.out.println("Informe o ID do cliente: ");
						
						int IDcliente = ler.nextInt();
						
						if(IDcliente >= 0 && IDcliente < clientes.size()) {
							System.out.println("Compra realizada com sucesso!");
							
							int novoEstoque = estoque.get(IDproduto) - QTDproduto;
							estoque.set(IDproduto, novoEstoque);
							Caixinha += ValorPagar;
							
							System.out.println("Deseja fazer outra compra? 1-Sim | 2-Não ");
							OutraCompra = ler.nextInt();
						}
						else {
							System.out.println("Cliente inexistente. Tente novamente.");
						}
					}
				}
			}
			else {
				System.out.println("ID do produto não identificado no sistema. Tente novamente.");
			}
		}
	}
	
	private static void Limpar() {
		System.out.print("\033c");	
	}

	private static void CadastroProduto(Scanner ler, ArrayList<String> produtos, ArrayList<Integer> estoque, ArrayList<Double> preco){
		System.out.println("======== C A D A S T R O - P R O D U T O ========");
		ler.nextLine();
		System.out.println("Digite o nome do produto: ");
		String nome = ler.nextLine();
		produtos.add(nome);
		System.out.println("Digite o preço unitario: (formato 0,00)");
		double valor = ler.nextDouble();
		preco.add(valor);
		System.out.println("Digite o estoque do produto: ");
		int quantidade = ler.nextInt();
		estoque.add(quantidade);
		System.out.println("Produto cadastrado com sucesso!");

	}
}
