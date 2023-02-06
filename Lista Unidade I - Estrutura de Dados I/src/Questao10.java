import java.util.Scanner;

public class Questao10 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Digite um número inteiro que eu direi se ele é impar ou par:");
		int num = scanner.nextInt();
		if(num % 2 == 0) {
			System.out.print("Numero digitado é par");
		}else {
			System.out.println("Não digitado é impar");
		}
	}
}
