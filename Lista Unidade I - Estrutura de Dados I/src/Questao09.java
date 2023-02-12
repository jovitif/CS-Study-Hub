import java.util.Scanner;
import java.lang.Math;

public class Questao09 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número para raio que seja positivo:");
		int num = scanner.nextInt();
		double area = Math.PI*(num*num);
		System.out.println("O valor da área é de " + area);
	}
}
