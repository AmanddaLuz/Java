package pacoteExemplo;

public class classeExemplo {

	public static void main(String[] args) {
	    String nome, nome2;
		nome = "José da Silva Costa";
		nome2 = "Maria Clara Souza Almeida";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		System.out.println("A variável nome tem: " + tamanhoDoNome + " caracteres.");
		System.out.println("A variável nome2 tem: " + tamanhoDoNome2 + " caracteres.");
		
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas variáveis é: " + totalCaracteres);
		
		String nomesConcatenados = nome.concat(nome2);
		System.out.println(nomesConcatenados);
		
		String nomeSemA = nome.replace('a', '9');
		System.out.println(nomeSemA);
		
		String somenteNome = nome2.substring(0, 11);
		System.out.println(somenteNome);
							
		String nomeTodoMaiusculo = nome.toUpperCase();
		System.out.println(nomeTodoMaiusculo);
		
		String nomeTodoMinusculo = nome2.toLowerCase();
		System.out.println(nomeTodoMinusculo);
		
		//continuação, aula 2.7
		//println quebra a linha
		//coringas para o printf
		//%s - string
		//%d - int
		//%.2f - float com 4 casas decimais
		//%b - boolean
		//%c - caractere (char)
		
		int idade = 30;
		double altura = 1.81;
		String name = "Joaquin José da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		System.out.printf("A idade é %d e a altura é %.2f.\n O nome é %s. E o sexo é %c.\n É estudante? %b", idade, altura, name, sexo, estudante);
		
		
		
	}

}
