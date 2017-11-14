package lab3;
import java.util.HashMap;
import java.util.Map;

/**
* Representação de uma agenda, que contemm uma lista de contatos. 
*
* @author Mateus de Lima Oliveira
*/
public class Agenda {
	 /**
	   * Lista de contatos da agenda, com limite de alocação 100.
	   */
	public Map<Integer, Contato> contatos = new HashMap<Integer, Contato>();
	  /**
	   * Construção uma agenda, sem necessidade de parametros
	   *
	   */
	public Agenda() {}
	
	/**
	* Cadastra contato na agenda, retornando True se for cadastrado ou False caso não
	 * @return 
	* @returns boolean representando o resultado do cadastro
	*/
	public boolean cadastrarContato(String nome, String sobrenome, String telefone, int posicao) {
		try {
			Contato contato = new Contato(nome, sobrenome, telefone, posicao);
			contatos.put(posicao, contato);
			return true;
		}catch(NullPointerException e) {
			 throw new NullPointerException("Nome Nulo");
		}
		
	}
	
	/**
	 * Retorna a String que representa o contato procurado ou erro, caso a posição não seja valida ou preenchida
	 * @returns a representação em String de um contato.
	 */
	public String procurarPorPosicao(int posicao) {
		if (posicao <= 0 || posicao > 100) {
			throw new IndexOutOfBoundsException("Posição inválida");
		}
		for (Integer key : contatos.keySet()) {
			if (posicao == key) 
				return contatos.get(posicao).toString();
		}
		return "POSIÇÃO INVÁLIDA!";
	}

	 /**
	 * Retorna a String que representa da agenda. Contando a lista de todos os contatos cadastrados
	 * @returns a representação em String de um aluno.
	 */
	@Override
	public String toString() {
		return "Agenda :\n" + contatos.values() + "\n";
	}
}
