package pacoteLeituraDeArquivos;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class LeituraArquivos {

	public static void main(String[] args) {
		
		
		try {
				FileReader arquivo = new FileReader("C:\\IGTI\\DadosPontoVirgula.txt");
				BufferedReader lerArquivo = new BufferedReader(arquivo);
				
				String linha;
				linha = lerArquivo.readLine();
				
				while (linha != null) {
					String[] DadosPontoVirgula = new String[5];
					DadosPontoVirgula = linha.split(";");
					
					System.out.printf("Identificador: %s. \n" + 
							"Nome do Cliente: %s. \n" +
							"Endeeço: %s. \n" +
							"Cidade: %s. \n" +
							"Estado civil: %s. \n", DadosPontoVirgula[0], DadosPontoVirgula[1], DadosPontoVirgula[2], DadosPontoVirgula[3], DadosPontoVirgula[4] );
		
					
					linha = lerArquivo.readLine();
					System.out.println(" ");
				
				
				
				
				
				
				}
				lerArquivo.close();
				arquivo.close();
				
		} catch (IOException e) {
			System.out.println("Erro lendo dados: " + e.getMessage());
		}
			//caso não leia palavras com acentuação, por exemplo o "til"
		// salve o arquivo tipo utf-8.
			
		
	}

}
