import java.util.Scanner;

public class Questao22 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número inicial:");
		int num01 = scanner.nextInt();
		System.out.print("Digite um número final:");
		int num02 = scanner.nextInt();
		int sum = 0;
		for(int i = num01; i <= num02; i++) {
			sum = sum + i;
		}
		System.out.print("Somando números de " + num01 + " até " + num02 + " é = " + sum);
	}
}
