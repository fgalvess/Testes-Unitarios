package servicos;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mockito;
import utils.DataUtils;

public class EmprestimoTest {

	Emprestimo emprestimo = new Emprestimo();
	
	@Test
	public void aprovarPagamentoTest() {	
		
		DataUtils dataUtilsSpy = Mockito.spy(DataUtils.class);
		Mockito.when(dataUtilsSpy.prazoPagamento(10)).thenReturn(45);
		assertEquals(emprestimo.aprovaPagamento(dataUtilsSpy, 10), 45);
	}

	@Test
	public void realizarEmprestimoTest() {
		emprestimo.realizaEmprestimo(null, 2000.00, 10);
	}
}
