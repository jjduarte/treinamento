package ex_1_coesao;

public class DezOuVintePorcento implements Regra {

	public double calcula(Funcionario funcionario) {
		if (funcionario.getSalarioBase() > 3000.0) {
			return funcionario.getSalarioBase() * 0.8;
		} else {
			return funcionario.getSalarioBase() * 0.9;
		}

	}

}
