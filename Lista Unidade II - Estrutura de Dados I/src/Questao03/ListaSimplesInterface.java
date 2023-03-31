package Questao03;
//Observação essa busca pode ser realizado tanto por id, como pelo objeto. Nesse exemplo iremos buscar pelo objeto
public interface ListaSimplesInterface <T>{
	   void addFirst(T value);
	    void addLast(T value);
	    void addAfter(T dado, T crit);
	    
	    T peekFirst();
	    T peekLast();
	    
	    T search(T crit);
	    
	    T removeFirst();
	    T removeLast();
	    T remove(T crit); 
	    
		void show();			// opcional
		void showReverse();		// opcional
}
