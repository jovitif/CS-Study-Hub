import java.util.Scanner;

public class Questao19 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número para tabuada: ");
		int num = scanner.nextInt();
		for(int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num*i));
		}
	}
}
