
public class EmAprovacao implements EstadoDeUmOrcamento {

	public void aplicaDescontoExtra(Orcamento orcamento){
		if(!orcamento.desconto){
			orcamento.valor -= orcamento.valor * 0.05;
			orcamento.desconto = true;
		}
		else{
			throw new RuntimeException("Desconto j� concedido!");
		}
	}

	@Override
	public void aprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Aprovado();
		
	}

	@Override
	public void reprova(Orcamento orcamento) {
		orcamento.estadoAtual = new Reprovado();
		
		
	}

	@Override
	public void finaliza(Orcamento orcamento) {
		throw new RuntimeException("Orcamentos em aprovacao nao podem ir direto para finalizado! ");
	}
}
