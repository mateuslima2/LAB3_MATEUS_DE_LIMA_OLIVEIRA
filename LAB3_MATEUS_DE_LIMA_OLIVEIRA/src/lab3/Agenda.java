package lab3;
import java.util.HashMap;
import java.util.Map;

/**
* RepresentaÃ§Ã£o de uma agenda, que contÃ©m uma lista de contatos. 
*
* @author Mateus de Lima Oliveira
*/
public class Agenda {
	 /**
	   * Lista de contatos da agenda, com limite de alocaÃ§Ã£o 100.
	   */
	public Map<Integer, Contato> contatos = new HashMap<Integer, Contato>();
	  /**
	   * ConstrÃ³i uma agenda, sem necessidade de parametros
	   *
	   */
	public Agenda() {}
	
	/**
	* Cadastra contato na agenda, retornando True se for cadastrado ou False caso nÃ£o
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
	 * Retorna a String que representa o contato procurado ou erro, caso a posiÃ§Ã£o nÃ£o seja valida ou preenchida
	 * @returns a representaÃ§Ã£o em String de um contato.
	 */
	public String procurarPorPosicao(int posicao) {
		if (posicao <= 0 || posicao > 100) {
			throw new IndexOutOfBoundsException("PosiÃ§Ã£o invÃ¡lida");
		}
		for (Integer key : contatos.keySet()) {
			if (posicao == key) 
				return contatos.get(posicao).toString();
		}
		return "POSIÃ‡ÃƒO INVÃ�LIDA!";
	}

	 /**
	 * Retorna a String que representa da agenda. Contando a lista de todos os contatos cadastrados
	 * @returns a representaÃ§Ã£o em String de um aluno.
	 */
	@Override
	public String toString() {
		return "Agenda :\n" + contatos.values() + "\n";
	}
}
