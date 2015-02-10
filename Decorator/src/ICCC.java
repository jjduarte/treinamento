public class ICCC extends Imposto {

	public ICCC(Imposto outroImposto) {
		super(outroImposto);
	}

	public ICCC() {
	}

	@Override
	public double calcula(Orcamento orcamento) {
		if (orcamento.getValor() < 1000.0) {
			return orcamento.getValor() * 0.05 + calculaDoOutroImposto(orcamento);
		} else if (orcamento.getValor() <= 3000.0) {
			return orcamento.getValor() * 0.07 + calculaDoOutroImposto(orcamento);
		} else {
			return orcamento.getValor() * 0.08 + 30.0 + calculaDoOutroImposto(orcamento);
		}
	}

}
