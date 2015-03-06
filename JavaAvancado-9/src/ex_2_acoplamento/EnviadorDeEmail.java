package ex_2_acoplamento;

public class EnviadorDeEmail implements AcaoAposGerarNotaFiscal{

	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Envia email.");
	}
}
