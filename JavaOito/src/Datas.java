import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Datas {
	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println(hoje);
		
		LocalDate olimpiadasRio = LocalDate.of(2099, Month.JANUARY, 25);
		
		int anos = olimpiadasRio.getYear() - hoje.getYear();
		
		System.out.println(anos);
		
		Period periodo = Period.between(hoje, olimpiadasRio);
		
		olimpiadasRio.plusYears(4);
		
		
	}
}
