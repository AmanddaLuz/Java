package pacoteWhile;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		char saida = 'N';
			Scanner entrada = new Scanner(System.in);
			int numero = 0, somatorio = 0, contar = 0;
		while (saida != 'S') {
			System.out.println("Digite um n�mero: ");
			numero = entrada.nextInt();
			entrada.nextLine();
			System.out.println("Gostaria de sair (S - Sim, N - N�o)?");
			saida = entrada.nextLine().charAt(0);
			somatorio = somatorio + numero;
			contar++;
		}
		System.out.printf("O somatorio �: %d.\n", somatorio);
		System.out.printf("Foram digitados %d n�meros.\n", contar);
	}

}
