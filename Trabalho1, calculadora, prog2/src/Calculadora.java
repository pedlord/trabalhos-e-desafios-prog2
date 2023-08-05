
public class Calculadora {
	private double coeficienteA;
	private double coeficienteB;
	private double coeficienteC;

	public Calculadora() {
		
	}

	public Calculadora(double coefA, double coefB, double coefC) {
		this.coeficienteA = coefA;
		this.coeficienteB = coefB;
		this.coeficienteC = coefC;
	}
	//operações basicas
	public double soma(double a, double b) {
		double resultado = a + b;
		return resultado;
	}
	public double subtracao(double a, double b) {
		double resultado = a - b;
		return resultado;
	}
	public double multiplicacao(double a, double b) {
		double resultado = a * b;
		return resultado;
	}
	public double divisao(double numerador, double denominador) {
		double resultado = numerador / denominador;
		return resultado;
	}
	public double exponenciacao(double base, double expoente) {
		//Math.pow(base, expoente);
		double resultado = 1;
		for (double i = expoente; i >= 1; i--) {
			resultado *= base;
		}
		return resultado;
	}
	public double restoDivisao(double numerador, double denominador) {
		double resultado = numerador % denominador;
		return resultado;
	}
	public double getCoefA() {
		return this.coeficienteA;
	}
	public double getCoefB() {
		return this.coeficienteB;
	}
	public double getCoefC() {
		return this.coeficienteC;
	}
	//polinomio de grau 2
	public double delta() {
		double coefa = getCoefA();
		double coefb = getCoefB();
		double coefc = getCoefC();
		double resultado;
		resultado = coefb * coefb;
		resultado = resultado - 4 * coefa * coefc;
		return resultado;
	}
	public String raizes() {
		double coefa = getCoefA();
		double coefb = getCoefB();
		
		double delta = delta();
		
		double resultado;
		double result;
		String raiz1;
		String raiz2;
		if (delta == 0) {
			resultado = -coefb / (2 * coefa);
			raiz1 = String.valueOf(resultado);
			return "esse polinomio possui uma raiz real = " + raiz1;
		}
		else if (delta > 0) {
			double d = Math.sqrt(delta);
			resultado = (-coefb + d) / (2 * coefa);
			result = (-coefb - d) / (2 * coefa);
			raiz1 = String.valueOf(resultado);
			raiz2 = String.valueOf(result);
			return "1ª raiz = " + raiz1 + "\n" + "2ª raiz = " + raiz2;
		}
		else {
			return "esse polinomio não possui raizes reais";
		}
	}
}
