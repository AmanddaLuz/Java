package pacoteIfElse;

import java.math.*;
import java.util.*;

public class IfElse {

	public static void main(String[] args) {
		
		double n1, n2, n3, total, mediaAvaliacoes, frequencia;
		String situacao;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite a primeira nota: ");
		n1 = entrada.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		n2 = entrada.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		n3 = entrada.nextDouble();
		
		total = n1 + n2 + n3;
		mediaAvaliacoes = total / 3;
		
		System.out.println("Digite a frequencia do aluno: ");
		frequencia = entrada.nextDouble();
		
		if(total >= 70 && frequencia >= 0.75) {
			if(total >=90)
			situacao = "Aprovado com conceito A";
			else if (total >= 80 && total < 90)
				situacao = "Aprovado com conceito B";
			else
				situacao = "Aprovado com conceito C";
		}
		else if(total >= 40 && total < 70 && frequencia >=0.75)
			situacao = "Recupera��o";
		else
			situacao = "Reprovado";
		
		System.out.printf("O aluno obteve nota total %.2f e m�dia por avalia��o %.2f. A frequ�ncia foi %.2f. Com isso o aluno est� %s. ", 
				total, mediaAvaliacoes, frequencia*100, situacao);
		
		
		
		
		
		
		
		

	}

}
