package pacoteBreakContinue;

import java.util.*;

public class breakContinue {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		int numero = 0;
		int somatorio = 0;
		
		System.out.printf("Digite o n�mero desejado: \n", numero);
		numero = ent.nextInt();
	
		while (numero > 0) {
			somatorio = somatorio + numero;
			
			System.out.printf("Digite o n�mero desejado: \n", numero);
			numero = ent.nextInt();
			
			if (numero == 18)
			break;
		}
		System.out.printf("o somat�rio foi de: %d. \n ", somatorio);

	}

}
