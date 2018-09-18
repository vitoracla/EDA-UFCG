import java.util.Arrays;
import java.util.Scanner;
public class TabelaFrequencia {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] array = sc.nextLine().split(" ");
		int[] vetor = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			vetor[i] = Integer.parseInt(array[i]);
		}
		String resposta = frequencia(vetor,0,vetor.length-1);
		System.out.println(resposta);
	}

	public static String frequencia(int[] array, int inicio, int fim) {
		int maiorElemento = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maiorElemento) {
				maiorElemento = array[i];
			}
		}
		
		int[] arrayAux = new int[maiorElemento + 1];
		int[] arrayOriginal = new int[array.length];
		
		for(int i = 0; i < array.length; i++) {
			arrayOriginal[i] = array[i];
		}
	
		for (int i = inicio; i <= fim; i++) {
			System.out.println(Arrays.toString(arrayAux));
			arrayAux[arrayOriginal[i]] ++;
		}
		
	

		String saida = "";
		for (int i = 0; i < arrayOriginal.length; i++) {
			int elemento = arrayOriginal[i];
			if (arrayAux[elemento] != 0) {
				saida += arrayAux[elemento] + "," + elemento + " ";
				arrayAux[elemento] = 0;
			}
		}	
			
			
		return saida.trim();

	}

}