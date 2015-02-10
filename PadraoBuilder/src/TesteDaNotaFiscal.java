import java.util.ArrayList;
import java.util.List;

public class TesteDaNotaFiscal {
	public static void main(String[] args) {

		ItemDaNotaBuilder criaItem = new ItemDaNotaBuilder();
		List<AcaoAposGerarNota> lista = new ArrayList<>();

		NotaFiscalBuilder builder = new NotaFiscalBuilder(lista);
		builder.paraEmpresa("Paripassu").comCnpj("12.324.678/0001-12")

			.com(criaItem.comNome("item 1").comValor(200.0).insere())
			.com(criaItem.comNome("item 2").comValor(300.0).insere())
			.com(criaItem.comNome("item 3").comValor(400.0).insere()).comObservacoes("observacoes");

		NotaFiscal nf = builder.constroi();

		System.out.println(nf.getDataDeEmissao().getTime());
	}
}
