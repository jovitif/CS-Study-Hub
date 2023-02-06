import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class Questao20 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Investimento inicial:");
		double inicial = scanner.nextDouble();
		
		System.out.print("Investimento mensal:");
		double mensal = scanner.nextDouble();
		
		System.out.print("Quantidade de meses:");
		int meses = scanner.nextInt();
		
		System.out.print("Taxa de juros mensal:");
		double taxajuros = scanner.nextDouble();
		
		double rendimentomensal;
	
		double saldototal = inicial;
		
		
		 for (int i = 0; i < meses; i++) {
	            rendimentomensal = (saldototal * taxajuros);
	            saldototal += rendimentomensal;
	            saldototal = saldototal + mensal;
	            System.out.println("Saldo após " + (i+1) + " meses: " + new BigDecimal(saldototal).setScale(2, RoundingMode.HALF_EVEN));
	    }
		 System.out.println("O salto total é de R$ " + new BigDecimal(saldototal).setScale(2, RoundingMode.HALF_EVEN));
	}
}
