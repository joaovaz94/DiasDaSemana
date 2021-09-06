import servico.*;
import dominio.*;
import java.util.*;
import java.util.stream.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("\nElementos passados como argumento que não são números inteiros: ");
		Stream
			.of(args)
			.filter(Main::verificaNaoInteiro)
			.forEach(d -> System.out.println(d));
		
		System.out.println("\nElementos passados como argumento que não são números inteiros entre 1 e 7: ");
		Stream
			.of(args)
			.filter(Main::verificaInteiro)
			.map(Integer::valueOf)
			.filter(d -> d > 7 || d < 0)
			.forEach(d -> System.out.println(d.toString()));

		System.out.println("\nDescrição de dias da semana: ");
		Stream
			.of(args)
			.filter(Main::verificaInteiro)
			.map(Integer::valueOf)
			.filter(d -> d > 0 && d < 8)
			.map(DiaDaSemana::new)
			.distinct()
			.forEach(d -> System.out.println(d.toString()));

	}

	public static boolean verificaInteiro(String entrada) {
		try {
			Integer.valueOf(entrada);
			return true;
		}
		catch (NumberFormatException e) {
			return false;
		}
	}
	
	public static boolean verificaNaoInteiro(String entrada) {
		try {
			Integer.valueOf(entrada);
			return false;
		}
		catch (NumberFormatException e) {
			return true;
		}
	}
}
