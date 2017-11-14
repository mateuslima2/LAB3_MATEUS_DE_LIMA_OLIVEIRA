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
				System.out.println("OpÃ§Ã£o INVÃ�LIDA!");
				break;
			}
		} while (!opcao.equals("S"));
	}
	 /**
	 * ContÃ©m o menu apresentado o user
	 * @returns void
	 */
	private static void menu() { // menu principal
		System.out.println("(C)adastrar Contato");
		System.out.println("(L)istar Contatos");
		System.out.println("(E)xibir Contato");
		System.out.println("(S)air\n");
		System.out.print("OpÃ§Ã£o>");
	}
	 /**
	 * Recebe dados do contato e verifica a posiÃ§Ã£o passada.
	 * A posiÃ§Ã£o Ã© verificada aqui, pois posiÃ§Ã£o invalida permite recuperaÃ§Ã£o. 
	 * Logo, faz sentido nÃ£o lanÃ§ar uma exceÃ§Ã£o.
	 * @returns void
	 */
	public static void cadastrar() {
		
		System.out.print("PosiÃ§Ã£o: ");
		int posicao = sc.nextInt();
		sc.nextLine();
		System.out.print("Nome: \n");
		String nome = sc.nextLine();
		
		System.out.print("Sobrenome: \n");
		String sobrenome = sc.nextLine();
		
		System.out.print("Telefone: ");
		String telefone = sc.nextLine();
		
		if (!(posicao <= 0 || posicao > 100)) {	
			agenda.cadastrarContato(nome, sobrenome, telefone, posicao); 
				
		}else {
			System.out.println("POSIÃ‡ÃƒO INVÃ�LIDA!\\n");
		}
	}

	/**
	 * Lista todos os contatos presentes na agenda
	 * @returns void
	 */
	public static void listar() {
		for (int key: agenda.contatos.keySet()) {
		    System.out.println(agenda.contatos.get(key).toString());
		}
		System.out.println("\n");
	}
	
	/**
	 * Exibe determinado contato de acordo com a posição passada pelo user.
	 * @returns void
	 */
	public static void exibir() {
		System.out.print("Contato> ");
		int posicao = sc.nextInt();	
		sc.nextLine();
		try {
			System.out.println(agenda.procurarPorPosicao(posicao));
		}catch(IndexOutOfBoundsException ioe) {
			System.out.println("PosiÃ§Ã£o InvÃ¡lida");
		}
	}
}
