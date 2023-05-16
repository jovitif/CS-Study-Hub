package IntegracaoNumerica;

//1) achar a integral pela soma de Rieman
//dividr a area em varios retangulos e somar
// soma de infinitos retangulos
public class SomadeRieman {
    public static void main(String[] args) {
    	 double[] valoresx = {2.0, 2.2, 2.4, 2.6, 2.8, 3.0};
         double[] valoresy = {4.5, 6.8, 10.2, 11.2, 15.8, 20.0};

         int n = valoresx.length - 1; // partições
         double deltax = (valoresx[n] - valoresx[0]) / n;

         double somaRieman = 0.0;
         for (int i = 0; i < n; i++) {
             double x = valoresx[i]; 
             double fx = valoresy[i]; 
             somaRieman += fx * deltax;
         }

         System.out.println("Valor da integral usando a soma de Rieman " + somaRieman);
    }
}
