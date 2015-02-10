import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class FiltroDataAbertura extends Filtro {

	public FiltroDataAbertura(Filtro outroFiltro) {
		super(outroFiltro);
	}

	public FiltroDataAbertura() {
	}

	@Override
	public List<Conta> filtra(List<Conta> contas) {
		ArrayList<Conta> contasFiltradas = new ArrayList<Conta>();
		for (Conta conta : contas) {
			if (conta.getDataAbertura().get(Calendar.MONTH) == Calendar.getInstance().get(Calendar.MONTH)
					&& conta.getDataAbertura().get(Calendar.YEAR) == Calendar.getInstance().get(Calendar.YEAR)) {
				contasFiltradas.add(conta);
			}
		}

		contasFiltradas.addAll(proximo(contas));

		return contasFiltradas;
	}

}
