
public class Formatador {
	
	
	public void formata(Requisicao req, Conta conta){
		Resposta r = new CSV(new XML(new Porcento(new SemFormatacao())));
		
		r.responde(req, conta);
	}


	
}
