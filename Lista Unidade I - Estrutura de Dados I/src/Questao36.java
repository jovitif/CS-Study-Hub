import java.util.Scanner;

public class Questao36 {
	private static Scanner scanner = new Scanner(System.in);
	private static int fatorial(int n)
	{
	    int fat;

	    if(n == 0)
	    {
	        fat = 1;
	    }
	    else
	    {
	        fat = n * fatorial(n-1);
	        System.out.printf(n + "*");
	        
	    }

	    return fat;
	}
	public static void main(String []args) {
		System.out.print("Digite um número para calcular o fatorial:");
		int num = scanner.nextInt();
		System.out.println(" = " + fatorial(num));
	}
}
