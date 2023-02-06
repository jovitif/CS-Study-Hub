import java.util.Scanner;

public class Questao05 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Digite o primeiro numero: ");
		float num01 = scanner.nextFloat();
		System.out.println("Digite o segundo numero: ");
		float num02 = scanner.nextFloat();
		System.out.println("Digite o terceiro numero: ");
		float num03 = scanner.nextFloat();
		System.out.println("A média aritmética de " + num01 + ", " + num02 + " e " + num03 + " é " + ((num01+num02+num03)/3));
	}
}
