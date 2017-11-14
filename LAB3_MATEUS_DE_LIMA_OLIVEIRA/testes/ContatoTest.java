import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import lab3.Contato;

public class ContatoTest {
	private Contato contato;
		
	@Test(expected = NullPointerException.class)
	public void cadastrarContatoNomeVazio() {
		contato = new Contato(" ", "Lima", "95565845", 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastrarContatoSobrenomeVazio() {
		contato = new Contato("Mateus", " " , "95565845", 1);
	}
	
	@Test(expected = NullPointerException.class)
	public void cadastrarContatoTelefoneVazio() {
		contato = new Contato("Mateus", "Lima", " ", 1);
	}
	
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
	

}
