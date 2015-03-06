package cap_5;

public class Divisao implements Expressao {

	private Expressao esquerda;
	private Expressao direita;

	public Divisao(Expressao esquerda, Expressao direita) {
		this.esquerda = esquerda;
		this.direita = direita;
	}

	@Override
	public int avalia() {
		int resultadoExpressaoEsquerda = esquerda.avalia();
		int resultadoExpressaoDireita = direita.avalia();
		return resultadoExpressaoEsquerda / resultadoExpressaoDireita;
	}

	public Expressao getEsquerda() {
		return esquerda;
	}

	public Expressao getDireita() {
		return direita;
	}

	@Override
	public void aceita(Visitor impressora) {
		impressora.visitaDivisao(this);
		
	}

	
}
