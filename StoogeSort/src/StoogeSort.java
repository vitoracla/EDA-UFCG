import java.util.Arrays;
import java.util.Scanner;

public class StoogeSort {

	public static void main(String[] args) {
    		
    		Scanner sc = new Scanner(System.in);
    		String numb = sc.nextLine();
    		String[] list = numb.split(" ");
    		stoogeSort(list, 0, list.length -1);
    	
    
       
        System.out.println(arrayToString(list));}

	

	public static void stoogeSort(String[] array, int leftIndex, int rightIndex) {

		if (Integer.parseInt(array[rightIndex]) < Integer.parseInt(array[leftIndex])) {
			swap(array,leftIndex, rightIndex);
		}
		if (rightIndex - leftIndex > 1) {
			int t = (rightIndex - leftIndex + 1) / 3;
			stoogeSort(array, leftIndex, rightIndex - t);
			stoogeSort(array, leftIndex + t, rightIndex);
			stoogeSort(array, leftIndex, rightIndex - t);
		}
	}

	private static void swap(String[] array, int i, int j) {
		String temp = array[i];
		array[i] = array[j];
		array[j] = temp;
				
	}
	
	public static String arrayToString(String[] array) {
		String s = "";
		for(String a:array) 
			s+= a + " ";
		
		return s.substring(0,s.length() -1);
		
	}

}
