import servico.*;

public class Main {

	public static void main(String[] args) {

		int arrayInteiros[] = new int [args.length];
		int i = 0;
		for(String a : args){
			try {
				//converter string pra int
				int numeroPassado = Integer.parseInt(a);
				//verificar se é um número válido (1 a 7)
				if(numeroPassado > 0 && numeroPassado <= 7) {
					arrayInteiros[i] = numeroPassado;
				}
				else {
					System.out.println("O número: " + numeroPassado + " não é um número válido (inteiros entre 1 e 7) ");
				}
			} catch (NumberFormatException e) {
				System.out.println("Não foi passado um número inteiro como argumento!");
			}
			i++;
		}
		
		//iterar no array imprimindo o getDescricao()

			//implementar o getDescricao com um switch/case para imprimir o nome do dia da semana
		
		DescreverDiaDaSemana d = new DescreverDiaDaSemana();
		d.executar(arrayInteiros);
	}
}
