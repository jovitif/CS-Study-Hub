import java.util.Scanner;

public class Questao15 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um numero:");
		int num = scanner.nextInt();
		switch(num) {
		case 1:
			System.out.print("Número um");
			break;
		case 2:
			System.out.print("Número dois");
			break;
		case 3:
			System.out.print("Número três");
			break;
		case 4:
			System.out.print("Número quatro");
			break;
		case 5:
			System.out.print("Número cinco");
			break;
		default:
			System.out.print("Valor invalido");
		}
	}
}
