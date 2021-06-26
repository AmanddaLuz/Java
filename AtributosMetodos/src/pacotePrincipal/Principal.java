package pacotePrincipal;
import java.util.*;


public class Principal {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa();
		char imprimirEndereco;
		Scanner entCaractere = new Scanner(System.in);
		Scanner entNumerico = new Scanner(System.in);
		
		
		
		
		System.out.println("Digite o nome: ");
		p1.nome = entCaractere.nextLine();
		
		System.out.println("Digite a idade: ");
		p1.idade = entNumerico.nextInt();
		
		System.out.println("Digite o CPF: ");
		p1.CPF = entCaractere.nextLine();
		
		System.out.println("Digite a rua: ");
		p1.endereco.logradouro = entCaractere.nextLine();
		
		System.out.println("Digite o Número: ");
		p1.endereco.nCasa = entNumerico.nextInt();
		
		System.out.println("Digite o complemento: ");
		p1.endereco.complemento = entCaractere.nextLine();
		
		System.out.println("Digite a cidade: ");
		p1.endereco.cidade = entCaractere.nextLine();
		
		System.out.println("Digite o Estado: ");
		p1.endereco.estado = entCaractere.nextLine();
		
		System.out.println("Digite o CEP: ");
		p1.endereco.CEP = entCaractere.nextLine();
		
		System.out.printf("Deseja imprimir os dados com o endereço? ");
		imprimirEndereco = entCaractere.nextLine().charAt(0);
		
		System.out.printf("%s\n", p1.imprimirDadosPessoa(imprimirEndereco));
		
	}

}
