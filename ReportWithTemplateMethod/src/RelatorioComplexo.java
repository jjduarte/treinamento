import java.util.Calendar;
import java.util.List;

public class RelatorioComplexo extends Relatorio {

	@Override
	protected void cabecalho() {
		System.out.println("Banco XYZ");
		System.out.println("Avenida Paulista, 1234");
		System.out.println("(11) 1234-5678");
	}

	@Override
	protected void rodape() {
		System.out.println("vanco@xyz.com.br");
		System.out.println(Calendar.getInstance().getTime());
	}

	@Override
	protected void corpo(List<Conta> contas) {
		for (Conta c : contas) {
			System.out.println(c.getNome() + " - " + c.getNumero() + " - " + c.getAgencia() + " - "
					+ c.getSaldo());
		}

	}

}
