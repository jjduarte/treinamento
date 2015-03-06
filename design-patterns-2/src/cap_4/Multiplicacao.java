package cap_4;

public class Multiplicacao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Multiplicacao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoExpressaoEsquerda = esquerda.avalia();
		int resultadoExpressaoDireita = direita.avalia();
		return resultadoExpressaoEsquerda * resultadoExpressaoDireita;
	}

}
