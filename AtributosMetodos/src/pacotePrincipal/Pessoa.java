package pacotePrincipal;

public class Pessoa {

	String nome;
	int idade;
	String CPF;
	dadosEndereco endereco;
	
	Pessoa () {
		endereco = new dadosEndereco();
	}
	
	String imprimirDadosPessoa(char imprimirEndereco) {
		if(imprimirEndereco == 'N' || imprimirEndereco == 'n')		
		
		return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) +
				"\nCPF: " + CPF;
		else 
			return "Nome: " + nome + "\nIdade: " + Integer.toString(idade) +
			"\nCPF: " + CPF + "\n" + endereco.imprimirDadosEndereco();
	}
}
