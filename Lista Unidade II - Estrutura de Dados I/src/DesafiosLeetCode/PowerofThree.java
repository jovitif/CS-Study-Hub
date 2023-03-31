package DesafiosLeetCode;

import java.util.Scanner;

public class PowerofThree {
	 public static boolean isPowerOfThree(int n) {
	        if (n <= 0) {
	            return false; // Caso n seja não positivo, não é uma potência de 3
	        }
	        while (n % 3 == 0) {
	            n = n / 3; // Continua dividindo n por 3 até que n não seja mais divisível por 3
	        }
	        return (n == 1); // Se n é uma potência de 3, o resultado da divisão sucessiva será 1
	    }
	 public static Scanner scanner = new Scanner(System.in);
	 public static void main(String []args) {
		 System.out.print("Digite um numero: ");
		 int num = scanner.nextInt();
		 System.out.print("Ele é divisivel por 3: " + isPowerOfThree(num));
	 }
}
