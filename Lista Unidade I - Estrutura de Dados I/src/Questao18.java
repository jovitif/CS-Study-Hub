import java.util.Scanner;

public class Questao18 {
	public static Scanner scanner = new Scanner (System.in);
	public static void main(String []args) {
		System.out.println("Digite a senha:");
		String senha = "";
		while(!senha.equals("senha1234")) {
			senha = scanner.nextLine();
			if(!senha.equals("senha1234")) {
				System.out.println("senha incorreta!");
			}
		}
		System.out.println("Senha digitada com sucesso....");
		System.out.println("Digite uma nova senha:");
		senha = "";
		do {
			senha = scanner.nextLine();
			if(!senha.equals("joao1234")) {
				System.out.println("senha incorreta");
			}
		}while(!senha.equals("joao1234"));
		System.out.println("Senha digitada com sucesso....");

	}
}
