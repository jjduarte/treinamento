import java.util.ArrayList;
import java.util.List;


public class FiltroSaldoMaiorQue500Mil extends Filtro{

	
	public FiltroSaldoMaiorQue500Mil(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMaiorQue500Mil() {
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.getSaldo() > 500.000) {
				contasFiltradas.add(conta);
			}
		}

		contasFiltradas.addAll(proximo(contas));
		return contasFiltradas;
	}

}
