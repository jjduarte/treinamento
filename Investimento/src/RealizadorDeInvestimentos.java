
public class RealizadorDeInvestimentos {

public void realizaCalculo(Conta conta, Investimento investimentoQualquer){
		
		double calculo = investimentoQualquer.calcula(conta);
		System.out.println("O lucro sobre o valor aplicado foi: " + calculo);
		System.out.println("O saldo da conta era de: " + conta.getSaldo());
		conta.setSaldo( conta.getSaldo() + calculo * 0.75);
		System.out.println("O saldo atualizado com o lucro é de: " + conta.getSaldo());
	}
}
