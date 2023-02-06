import java.util.Scanner;

public class Questao08 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Calculadora de IMC");
		System.out.println("Digite o seu peso em (kg):");
		double peso = scanner.nextDouble();
		System.out.println("Digite a sua altura em (m):");
		double altura = scanner.nextDouble();
		if(altura == 0) {
			System.out.println("O valor da altura tem que ser diferente de zero!");
		}else {
			double imc = peso/(altura*altura);
			System.out.println("Seu IMC é de " + imc);
		}
	
	}
}
