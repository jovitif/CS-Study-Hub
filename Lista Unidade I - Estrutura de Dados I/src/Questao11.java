import java.util.Scanner;

public class Questao11 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String args[]) {
		double conta1 = 100.0;
		double conta2 = 100.0;
		System.out.println("O valor da conta1 é " + conta1 + " reais.");
		System.out.println("O valor da conta2 é " + conta2 + " reais.");
		System.out.println("Quanto você deseja transferir da conta1 para a conta2 (?):");
		double valor = scanner.nextDouble();
		if(valor > conta1) {
			System.out.println("Você não tem saldo suficiente");
		}else {
			System.out.println("Realizando transação...");
			conta1 = conta1 - valor;
			System.out.println("O valor da conta1 é " + conta1 + " reais.");
			conta2 = conta2 + valor;
			System.out.println("O valor da conta2 é " + conta2 + " reais.");
		}
	
	}
}
