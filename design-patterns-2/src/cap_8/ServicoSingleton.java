package cap_8;

public class ServicoSingleton {

	private static Servico servico;
	
	public static Servico getInstance(){
		if(servico == null){
			servico = new Servico();
		}
		return servico;
	}
}
