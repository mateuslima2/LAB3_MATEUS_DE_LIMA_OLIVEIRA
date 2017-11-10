package lab3;

public class Contato {
	private String nome;
	private String sobrenome;
	private String telefone;
	private int posicao;
	
	public Contato(String nome,String sobrenome, String telefone, int posicao) {
		
		if (nome == null || sobrenome == null || telefone == null) {
			throw new NullPointerException("Nome Nulo");
			
		}else if (posicao <= 0 || posicao > 100) {
			
			throw new IndexOutOfBoundsException("Posição Inválida");
			
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

	@Override
	public String toString() {
		return posicao + " - " + nome + " " + sobrenome;
	}

}
