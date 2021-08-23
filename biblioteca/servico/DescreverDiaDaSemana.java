package servico;

import dominio.*;

public class DescreverDiaDaSemana {

	public void executar(int[] arrayInteiros) {
		//criar array de objetos DiaDaSemana
                DiaDaSemana arrayDiaDaSemana[] = new DiaDaSemana[arrayInteiros.length]; 
                int i = 0;
                for(int inteiro : arrayInteiros) {
                        arrayDiaDaSemana[i] =  new DiaDaSemana(inteiro);
                        i++;
                }

		for(DiaDaSemana dia : arrayDiaDaSemana){
			System.out.println(dia.getDescricao());
		}

	}
}
