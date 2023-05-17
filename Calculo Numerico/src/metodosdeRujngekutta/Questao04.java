package metodosdeRujngekutta;

import java.util.function.BiFunction;

public class Questao04 {

    public static void main(String[] args) {
        BiFunction<Double, Double, Double> f = (x, y) -> -0.06 * Math.sqrt(y);
        double x0 = 0; // Tempo inicial
        double y0 = 3; // Nível inicial da água em metros
        double xf = Double.MAX_VALUE; // Valor arbitrário grande para representar quando o tanque estará vazio
        double h = 0.5; // Tamanho do incremento em minutos

        double[] result = rungeKutta4(f, x0, xf, y0, h);
        double x1 = result[0];
        double y1 = result[1];

        System.out.println("Tempo necessário para o tanque ficar vazio: " + x1 + " minutos");
    }

    public static double[] rungeKutta4(BiFunction<Double, Double, Double> f, double x0, double xf, double y0, double h) {
        double x = x0;
        double y = y0;

        while (y > 0) {
            double k1 = h * f.apply(x, y);
            double k2 = h * f.apply(x + h / 2, y + k1 / 2);
            double k3 = h * f.apply(x + h / 2, y + k2 / 2);
            double k4 = h * f.apply(x + h, y + k3);
            y += (k1 + 2 * k2 + 2 * k3 + k4) / 6;
            x += h;
        }

        return new double[]{x, y};
    }
}
