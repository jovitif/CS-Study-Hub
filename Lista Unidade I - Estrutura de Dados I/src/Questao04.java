import java.util.Scanner;

public class Questao04 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Digite o primeiro numero: ");
		byte num01 = scanner.nextByte();
		System.out.println("Digite o segundo numero: ");
		byte num02 = scanner.nextByte();
		System.out.println("Digite o terceiro numero: ");
		byte num03 = scanner.nextByte();
		System.out.println("A média aritmética de " + num01 + ", " + num02 + " e " + num03 + " é " + ((num01+num02+num03)/3));
	}
}
