package lab3;
import java.util.HashMap;
import java.util.Map;

public class Agenda {
	Map<Integer, Contato> contatos = new HashMap<Integer, Contato>();
	//Contato contatos[] = new Contato[100]; 
	private int cont = 0;
	public Agenda() {
	}
	
	public boolean cadastrarContato(String nome, String sobrenome, String telefone, int posicao) {
		
		try {
			Contato contato = new Contato(nome, sobrenome, telefone, posicao);
			contatos.put(posicao, contato);
			return true;
			
		}catch(NullPointerException e) {
			return false;
		}catch(IndexOutOfBoundsException i) {
			return false;
		}	
	}

	public String procurarPorPosicao(int posicao) {
		if (posicao <= 0 || posicao > 100) {
			throw new IndexOutOfBoundsException("Posição inválida");
		}
		if(!contatos.get(posicao).equals(null)){
			return contatos.get(posicao).toString();
		}
		return "POSIÇÃO INVÁLIDA!";
	}

}
