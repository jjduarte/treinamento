package cap_4;

public class RaizQuadrada implements Expressao{

	Expressao valor;
	
	
	public RaizQuadrada(Expressao valor) {
		this.valor = valor;
	}
	
	@Override
	public int avalia() {
		int valorExpressao = valor.avalia();
		return (int) Math.sqrt(valorExpressao);
	}

}
