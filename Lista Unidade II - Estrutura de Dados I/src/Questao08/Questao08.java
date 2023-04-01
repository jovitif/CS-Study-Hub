package Questao08;

import java.util.Scanner;
import java.util.Stack;

/*
8. Desenvolva um programa que implemente o algoritmo que leia uma expressão já na forma pós-fixa e a resolva.
Exemplo: Expressão infixa: 304 + 11 - 2 Expressão pós-fixa: 304 11 + 2 - Resultado: 313
Algoritmo:
1. Inicialize pilha vazia
2. Varra a expressão:
2.1. Se for operando, empilhe o valor.
2.2. Se for operador, desempilhe dois valores da pilha, efetue a operação com eles e empilhe o resultado.
3. Ao final, exiba o elemento no topo da pilha, que é o resultado da expressão.

*/

/*
Infix to Postfix Stack : Este tipo de pilha é usado para converter 
expressões infixas em expressões postfixas.
*/

public class Questao08 {
	public static Scanner input = new Scanner(System.in);
	public static void main(String []args) {
	        Stack<Integer> pilha = new Stack<Integer>();

	        System.out.print("Digite a expressão na forma pós-fixa: ");
	        String expressao = input.nextLine();

	        String[] tokens = expressao.split(" "); //"304","11","+","2","-" 

	        for (String token : tokens) {
	            if (isOperando(token)) {
	                pilha.push(Integer.parseInt(token)); //vai adicionar um numero na pilha
	            } else if (isOperador(token)) {
	                int valor2 = pilha.pop(); //valor 11
	                int valor1 = pilha.pop(); //valor 304
	                int resultado = aplicarOperacao(token, valor1, valor2);
	                pilha.push(resultado);
	            }
	        }

	        int resultado = pilha.pop();
	        System.out.println("Resultado: " + resultado);
	    }

	    private static boolean isOperando(String token) {
	        try {
	            Integer.parseInt(token); //dispara uma excessão se não for numero
	            return true;
	        } catch (NumberFormatException e) {
	            return false;
	        }
	    }

	    private static boolean isOperador(String token) {
	        return token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/");
	    }

	    private static int aplicarOperacao(String operador, int valor1, int valor2) {
	        switch (operador) {
	            case "+":
	                return valor1 + valor2;
	            case "-":
	                return valor1 - valor2;
	            case "*":
	                return valor1 * valor2;
	            case "/":
	                return valor1 / valor2;
	            default:
	                throw new IllegalArgumentException("Operador inválido: " + operador);
	        }
		
	}
}
