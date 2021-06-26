package pacotePrincipal;

public class dadosEndereco {
	
	String logradouro;
	int nCasa;
	String complemento;
	String cidade;
	String estado;
	String CEP;
	
	String imprimirDadosEndereco() {
		return "Rua " + logradouro + "\n, " + Integer.toString(nCasa) + "  " +
				complemento + ", " + "Cidade: \n " + cidade + ". Estado: \n" + estado 
				+ " CEP: \n" + CEP;
	}

}
