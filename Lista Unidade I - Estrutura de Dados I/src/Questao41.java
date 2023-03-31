import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
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
		//a) List: ArrayList, Vector, LinkedList - são classes que implementam a interface List em Java e permitem armazenar elementos em uma sequência ordenada.
		
		// ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Bruno");
		arrayList.add("Gadelha");
		arrayList.add("Paulo Cesar");
		System.out.println(arrayList); 

		// Vector
		List<String> vector = new Vector<>();
		vector.add("Estrutura de Dados I");
		vector.add("Programação Web");
		vector.add("Cálculo Numérico");
		System.out.println(vector); 

		// LinkedList
		List<String> linkedList = new LinkedList<>();
		linkedList.add("Bruno");
		linkedList.add("Gadelha");
		linkedList.add("Paulo Cesar");
		System.out.println(linkedList);
		
		//b) Set: HashSet, LinkedHashSet, TreeSet - são classes que implementam a interface Set em Java e permitem armazenar elementos sem repetição.
		
		// HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Gadelha");
		hashSet.add("Bruno");
		hashSet.add("Paulo Cesar");
		System.out.println(hashSet); 

		// LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Programação Web");
		linkedHashSet.add("Cálculo Numérico");
		linkedHashSet.add("Estrutura de Dados I");
		System.out.println(linkedHashSet); 

		// TreeSet
		Set<String> treeSet = new TreeSet<>();
		treeSet.add("Gadelha");
		treeSet.add("Bruno");
		treeSet.add("Paulo Cesar");
		System.out.println(treeSet); 
		
		//c) Queue: PriorityQueue, LinkedList - são classes que implementam a interface Queue em Java e permitem gerenciar elementos em uma fila, respeitando a ordem de inserção ou prioridade.
		
		// PriorityQueue
		Queue<String> priorityQueue = new PriorityQueue<>();
		priorityQueue.add("Programação Web");
		priorityQueue.add("Estrutura de Dados I");
		priorityQueue.add("Cálculo Numérico");
		System.out.println(priorityQueue); 

		// LinkedList
		Queue<String> linkedList02 = new LinkedList<>();
		linkedList02.add("Gadelha");
		linkedList02.add("Bruno");
		linkedList02.add("Paulo Cesar");
		System.out.println(linkedList); 
		
		//d) Deque: LinkedList - é uma classe que implementa a interface Deque em Java e permite gerenciar elementos em uma fila dupla, permitindo inserção e remoção tanto no início quanto no final da fila.
		
		// LinkedList
		Deque<String> deque = new LinkedList<>();
		deque.addFirst("Estrutura de Dados I");
		deque.addLast("Programação Web");
		deque.addFirst("Cálculo Numérico");
		System.out.println(deque); 
		
		//e) Map: HashMap, LinkedHashMap, TreeMap - são classes que implementam a interface Map em Java e permitem armazenar pares de chave-valor, onde as chaves não se repetem e são usadas para acessar os valores correspondentes.
		
		// HashMap
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("Gadelha", "Programação Web");
		hashMap.put("Bruno", "Estrutura de Dados I");
		hashMap.put("Paulo Cesar", "Cálculo Numérico");
		System.out.println(hashMap); // {Gadelha=Estrutura de Dados I, Bruno=Programação Web, Paulo Cesar=Cálculo Numérico}

		// LinkedHashMap
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("Paulo Cesar", "Cálculo Numérico");
		linkedHashMap.put("Gadelha", "Estrutura de Dados I");
		linkedHashMap.put("Bruno", "Programação Web");
		System.out.println(linkedHashMap); // {Paulo Cesar=Cálculo Numérico, Gadelha=Estrutura de Dados I, Bruno=Programação Web}

		// TreeMap
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("Bruno", "Estrutura de Dados I");
		treeMap.put("Gadelha", "Programação Web");
		treeMap.put("Paulo Cesar", "Cálculo Numérico");
		System.out.println(treeMap); 

	}
}
