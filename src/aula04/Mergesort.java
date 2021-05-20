package aula04;

import java.util.Arrays;

public class Mergesort {

	public int[] ordenar(int[] vetor) {
		int tamanho = vetor.length / 2;

		if (vetor.length == 1) {
			return vetor;
		}

		int[] part1 = new int[tamanho];
		int[] part2 = new int[vetor.length - tamanho];

		int indiceIni = 0;

		for (int i = 0; i < vetor.length; i++) {
			if (i < tamanho) {
				part1[i] = vetor[i];
			} else {
				part2[indiceIni] = vetor[i];
				indiceIni++;
			}
		}
		 

		part1 = ordenar(part1);
		part2 = ordenar(part2);

		int[] resultado = merge(part1, part2);
		
		return resultado;
	}

	private int[] merge(int[] a1, int[] a2) {
		int[] resultado = new int[a1.length + a2.length];
		
		int aux1 = 0;
		int aux2 = 0;

		for (int j = 0; j < resultado.length; j++) {
			
			if(aux1 == a1.length){
				resultado[j] = a2[aux2];
				aux2++;
				continue;
			}
			
			if(aux2 == a2.length){
				resultado[j] = a1[aux1];
				aux1++;
				continue;
			}
			
			if(a1[aux1] < a2[aux2]) {
				resultado[j] = a1[aux1];
				aux1++;
			} else {
				resultado[j] = a2[aux2];
				aux2++;
			}
		}

		return resultado;
	}

}
