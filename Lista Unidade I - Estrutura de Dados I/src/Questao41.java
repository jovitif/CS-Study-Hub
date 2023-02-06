import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

/*
 *		Utilizando a Collection de Java, faça exemplos de uso das classes abaixo e explicite suas diferenças:
 *		a) List: ArrayList, Vector, LinkedList
 *		b) Set: HashSet, LinkedHashS, TreeSet
 *		c) Queue: PriorityQeue, LinkedList
 *		d) Deque: LinkedList
 *		e) Map: HashMap, LinkedHashMap, TreeMap 
 * */

public class Questao41 {
	public static Scanner scanner = new Scanner(System.in);
	public static void main(String []args) {
		/*
		  a) List: ArrayList, Vector, LinkedList
		  A interface 'List' fornece métodos para acessar, adicionar, remover e manipuçar elementos na lista. Além disso, permite acessar elementos pela posição indexada, o que é útil para recuperar ou alterar um elemento específico na lista
			java.util.List
			ArrayList é uma implementação baseada em vetor da interface List. Ela armazena os elementos em uma matriz interna que pode ser redimensionada dinamicamente. Isso significa que o tamanho da lista pode ser ajustado automaticamente à medida que elementos são adicionados ou removidos. A ArrayList é mais eficiente para acessar elementos por posição, mas pode ser menos eficiente para inserções e remoções no meio da lista.
			List<String> list = new ArrayList<>();
			list.add("item1");
		 */
			List<String> list = new ArrayList<>();
			/*
			  LinkedList é uma implementação baseada em lista ligada da interface List. Em vez de armazenar elementos em uma matriz, os elementos são armazenados como nós de uma lista ligada. Isso significa que a LinkedList é mais eficiente para inserções e remoções no meio da lista, mas pode ser menos eficiente para acessar elementos por posição.
			 */
			List<String> list2 = new LinkedList<>();
	
	/*Vector é uma implementação antiga da interface List no Java. Ela é semelhante à ArrayList, mas é sincronizada. Isso significa que a Vector é segura para uso por múltiplas threads, enquanto a ArrayList não é. No entanto, a sincronização pode prejudicar o desempenho em aplicações que não precisam de segurança de threads.*/
			List<String> list3 = new Vector<>();
	/*HashSet é uma implementação da interface Set que usa um HashMap interno para armazenar os elementos. Ele não mantém a ordem dos elementos na coleção, o que significa que a ordem de iteração pode ser diferente da ordem de inserção. A HashSet é eficiente para verificar a presença de elementos, mas pode ser menos eficiente para ordenar elementos.*/
			Set<String> set = new HashSet<>();
			/*LinkedHashSet é uma implementação da interface Set que usa um LinkedHashMap interno para armazenar os elementos. Ele mantém a ordem dos elementos na coleção, o que significa que a ordem de iteração será a mesma da ordem de inserção. A LinkedHashSet é menos eficiente para verificar a presença de elementos do que a HashSet, mas é mais eficiente para manter a ordem dos elementos.*/
			Set<String> set2 = new LinkedHashSet<>();
			/*TreeSet é uma implementação da interface Set que usa uma TreeMap interna para armazenar os elementos. Ele mantém os elementos ordenados de acordo com a ordem natural dos elementos ou de acordo com uma ordem especificada pelo usuário. A TreeSet é mais eficiente para ordenar elementos do que a LinkedHashSet, mas pode ser menos eficiente para verificar a presença de elementos.*/
			Set<String> set3 = new TreeSet<>();
	}
}
