package DesafiosLeetCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzz {
	 public static List<String> fizzBuzz(int n) {
         List<String> lista = new ArrayList<String>();
         for (int i = 1; i <= n; i++){
        if((i % 3 == 0) && (i% 5 == 0)){
         lista.add("FizzBuzz");
        }else if(i % 5 == 0){
         lista.add("Buzz");
        }else if((i % 3 == 0)){
           lista.add("Fizz");
        }else{
            lista.add(Integer.toString(i));
         }
      }
        return lista;
    }
	 
	 public static Scanner scanner = new Scanner(System.in);
	 
	 public static void main(String []args) {
		 System.out.print("Digite um número: ");
		 int num = scanner.nextInt();
		 System.out.print("Lista: " + fizzBuzz(num));
	 }
}
