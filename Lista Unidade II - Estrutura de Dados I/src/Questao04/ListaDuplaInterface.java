package Questao04;
//busca por ID
public interface ListaDuplaInterface<T> {
	  void addFirst(T value);
	    void addLast(T value);
	    void addAfter(T dado, int idCrit);
	    
	    T peekFirst();
	    T peekLast();
	    
	    T search(int idCrit);
	    
	    T removeFirst();
	    T removeLast();
	    T remove(int idCrit); 
	    
		void show();			// opcional
		void showReverse();		// opcional
}
