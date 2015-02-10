
public class Multiplicador implements AcaoAposGerarNota{
	private double fator;
	
	public Multiplicador(double fator) {
		this.fator = fator;
	}
	
	@Override
	public void executa(NotaFiscal nf) {
		System.out.println("Multiplicador = :"+ nf.getValorBruto() * fator);
	}

	
}
