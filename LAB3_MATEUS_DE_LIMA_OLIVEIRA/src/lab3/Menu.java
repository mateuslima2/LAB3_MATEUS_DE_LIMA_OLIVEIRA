package lab3;
import java.util.Arrays;
import java.util.Scanner;

public class Menu {
	
	static String opcao;
	static Scanner sc = new Scanner(System.in);
	static Agenda agenda = new Agenda();
	public static void main(String[] args) {

		do {
			menu();
			opcao = sc.nextLine();
			switch (opcao) {
			
			case "C":
				cadastrar();
				break;

			case "L":
				listar();
				break;

			case "E":
				exibir();
				break;
				
			default:
				System.out.println("Opção INVÁLIDA!");
				break;
			}
		} while (!opcao.equals("S"));
	}
	 /**
	 * Contém o menu apresentado o user
	 * @returns void
	 */
	private static void menu() { // menu principal
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air\n");
		System.out.print("Opção>");
	}
	 /**
	 * Recebe dados do contato e verifica a posição passada.
	 * A posição é verificada aqui, pois posição invalida permite recuperação. 
	 * Logo, faz sentido não lançar uma exceção.
	 * @returns void
	 */
	public static void cadastrar() {
		
		System.out.print("Posição: ");
		int posicao = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: \n");
		String nome = sc.nextLine();
		
		System.out.print("Sobrenome: \n");
		String sobrenome = sc.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		
		if (!(posicao <= 0 || posicao > 100)) {	
			if (agenda.cadastrarContato(nome, sobrenome, telefone, posicao)) 
				System.out.println("CADASTRO REALIZADO!\n");	
		}else {
			System.out.println("POSIÇÃO INVÁLIDA!\\n");
		}
	}
	
	public static void listar() {
		for (int key: agenda.contatos.keySet()) {
		    System.out.println(agenda.contatos.get(key).toString());
		}
		System.out.println("\n");
	}
	
	public static void exibir() {
		System.out.print("Contato> ");
		int posicao = sc.nextInt();	
		
		try {
			System.out.println(agenda.procurarPorPosicao(posicao));
		}catch(IndexOutOfBoundsException ioe) {
			System.out.println("Posição Inválida");
		}
		
	}

}
