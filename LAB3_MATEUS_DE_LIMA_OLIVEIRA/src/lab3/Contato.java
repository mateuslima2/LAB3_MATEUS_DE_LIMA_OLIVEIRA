package lab3;

public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;
	private int posicao;
	
	public Contato(String nome,String sobrenome, int posicao, String telefone) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.telefone = telefone;
		this.posicao = posicao;
	}
	
	public int getPosicao() {
		return posicao;
	}

	@Override
	public String toString() {
		return posicao + " - " + nome + " " + sobrenome;
	}

}
