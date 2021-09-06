package dominio;

import java.util.Objects;

public class DiaDaSemana {

	int indice;

	//{ System.out.println("Inicializador de Instância sendo executado antes do construtor"); }

	public DiaDaSemana() {
		//System.out.println("Construtor sem parâmetros chamado");
		this.indice = 1;
	}

	public DiaDaSemana(int indc) {
		//System.out.println("Construtor com 1 parâmetro chamado");
		this.indice = indc;
	}

	public String getDescricao() {

		String dia = new String();
		switch(indice) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sábado";
				break;
		}

		return "O dia da semana é: " + dia;
		
	}

	public String toString() {
		
		String dia = new String();
		switch(indice) {
			case 1:
				dia = "Domingo";
				break;
			case 2:
				dia = "Segunda";
				break;
			case 3:
				dia = "Terça";
				break;
			case 4:
				dia = "Quarta";
				break;
			case 5:
				dia = "Quinta";
				break;
			case 6:
				dia = "Sexta";
				break;
			case 7:
				dia = "Sábado";
				break;
		}
		return "O dia da semana é: " + dia;
	}

	public boolean equals(Object o) {
		if(!(o instanceof DiaDaSemana)) {
			return false;
		}
		DiaDaSemana d = (DiaDaSemana) o;

		if(d.indice == this.indice) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return Objects.hash(indice);
	}
}
