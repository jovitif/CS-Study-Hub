package Aula;

import java.util.ArrayList;
import java.util.List;

/*
  			Collection - Java
  			-> List / Queue / Set -> interface -> contrato
  			 	.List permite implementar estruturas lineares, que pode haver elementos repetidos.
  				-> ArrayList -> implementa uma lista -> os elementos são armazenados de forma adjacente na memoria. É mais lento que o array
  				-> LinkedList
  				-> Vector
*/

public class MainEx01List {
	public static void main(String []args) {
		List<String> list1 = new ArrayList<String>(10); 
		list1.add(0,"zero");
		list1.add(1,"um");
		list1.add("dois");
		list1.add("tres");
		list1.add("quatro");
		System.out.println("size = " + list1.size()); //Quantidade de elementos adicionados lenght é string
	    System.out.println(list1);					  //Vai mostrar os objetos [zero, um, dois, tres, quatro]
	    
	    String str = list1.remove(1);		//Vai retornar o conteudo do objeto
	    boolean bool = list1.remove("tres"); //Retorna um valor booleano
	    
	    System.out.println("Remove(1): " + str);
	    System.out.println("Remove: " + bool);
	    System.out.println("list1");
	}
}
