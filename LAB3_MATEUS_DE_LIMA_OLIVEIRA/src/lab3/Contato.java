package lab3;

public class Contato {
	/**
	* Nome do contato. 
	*/
	private String nome;
	/**
	* Sobrenome do contato. 
	*/
	private String sobrenome;
	/**
	* Telefone do contato. 
	*/
	private String telefone;
	/**
	* Posição do contato. 
	*/
	private int posicao;

	/**
	* Constrói um contato a partir do nome, sobrenome, telegone e posição
	* @param nome o nome do contato
	* @param sobrenome o sobrenome do contato
	* @param telefone o telefone do contato
	* @param posicao a posicao do contato
	*/
	public Contato(String nome,String sobrenome, String telefone, int posicao) {
		if (nome.equals(null)  || sobrenome.equals(null) || telefone.equals(null) || nome.equals(" ")  || sobrenome.equals(" ") || telefone.equals(" ")) {
			throw new NullPointerException("Campo(s) Nulo");
		}else {
			this.nome = nome;
			this.sobrenome = sobrenome;
			this.telefone = telefone;
			this.posicao = posicao;
		}	
	}
	
	public int getPosicao() {
		return posicao;
	}
	
	/**
	* Retorna a String que representa o contato. Cotnendo posição, nome e sobrenome
	*
	* @returns a representação em String de um contato.
	*/
	@Override
	public String toString() {
		return posicao + " - " + nome + " " + sobrenome;
	}
}
