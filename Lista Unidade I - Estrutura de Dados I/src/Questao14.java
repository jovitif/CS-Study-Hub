import java.util.Scanner;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Questao14 {
	private static Scanner scanner = new Scanner(System.in);
	  public static void main(String[] args) {
		  System.out.print("Digite o valor de a:");
		  double a = scanner.nextDouble();
		  System.out.print("Digite o valor de b:");
		  double b = scanner.nextDouble();
		  System.out.print("Digite o valor de c:");
		  double c = scanner.nextDouble();
	        double delta = calcularDelta(a, b, c);
	        if (delta < 0) {
	            System.out.println("Não existem raízes reais.");
	        } else {
	            calcularEquacao(a, b, delta);
	        }
	    }
	  
	  public static double calcularDelta(double a, double b, double c) {
	        return (b * b) - (4 * a * c);
	    }

	    public static void calcularEquacao(double a, double b, double delta) {
	        DecimalFormat df = new DecimalFormat("#.###");
	        df.setRoundingMode(RoundingMode.HALF_EVEN);
	        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
	        double x2 = (-b - Math.sqrt(delta)) / (2 * a);
	        System.out.println("x1 = " + df.format(x1));
	        System.out.println("x2 = " + df.format(x2));
	    }
	  
}
