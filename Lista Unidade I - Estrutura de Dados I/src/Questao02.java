import java.util.Locale;
import java.util.Scanner;


public class Questao02 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		scanner.useLocale(Locale.US);
		System.out.println("Digite a sua idade:");
		byte idade = scanner.nextByte();
		System.out.println("Digite a sua altura:");
		double altura = scanner.nextDouble();
		System.out.println("Digite a primeira letra do seu nome:");
		char ch = scanner.next().charAt(0);
		scanner.nextLine();
		System.out.println("Digite o seu nome completo:");
		String nome = scanner.nextLine();
		System.out.println("Ola " + nome + ". Você tem " + idade + " anos, " + altura + " de altura e a primeira letra do seu nome é " + ch);
	}
}
