
import java.util.Scanner;

public class Duplicate {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numb = sc.nextLine();
		String[] list = numb.split(" ");
		System.out.println(isDuplicate(list));
	
	}


	public static boolean isDuplicate(String[] array) {
		boolean isDuplicate = false;
		for(int i = 0 ; i < array.length ; i++) {
			for(int j = 0; j < array.length; j++) {
				if(j != i) {
					if(array[i].equals(array[j])) {
						isDuplicate = true;
						break;
					}
				}
			}
		}
		return isDuplicate;
	}

}
