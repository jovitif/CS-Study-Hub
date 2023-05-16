package IntegracaoNumerica;

public class TrapezioRepetida {
	
	  public static double calcularIntegral(double[] x, double[] y) {
	        double integral = 0.0;

	        int n = x.length - 1; // quantidade de partições
	        double h = (x[n] - x[0]) / n;

	        for (int i = 1; i < n; i++) { // somar valores das partições
	            integral += y[i];
	        }

	        integral += (y[0] + y[n]) / 2.0;
	        integral *= h;

	        return integral;
	    } 
	
	public static void main(String[] args) {
	        double[] vetorX = {2.0, 2.2, 2.4, 2.6, 2.8, 3.0};
	        double[] vetorY = {4.5, 6.8, 10.2, 11.2, 15.8, 20.0};
	        
	        System.out.println("Valor da integral utlizando a regra do trapézio repetida: " + calcularIntegral(vetorX, vetorY));
	    }
}
