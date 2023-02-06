import java.util.Scanner;

public class Questao09 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número para raio que seja positivo:");
		int num = scanner.nextInt();
		final double PI = 3.14;
		double area = PI*(num*num);
		System.out.println("O valor da área é de " + area);
	}
}
