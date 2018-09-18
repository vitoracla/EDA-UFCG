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
		String resposta = frequencia(vetor);
		System.out.println(resposta);
	}

	public static String frequencia(int[] array) {
		int maiorElemento = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maiorElemento) {
				maiorElemento = array[i];
			}
		}
		
		int[] arrayAux = new int[maiorElemento + 1];
		
		for (int i = 0; i < array.length; i++) {
			arrayAux[array[i]] += 1;
			
		}
		
	

		String saida = "";
		//for (int i = 0; i < arrayAux.length ; i++) {
		//	if (arrayAux[i] != 0) {
		//		int a = i;
		//		saida += arrayAux[i] + "," + a + " ";		
		int j = 0;
		saida += array[0];
		for (int i = 0; i < arrayAux.length; i++) {
			
			if (arrayAux[i] != 0) {
				int a = arrayAux[array[j]];
				
				saida += array[j] + "," + a + " ";
				
				System.out.println(array[j]);
			}
		}	
			
			
		return saida.trim();

	}

}