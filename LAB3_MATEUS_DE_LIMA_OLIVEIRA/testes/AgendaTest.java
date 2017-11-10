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
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void pesquisarPosicaoInvalida() {
		agenda.procurarPorPosicao(0);
	}
	
	@Test(expected = IndexOutOfBoundsException.class)
	public void pesquisarPosicaoInvalida2() {
		agenda.procurarPorPosicao(102);
	}
}
