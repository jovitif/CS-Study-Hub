import java.util.Scanner;

/*
 * CONDIÇÃO PARA SER NÚMERO PRIMO: SER DIVISIVEL POR 1 E POR ELE MESMO
 */

public class Questao21 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite um número primo:");
		int num = scanner.nextInt();
		int teste = 0;
		for(int i =1; i <= num; i++) {
			if(num%i == 0) {
				teste++;
			}
			
		}
		if(teste <=2) {
			System.out.print("É primo");
		}else {
			System.out.print("Não é primo");
		}
	}
}
