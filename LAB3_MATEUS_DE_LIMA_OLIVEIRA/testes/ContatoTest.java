import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import lab3.Contato;

public class ContatoTest {
	private Contato contato;
		
	@Test(expected = NullPointerException.class)
	public void cadastrarContatoNomeNulo() {
		contato = new Contato(null, "Lima", "95565845", 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastrarContatoSobrenomeNulo() {
		contato = new Contato("Mateus", null , "95565845", 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastrarContatoTelefoneNulo() {
		contato = new Contato("Mateus", "Lima", null, 1);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void cadastrarPosicaoMaior() {
		contato = new Contato("Mateus", "Lima", "95565845", 102);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void cadastrarPosicaoMenor() {
		contato = new Contato("Mateus", "Lima", "95565845", 0);
	}
}
