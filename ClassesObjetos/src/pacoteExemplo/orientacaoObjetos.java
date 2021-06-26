package pacoteExemplo;
import java.util.*;

public class orientacaoObjetos {

	public static void main(String[] args) {

		Scanner ent = new Scanner(System.in);
		
		Pessoa p1 = new Pessoa();
		p1.nome = "João;";
		p1.idade = 25;
		p1.altura = 1.8;
		p1.peso = 70;
		
		System.out.printf("%s\nAno de Nascimento: %d.", p1.imprimirDados(), p1.retornarAnoNascimento());
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Ana";
		p2.idade = 40;
		p2.altura = 1.89;
		p2.peso = 76;
		
		System.out.printf("%s\nAno de Nascimento: %d.", p2.imprimirDados(), p2.retornarAnoNascimento());
		}

}
