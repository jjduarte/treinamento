package cap_5;

public class ImpressoraPreFixaVisitor implements Visitor{

	@Override
	public void visitaSoma(Soma soma) {
		System.out.print(" + ");
		soma.getEsquerda().aceita(this);
		soma.getDireita().aceita(this);
	}

	@Override
	public void visitaSubtracao(Subtracao subtracao) {
		System.out.print(" - ");
		subtracao.getEsquerda().aceita(this);
		subtracao.getDireita().aceita(this);
		
	}

	@Override
	public void visitaDivisao(Divisao divisao) {
		System.out.print(" / ");
		divisao.getEsquerda().aceita(this);
		divisao.getDireita().aceita(this);
	}

	@Override
	public void visitaMultiplicacao(Multiplicacao multiplicacao) {
		System.out.print(" * ");
		multiplicacao.getEsquerda().aceita(this);
		multiplicacao.getDireita().aceita(this);
		
	}

	@Override
	public void visitaRaiz(RaizQuadrada raiz) {
		System.out.print(" R ");
		raiz.valor.aceita(this);
	}

	@Override
	public void visitaNumero(Numero numero) {
		System.out.print(numero.getNumero() + " ");
	}

}
