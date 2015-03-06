import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class ExemploCursos {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		// cursos.forEach(c -> System.out.println(c.getNome()));

//		cursos.stream()
//			.filter(c -> c.getAlunos() >= 100)
//			.map(Curso::getNome)
//			.forEach(System.out::println);
		
		OptionalDouble media = cursos.stream()
		.mapToInt(Curso::getAlunos)
		.average();

		//para pegar o resultado do filter de um stream e colocar numa List
		
		cursos = cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.collect(Collectors.toList());
		
		//para gerar um map a partir de um list
		cursos.stream()
		.filter(c -> c.getAlunos() >=100)
		.collect(Collectors.toMap(
				c -> c.getNome(), //chave
				c -> c.getAlunos() //valor
				))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
		
		cursos.stream()
		.filter(c -> c.getAlunos() >= 50)
		.findFirst()
		.ifPresent(c -> System.out.println(c.getNome()));

		cursos.stream()
		.filter(c -> c.getAlunos() >= 100)
		.findAny()
		.ifPresent(c -> System.out.println(c.getNome()));

	}
}

class Curso {
	private String nome;
	private int alunos;

	public Curso(String nome, int alunos) {
		this.nome = nome;
		this.alunos = alunos;
	}

	public String getNome() {
		return nome;
	}

	public int getAlunos() {
		return alunos;
	}

}
