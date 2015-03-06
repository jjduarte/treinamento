package ex_2_acoplamento;

public class NotaFiscalDao implements AcaoAposGerarNotaFiscal{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("salva nf no banco.");
	}
}
