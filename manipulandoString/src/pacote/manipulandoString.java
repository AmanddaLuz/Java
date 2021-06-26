package pacote;

public class manipulandoString {

	public static void main(String[] args) {
		int n1 = 0, n2 = 0, total = 0;
		n1 = 10;
		n2 = 20;
		total = n1 + n2;
		System.out.printf("O resultado de %d + %d = %d\n", n1, n2, total);
		
			
		int v1 = 0, v2 = 0, subtracao = 0;
		v1 = 50;
		v2 = 80;
		subtracao = v1 - v2;
		
		System.out.printf("O resultado de %d - %d = %d\n", v1, v2, subtracao);

		
		int i1 = 0, i2 = 0, produto = 0;
		i1 = 50;
		i2 = 80;
		produto = i1 * i2;
		
		System.out.printf("O resultado de %d multiplicado por %d = %d\n", i1, i2, produto);

		
		double q1 = 0, q2 = 0, quociente = 0;
		q1 = 50;
		q2 = 80;
		quociente = q1 / q2;
		
		System.out.printf("O resultado de %.2f dividido por %.2f = %.4f\n", q1, q2, quociente);

		double r1 = 0, r2 = 0, resto = 0;
		r1 = 80;
		r2 = 50;
		resto = r1 % r2;
		
		System.out.printf("O resto de %.2f por %.2f = %.4f\n", r1, r2, resto);

		int x = 0;
		System.out.printf("Valor de x: %d\n", x);
		x++;
		System.out.printf("Valor de x: %d\n", x);
		x++;
		System.out.printf("Valor de x: %d\n", x);
		x = x + 1;
		System.out.printf("Valor de x: %d\n", x);
		x = x + 3;
		System.out.printf("Valor de x: %d\n", x);
		x = x - 1;
		System.out.printf("Valor de x: %d\n", x);
		x = x - 10;
		System.out.printf("Valor de x: %d\n", x);
		
		double a, b, c, d, resultado;
		a = 10;
		b = 20;
		c = 30;
		d = 10;
		
		resultado = a + b * c / d;
		System.out.printf("Resultado: %.2f\n", resultado);
	
		double m, n, o, p, valor;
		m = 10;
		n = 20;
		o = 30;
		p = 10;
		
		valor = (m + n) * o / p;
		System.out.printf("Resultado: %.2f", valor);
	
	}

}
