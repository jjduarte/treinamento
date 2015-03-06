<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum ");

		// Comparator<String> comparador = new ComparadorPorTamanho();

		// Collections.sort(palavras, comparador);
		// palavras.sort(comparador);

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		// new Thread(() ->
		// System.out.println("Executando um Runnable")).start();

		palavras.sort(Comparator.comparing(String::length));

		System.out.println(palavras);

		// for (String p : palavras) {
		// System.out.println(p);
		// }

		// java7
		// Consumer<String> consumidor = new ImprimeNaLinha();
		// palavras.forEach(consumidor);

		// lambda ->
		palavras.forEach(System.out::println);

		for (String s : palavras) {
			System.out.println(s);
		}
		
	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

=======
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {
	public static void main(String[] args) {

		List<String> palavras = new ArrayList<>();
		palavras.add("alura online");
		palavras.add("casa do codigo");
		palavras.add("caelum ");

		// Comparator<String> comparador = new ComparadorPorTamanho();

		// Collections.sort(palavras, comparador);
		// palavras.sort(comparador);

		palavras.sort((s1, s2) -> {
			if (s1.length() < s2.length())
				return -1;
			if (s1.length() > s2.length())
				return 1;
			return 0;
		});

		System.out.println(palavras);

		// for (String p : palavras) {
		// System.out.println(p);
		// }

		// java7
		// Consumer<String> consumidor = new ImprimeNaLinha();
		// palavras.forEach(consumidor);

		// lambda ->
		palavras.forEach(s -> System.out.println(s));

	}
}

class ImprimeNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}

}

class ComparadorPorTamanho implements Comparator<String> {

	@Override
	public int compare(String s1, String s2) {

		if (s1.length() < s2.length())
			return -1;
		if (s1.length() > s2.length())
			return 1;
		return 0;
	}

>>>>>>> 8885c0f4503d35c57e410d97dfe0611a8c8e995a
}