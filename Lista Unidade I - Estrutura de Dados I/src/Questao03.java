import java.util.Scanner;

public class Questao03 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Digite o um numero:");
		byte num01 = scanner.nextByte();
		System.out.println("Digite outro numero:");
		byte num02 = scanner.nextByte();
		System.out.println("SOMA: " + (num01 + num02));
		System.out.println("SUBTRAÇÃO: " + (num01 - num02));
		System.out.println("MULTIPLICAÇÃO: " + (num01 * num02));
		System.out.println("QUOCIENTE: " + (num01 / num02));
		System.out.println("RESTO: " + (num01 % num02));
	}
}
