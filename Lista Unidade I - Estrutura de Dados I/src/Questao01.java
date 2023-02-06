import java.util.Locale;
import java.util.Scanner;

public class Questao01 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		scanner.useLocale(Locale.US);
		byte idade = 19;
		double altura = 1.74;
		char letra = 'J';
		String nome = "João Vitor Fernandes de Sales";
		System.out.println("Ola " + nome + ". Você tem " + idade + " anos, " + altura + " de altura e a primeira letra do seu nome é " + letra);
	}
}
