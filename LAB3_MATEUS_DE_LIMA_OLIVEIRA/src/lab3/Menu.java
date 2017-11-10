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
	
	private static void menu() { // menu principal
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air\n");
		System.out.println("Opção>");
	}

	public static void cadastrar() {
		
		System.out.print("Posição: ");
		int posicao = sc.nextInt();
		
		System.out.print("Nome: ");
		String nome = sc.next();
		
		System.out.print("Sobrenome: ");
		String sobrenome = sc.next();
		
		System.out.print("Telefone: ");
		String telefone = sc.next();
		
		if (agenda.cadastrarContato(nome, sobrenome, telefone, posicao)) {
			System.out.println("CADASTRO REALIZADO!\n");
		}else {
			System.out.println("POSIÇÃO INVÁLIDA!\n");
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
		System.out.println(agenda.procurarPorPosicao(posicao));
	}

}
