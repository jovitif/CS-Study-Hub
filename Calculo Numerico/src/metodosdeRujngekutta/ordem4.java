package metodosdeRujngekutta;

import java.text.DecimalFormat;
import java.util.function.BiFunction;

public class ordem4 {
	 public static double f1(double x, double y) {
	        return 1 - y / x;
	    }
	 
 public static void main(String[] args) {
     BiFunction<Double, Double, Double> f = (x, y) -> 1 - y / x;
     double x0 = 2;
     double y0 = 2;
     double xf = 2.1;
     double h = 0.1;

     double[] result = runge4(f, x0, xf, y0, h);
     double x1 = result[0];
     double y1 = result[1];

     System.out.println("Runge de ordem 4: y[" + x1 + "] = " + y1);
 }

 public static double[] runge4(BiFunction<Double, Double, Double> f, double x0, double xf, double y0, double h) {
     int n = (int) ((xf - x0) / h);
     double x = x0;
     double y = y0;

     for (int i = 0; i < n; i++) {
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
