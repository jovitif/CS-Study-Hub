package Questao03;

/*
	3. Desenvolva um programa e implemente as função básicas de manipulação de uma lista 
	simplesmente encadeada.Desenvolva sua própria classe ListaSimples. Utilize Generic.
*/
public class Questao03 {
	public static void main(String []args) {
		ListaSimplesInterface<String> lista01 = new ListaSimples<String>();
		lista01.addFirst("João");
		lista01.addLast("Vitor");
		lista01.addLast("Fernandes");
		lista01.addLast("Sales");
		lista01.addAfter("Fernandes", "de");
		lista01.show();
	}
}
