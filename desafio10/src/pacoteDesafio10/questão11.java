package pacoteDesafio10;

import java.util.Scanner;
import java.util.Random;

public class questão11 {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int[] valores = new int [1000], repeticoes = new int[1000];
		int limiteSuperior = 100, i = 0;
		
		Random random = new Random();
		
		for (i = 0; i < 1000; i++)
		valores[i] = random.nextInt(limiteSuperior);
		
		for (i = 0; i < 1000; i++) {
			repeticoes[ valores[i]]++;
			
		}
		for (i = 0; i <100; i++)
		System.out.printf("O número %d repete %d vezes.\n", i, repeticoes[i]);
	}

}
