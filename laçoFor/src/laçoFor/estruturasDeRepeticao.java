package la�oFor;

import java.util.Scanner;

public class estruturasDeRepeticao {

	public static void main(String[] args) {
		
		System.out.println("N�o vai repetir.");
		int i = 0, j = 0;
		
		for(i = 0; i < 10; i++) {
			System.out.printf("Tabuada do %d.\n", i);
			for(j = 0; j < 10; j++) {
				System.out.printf("%d * %d = %d.\n", i, j, i * j);
			}
		}
		System.out.println("Fim. N�o vai repetir.");
	}

}
