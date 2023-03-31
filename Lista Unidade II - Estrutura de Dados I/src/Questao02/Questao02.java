package Questao02;

import java.util.Scanner;

import Questao01.Pilha;
import Questao01.PilhaInterface;

public class Questao02 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		System.out.print("Digite o tamanho da sua fila circular:");
		int tam = scanner.nextInt();
		FilaInterface<Integer> fila = new Fila<Integer>(tam);
		fila.adicionarElemento(1);
		fila.adicionarElemento(2);
		fila.adicionarElemento(3);
		fila.adicionarElemento(4);
		fila.adicionarElemento(5);
		
		int valorRetorno;
		valorRetorno = fila.consultarElemento();
		System.out.println(valorRetorno + " está no inicio");
		valorRetorno = fila.removerElemento();
		System.out.println("O elemento " + fila.consultarElemento() + " está no inicio");
		fila.mostrarElementos();
		System.out.println("A fila está cheia (?): " + fila.estaCheio());
		System.out.println("A fila está vazia (?): " + fila.estaVazio());
	}
}