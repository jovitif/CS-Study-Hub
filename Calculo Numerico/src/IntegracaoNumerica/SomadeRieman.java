package IntegracaoNumerica;

import java.util.function.Function;
//1) achar a integral pela soma de Rieman
//dividr a area em varios retangulos e somar
// soma de infinitos retangulos
/// calcular pela esquerda (altura a esquerda) ou pela direita (altura a direita)
public class SomadeRieman {

    public static double riemannSum(Function<Double, Double> f, double a, double b, int n, String method) {
        double dx = (b - a) / n;
        double[] x = new double[n];
        for (int i = 0; i < n; i++) {
            x[i] = a + i * dx;
        }
        double[] points;
        if (method.equals("esquerda")) {
            points = new double[n - 1];
            for (int i = 0; i < n - 1; i++) {
                points[i] = x[i];
            }
        } else if (method.equals("direita")) {
            points = new double[n - 1];
            for (int i = 0; i < n - 1; i++) {
                points[i] = x[i + 1];
            }
        } else if (method.equals("meio")) {
            points = new double[n - 1];
            for (int i = 0; i < n - 1; i++) {
                points[i] = (x[i] + x[i + 1]) / 2;
            }
        } else {
            throw new IllegalArgumentException("Método inválido: escolha 'direita', 'esquerda' ou 'meio'.");
        }
        double sum = 0;
        for (double p : points) {
            sum += f.apply(p) * dx;
        }
        return sum;
    }

    // Exemplo de uso
    public static void main(String[] args) {
    	//formula:
        Function<Double, Double> f = x -> x * x;
        //limites de integração: 
        double a = 6.48;
        double b = 11.88;
        int n = 100;
        String method = "esquerda";
        System.out.println("Soma de Riemann (" + method + ") para f(x)=x^2 no intervalo [" + a + "," + b + "]:");
        System.out.println(riemannSum(f, a, b, n, method));
    }
}
