import java.util.Scanner;

/*
	Utilizando o recurso Generic de Java, faça um método para exibir um objeto (usando seu método toString), 
	e outro método para exibir os elementos de um vetor
*/
public class Questao38{
	private static Scanner scanner = new Scanner(System.in);
	public static <T> void mostrarObjeto(T objeto) {
	    System.out.println(objeto.toString());
	  }
	 public static <T> void main(T[] array) {
		    for (T elementos : array) {
		      System.out.println(elementos.toString());
		    }
		}
}
