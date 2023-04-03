package Questao06;

//6. Implemente a Pilha da questão 1 em uma estrutura de Lista Encadeada

public class Questao06 {
	public static void main(String []args) {
		PilhaInterface<String>pilha = new Pilha<String>();
		System.out.println(pilha.isEmpty());
		pilha.push("Joao");
		pilha.push("Vitor");
		System.out.println(pilha.peek());
	}
}
