import java.util.Scanner;

public class Questao07 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.println("Digite um numero:");
		int num01 = scanner.nextInt();
		System.out.println("Digite outro numero:");
		int num02 = scanner.nextInt();
		if(num02 == 0) {
			System.out.print("Divisão por zero");
		}else {
			int div = num01/num02;
			System.out.print("Valor da divisão de " + num01 + " dividido por " + num02 + " é " + div);
		}
		
	}
}
