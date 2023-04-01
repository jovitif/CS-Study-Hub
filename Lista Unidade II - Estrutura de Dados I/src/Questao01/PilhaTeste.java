package Questao01;

import java.util.Stack;

/*
Pilha é uma estrutura de dados linear que segue uma ordem específica na qual as operações são 
executadas. A ordem é LIFO (Last in first out) . Inserir e recuperar dados é possível apenas de 
uma extremidade. A entrada e recuperação de dados também é chamada de operação push e pop em uma
 pilha. Existem diferentes operações possíveis em uma pilha, como inverter uma pilha usando 
 recursão, classificação, exclusão do elemento do meio de uma pilha, etc. 
*/
public class PilhaTeste {
	public static void main(String []args) {
		Stack<String>Pilha = new Stack<String>(); //Estrutura dinamica já feita em java. Nesse exemplo usamos Vector, mas ela pode ser feita usando Array e Lista
		Pilha.add("Joao");
		Pilha.add("Vitor");
		Pilha.add("Fernandes");
		Pilha.add("Sales");
		Pilha.add(0, "Jota");
		System.out.print(Pilha.push("JotaVe"));
		System.out.print(Pilha.toString());
	}
}
