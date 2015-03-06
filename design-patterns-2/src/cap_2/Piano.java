package cap_2;

import java.util.List;

import org.jfugue.Player;

public class Piano {
	
	public void toca(List<Nota> musica){
		Player player = new Player();
		
		StringBuilder musicaEmNotas = new StringBuilder();
		for (Nota nota : musica) {
			musicaEmNotas.append(nota.simbolo() + " ");	
		}
		System.out.println(musicaEmNotas.toString());
		
		player.play(musicaEmNotas.toString());
	}
}
