package cap_2;

import java.util.Arrays;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		
		NotasMusicais  notasMusicais = new NotasMusicais();
		
		List<Nota> musica = Arrays.asList(
				notasMusicais.pega("do"),
				notasMusicais.pega("re"),
				notasMusicais.pega("mi"),
				notasMusicais.pega("fa"),
				notasMusicais.pega("fa"),
				notasMusicais.pega("ds"),
				notasMusicais.pega("cs"),
				notasMusicais.pega("fa")
				);
		
		Piano piano = new Piano();
		piano.toca(musica);
		
	}
}
