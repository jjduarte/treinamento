import java.util.ArrayList;
import java.util.List;

public class FiltroSaldoMenorQue100 extends Filtro {

	public FiltroSaldoMenorQue100(Filtro outroFiltro) {
		super(outroFiltro);
	}
	
	public FiltroSaldoMenorQue100() {
		super();
	}
	
	@Override
	public List<Conta> filtra(List<Conta> contas) {
		List<Conta> contasFiltradas = new ArrayList<>();
		for (Conta conta : contas) {
			if (conta.getSaldo() < 100) {
				contasFiltradas.add(conta);
			}
		}

		 contasFiltradas.addAll(proximo(contas));
		 return contasFiltradas;
	}

}
