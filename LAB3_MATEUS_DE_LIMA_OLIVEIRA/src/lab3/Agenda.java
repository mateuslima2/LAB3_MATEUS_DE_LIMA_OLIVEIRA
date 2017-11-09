package lab3;
public class Agenda {
	
	Contato contatos[] = new Contato[100]; 
	private int cont = 0;
	public Agenda() {
	}
	
	public boolean cadastrarContato(String nome, String sobrenome, String telefone, int posicao) {
		if ((posicao < 0)||(posicao > 100)) {
			return false;
		}else {
			Contato contato = new Contato(nome, sobrenome, posicao, telefone);
			contatos[posicao-1] = contato;
			cont ++;
			return true;
		}
	}
	
	public int getCont() {
		return cont;
	}

	public String procurarPorPosicao(int posicao) {
		for (int i = 0 ; i < contatos.length ; i++) {
			if (contatos[i].getPosicao() == (posicao)) {	
				return contatos[i].toString();
			}
		}
		return null;
	}

}
