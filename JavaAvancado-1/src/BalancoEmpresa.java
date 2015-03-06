
public class BalancoEmpresa {

	private ArmazenadorDeDivida dividas;

	public BalancoEmpresa(ArmazenadorDeDivida dividas) {
		this.dividas = dividas;

	}

	public void registraDivida(Divida divida) {
		dividas.salva(divida);

	}

	public void pagaDivida(Documento documentoCredor, Pagamento pagto) {
		Divida divida = dividas.carrega(documentoCredor);
		if (divida != null) {
			divida.registra(pagto);
		}
		dividas.salva(divida);

	}

}
