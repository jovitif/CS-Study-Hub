import java.util.Scanner;

public class Questao23 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número para fatorial:");
		int num = scanner.nextInt();
		int mult = 1;
		int i = mult;
		System.out.print(num + "! = ");
		for (; i < num; i++) {
			System.out.print(i + " X ");
			mult = mult*i;
		}
		mult = mult * num;
		System.out.print( i + " = " + mult);
	}
}
