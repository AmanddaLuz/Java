package pacoteExemplo;

public class classeExemplo {

	public static void main(String[] args) {
	    String nome, nome2;
		nome = "Jos� da Silva Costa";
		nome2 = "Maria Clara Souza Almeida";
		
		System.out.println(nome);
		System.out.println(nome2);
		
		
		int tamanhoDoNome = nome.length(), tamanhoDoNome2 = nome2.length();
		System.out.println("A vari�vel nome tem: " + tamanhoDoNome + " caracteres.");
		System.out.println("A vari�vel nome2 tem: " + tamanhoDoNome2 + " caracteres.");
		
		int totalCaracteres = tamanhoDoNome + tamanhoDoNome2;
		System.out.println("O total de caracteres das duas vari�veis �: " + totalCaracteres);
		
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
		
		//continua��o, aula 2.7
		//println quebra a linha
		//coringas para o printf
		//%s - string
		//%d - int
		//%.2f - float com 4 casas decimais
		//%b - boolean
		//%c - caractere (char)
		
		int idade = 30;
		double altura = 1.81;
		String name = "Joaquin Jos� da Silva";
		boolean estudante = true;
		char sexo = 'M';
		
		System.out.printf("A idade � %d e a altura � %.2f.\n O nome � %s. E o sexo � %c.\n � estudante? %b", idade, altura, name, sexo, estudante);
		
		
		
	}

}
