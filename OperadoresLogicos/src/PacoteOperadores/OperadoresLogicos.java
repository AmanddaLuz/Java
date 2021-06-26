package PacoteOperadores;

public class OperadoresLogicos {

	public static void main(String[] args) {
		boolean ult3EmprestimosQuitadosPrazo, possuiRendaComprovada, clientesDezEstrelas, restricaoDeCredito;
		
		ult3EmprestimosQuitadosPrazo = true;
		possuiRendaComprovada = false;
		clientesDezEstrelas = false;
		restricaoDeCredito = false;
		
		boolean concederEmprestimo = (ult3EmprestimosQuitadosPrazo && possuiRendaComprovada || clientesDezEstrelas) && !restricaoDeCredito;
		System.out.printf("Emprestimo concedido? \n%b", concederEmprestimo);
		
		

	}

}
