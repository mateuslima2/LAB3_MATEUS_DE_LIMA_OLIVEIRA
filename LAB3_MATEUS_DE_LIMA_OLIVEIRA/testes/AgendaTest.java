import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import lab3.Agenda;
import lab3.Contato;

public class AgendaTest {
	private Agenda agenda;
	
	@Before
	public void criaAgenda() {
		agenda = new Agenda();
		agenda.cadastrarContato("Mateus", "Lima", "83374569", 100);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void pesquisarPosicaoInvalida() {
		agenda.procurarPorPosicao(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void pesquisarPosicaoInvalida2() {
		agenda.procurarPorPosicao(102);
	}
	
	@Test
	public void pesquisarValidoExtremo() {
		agenda.procurarPorPosicao(100);
		assertTrue(agenda.procurarPorPosicao(100).equals("100 - Mateus Lima"));
	}
	
	@Test
	public void cadastrarExtremo() {
		assertTrue(agenda.cadastrarContato("Mateus", "Lima", "83374569", 100));
	}
	
	@Test
	public void cadastrarExtremoMenor() {
		assertTrue(agenda.cadastrarContato("Mateus", "Lima", "83374569", 1));
	}
	
	@Test
	public void cadastrarMesmaPosicao() {
		assertTrue(agenda.cadastrarContato("Mateus", "Oliveira", "83374569", 100));
	}
	
	@Test
	public void cadastrarPosicaoVazia() {
		assertTrue(agenda.cadastrarContato("Mateus", "Oliveira", "83374569", 25));
	}
	
	@Test
	public void testToString() {
		assertEquals(agenda.toString(), "Agenda :\n" + agenda.contatos.values() + "\n");
	}
	
	
	
	
}
