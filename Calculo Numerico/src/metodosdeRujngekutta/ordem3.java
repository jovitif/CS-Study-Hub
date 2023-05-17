package metodosdeRujngekutta;

import java.util.function.BiFunction;

public class ordem3 {
    public static void main(String[] args) {
        BiFunction<Double, Double, Double> f = (x, y) -> 1 - y / x;
        double x0 = 2;
        double y0 = 2;
        double xf = 2.1;
        double h = 0.1;

        double[] result = runge3(f, x0, xf, y0, h);
        double x1 = result[0];
        double y1 = result[1];

        System.out.println("Runge de ordem 3: y[" + x1 + "] = " + y1);
    }

    public static double[] runge3(BiFunction<Double, Double, Double> f, double x0, double xf, double y0, double h) {
        double k1 = h * f.apply(x0, y0);
        double k2 = h * f.apply(x0 + h / 2, y0 + k1 / 2);
        double k3 = h * f.apply(x0 + 3 * h / 4, y0 + 3 * k2 / 4);
        double y1 = y0 + (2.0 / 9) * k1 + (1.0 / 3) * k2 + (4.0 / 9) * k3;
        double x1 = x0 + h;

        int n = (int) ((xf - x0) / h);
        for (int i = 1; i < n; i++) {
            x0 = x1;
            y0 = y1;
            k1 = h * f.apply(x0, y0);
            k2 = h * f.apply(x0 + h / 2, y0 + k1 / 2);
            k3 = h * f.apply(x0 + 3 * h / 4, y0 + 3 * k2 / 4);
            y1 = y0 + (2.0 / 9) * k1 + (1.0 / 3) * k2 + (4.0 / 9) * k3;
            x1 = x0 + h;
        }

        return new double[]{x1, y1};
    }
}
