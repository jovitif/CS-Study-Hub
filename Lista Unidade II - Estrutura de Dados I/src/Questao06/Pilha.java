package Questao06;

/*
		Pilha de tamanho dinâmico : uma pilha de tamanho dinâmico pode aumentar ou diminuir 
	dinamicamente. Quando a pilha está cheia, ela automaticamente aumenta seu tamanho para 
	acomodar o novo elemento, e quando a pilha está vazia, ela diminui seu tamanho. Esse tipo 
	de pilha é implementado usando uma lista encadeada, pois permite o redimensionamento fácil 
	da pilha.
*/

public class Pilha<T> implements PilhaInterface<T> {
    private StackNode<T> root;

    private static class StackNode<T> {
        private T data;
        private StackNode<T> next;

        private StackNode(T data) {
            this.data = data;
        }
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void push(T data) {
        StackNode<T> newNode = new StackNode<>(data);

        if (root == null) {
            root = newNode;
        } else {
            StackNode<T> temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }

    public T pop() {
        T popped = null;
        if (root == null) {
            System.out.println("Stack is empty");
        } else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }

    public T peek() {
        if (root == null) {
            System.out.println("Stack is empty");
            return null;
        } else {
            return root.data;
        }
    }
}
