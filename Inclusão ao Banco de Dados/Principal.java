package AtividadeBD;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		TarefasDAO acessarBD = new TarefasDAO();
		
		int escolha = 0;
		
		do {
			exibirMenu();
			escolha = ler.nextInt();
			ler.nextLine();
			
			switch(escolha) {
			case 1:
				adicionarTarefa(acessarBD, ler);
				break;
			case 2:
				listarTarefas(acessarBD);
				break;
			case 3:
				editarTarefa(acessarBD, ler);
				break;
			case 4:
				excluirTarefa(acessarBD, ler);
				break;
			case 5:
				System.out.println("Saindo...");
				break;
			}
			
		} while(escolha != 5); 	
	
	}
	
	public static void exibirMenu() {
		System.out.println("----- Menu -----");
		System.out.println("1. Adicionar nova tarefa");
		System.out.println("2. Listar todas as tarefas");
		System.out.println("3. Editar tarefa");
		System.out.println("4. Excluir tarefa");
		System.out.println("5. Sair");
	}
	
	public static void adicionarTarefa(TarefasDAO acessarbd, Scanner ler) {
		
		System.out.println("Digite o título da tarefa: ");
		String titulo = ler.nextLine();
		
		System.out.println("Digite a descrição da tarefa: ");
		String descricao = ler.nextLine();
		
		Tarefa tarefa = new Tarefa(titulo, descricao);
		
		acessarbd.adicionarTarefa(tarefa);
		
		
	}
	
	public static void listarTarefas(TarefasDAO acessarbd) {
		acessarbd.listarTarefas();
	}
	
	public static void excluirTarefa(TarefasDAO acessarbd, Scanner ler) {
		System.out.println("Digite o titulo da tarefa que deseja excluir: ");
		String titulo = ler.nextLine();
		
		acessarbd.excluirTarefa(titulo);
	}
	
	public static void editarTarefa(TarefasDAO acessarbd, Scanner ler) {
		System.out.println("Digite o titulo da tarefa que deseja editar: ");
		String titulo = ler.nextLine();
		
		System.out.println("1. Editar titulo");
		System.out.println("2. Editar descrição");
		int escolha = ler.nextInt();
		ler.nextLine();
		
		if(escolha == 1) {
			System.out.println("Digite o novo titulo: ");
			String novoTitulo = ler.nextLine();
			
			acessarbd.editarTitulo(novoTitulo, titulo);
		}
		else if(escolha == 2) {
			System.out.println("Digite a nova descrição da tarefa: ");
			String novaDesc = ler.nextLine();
			
			acessarbd.editarDescricao(novaDesc, titulo);
		}
	}
}
