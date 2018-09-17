

import java.util.Arrays;
import java.util.Scanner;

public class CountingSortNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String array = sc.nextLine();
		String[] a = array.split(" ");
		int[] arrayInt = convertArray(a);
		int maior = sc.nextInt();
		int menor = sc.nextInt();
		countNeg(arrayInt, menor, maior);
		System.out.println(Arrays.toString(arrayInt));
	}

	private static void countNeg(int[] array, int menor, int maior) {
		//criando o vetor com o tamanho do maior elemento
		int[] counters = new int[maior - menor + 1];
		
		//inicializando com zero o vetor
		for (int i = 0; i < counters.length; i++)
			counters[i] = 0;
			
		//contagem das ocorrencias
		for (int i = 0; i < array.length; i++) {
			counters[array[i] - menor]++;
			System.out.println(Arrays.toString(counters));
			
		}
		//fazendo a cumulativa
		for (int i = 1; i < counters.length; i++)
			counters[i] += counters[i - 1];
		System.out.println("Cumulativa do vetor de contagem - " + Arrays.toString(counters));
		
		// ordenando o array
		int[] sorted = new int[array.length];
		for (int i = 0; i < sorted.length; i++)
			sorted[i] = array[i];

		for (int i = 0; i < array.length; i++) {
			int e = sorted[i];
			int j = --counters[e - menor];
			array[j] = e;
		}

		System.out.println(Arrays.toString(counters));
	}

	private static int[] convertArray(String[] a) {
		int[] intA = new int[a.length];
		for (int i = 0; i < a.length; i++)
			intA[i] = Integer.parseInt(a[i]);
		return intA;
	}

	
	}


