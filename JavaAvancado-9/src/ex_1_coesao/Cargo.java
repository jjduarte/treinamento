package ex_1_coesao;

public enum Cargo {
	DESENVOLVEDOR(new DezOuVintePorcento()),
    DBA(new QuinzeOuVinteECincoPorcento()),
    TESTER(new QuinzeOuVinteECincoPorcento());
    
    private Regra regra;

	Cargo(Regra regra){
		this.regra = regra;
	}
    
    public Regra getRegra() {
		return regra;
	}
}
