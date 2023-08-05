import java.util.Scanner;

public class Principal {
	@SuppressWarnings("resource")
	public static void main(String args[]) {
		String opcao;
		double num;
		double outroNum;
		double maisUmNum;
		Scanner digito = new Scanner(System.in);
		while (true){
			System.out.println("Digite 1 para Calculadora Básica, 2 para Calculadora de Raizes ou 0 para sair do programa");
			opcao = digito.next();
			if (opcao.equals("0")) {
				System.out.println("saiu do programa.");
				break;
			}
			else if (opcao.equals("1")) {
				while (true){
					Calculadora basico = new Calculadora();
					System.out.println("Calculadora Básica: ");
					System.out.println("Digite a operação requerida, + para somar, - para subtrair, x para multiplicar,");
					System.out.println("/ para dividir, 'e' para exponenciação e % para saber o resto de uma divisão,");
					System.out.println("ou digite 0 para voltar a seleção de calculadoras:");
					opcao = digito.next();
					if (opcao.equals("0")) {
						break;
					}
					else if (opcao.equals("+")) {
						System.out.println("Digite o valor 1:");
						num = digito.nextDouble();
						System.out.println("Digite o valor 2:");
						outroNum = digito.nextDouble();
						System.out.printf("O resultado da soma %.2f + %.2f é: %.2f%n",num, outroNum ,basico.soma(num, outroNum));
					}
					else if (opcao.equals("-")) {
						System.out.println("Digite o valor 1:");
						num = digito.nextDouble();
						System.out.println("Digite o valor 2:");
						outroNum = digito.nextDouble();
						System.out.printf("o resultado da subtração %.2f - %.2f é: %.2f%n",num, outroNum ,basico.subtracao(num, outroNum));
					}
					else if (opcao.equals("x")) {
						System.out.println("Digite o valor 1:");
						num = digito.nextDouble();
						System.out.println("Digite o valor 2:");
						outroNum = digito.nextDouble();
						System.out.printf("O resultado da multiplicação %.2f x %.2f é: %.2f%n",num, outroNum ,basico.multiplicacao(num, outroNum));
					}
					else if (opcao.equals("/")) {
						System.out.println("Digite o valor 1 (numerador):");
						num = digito.nextDouble();
						System.out.println("Digite o valor 2 (denominador):");
						outroNum = digito.nextDouble();
						System.out.printf("O resultado da divisão %.2f / %.2f é: %.2f%n",num, outroNum ,basico.divisao(num, outroNum));
					}
					else if (opcao.equals("e")) {
						System.out.println("Digite o valor 1 (base):");
						num = digito.nextDouble();
						System.out.println("Digite o valor 2 (expoente):");
						outroNum = digito.nextDouble();
						System.out.printf("O resultado da exponenciação %.2f ^ %.2f é: %.2f%n",num, outroNum ,basico.exponenciacao(num, outroNum));
					}
					else if (opcao.equals("%")) {
						System.out.println("Digite o valor 1 (numerador):");
						num = digito.nextDouble();
						System.out.println("Digite o valor 2 (denominador):");
						outroNum = digito.nextDouble();
						System.out.printf("O resto da divisão %.2f / %.2f é: %.2f%n",num, outroNum ,basico.restoDivisao(num, outroNum));
					}
					else {
						System.out.println("Digito desconhecido, escolha uma das opções a seguir");
					}
				}
			}
			else if (opcao.equals("2")) {
				while (true){
					System.out.println("Calculadora de Raízes: ");
					System.out.println("Digite os coeficientes do polinomio de grau 2 para obter o resultado desejado:");
					System.out.println("Digite o coeficiente A de ax^2 ou 0 para voltar a seleção de calculadoras:");
					num = digito.nextDouble();
					if (num == 0) {
						break;
					}
					System.out.println("Digite o coeficiente B de bx:");
					outroNum = digito.nextDouble();
					System.out.println("Digite o coeficiente C de c:");
					maisUmNum = digito.nextDouble();
					System.out.printf("Seu polinomio é: %.2fX^2 + %.2fX + %.2f = 0%n", num, outroNum, maisUmNum);
					Calculadora raiz = new Calculadora(num, outroNum, maisUmNum);
					System.out.println(raiz.raizes());
					System.out.println();
				}
			}
			else {
				System.out.println("Digito desconhecido, escolha uma das opções a seguir:");
			}
		}
	}
}
