package Questao06;

import java.util.Arrays;
/*
		Pilha de tamanho dinâmico : uma pilha de tamanho dinâmico pode aumentar ou diminuir 
	dinamicamente. Quando a pilha está cheia, ela automaticamente aumenta seu tamanho para 
	acomodar o novo elemento, e quando a pilha está vazia, ela diminui seu tamanho. Esse tipo 
	de pilha é implementado usando uma lista encadeada, pois permite o redimensionamento fácil 
	da pilha.
*/

public class Pilha  {
	StackNode root;
	  
    static class StackNode {
        int data;
        StackNode next;
  
        StackNode(int data) { this.data = data; }
    }
  
    public boolean isEmpty()
    {
        if (root == null) {
            return true;
        }
        else
            return false;
    }
  
    public void push(int data)
    {
        StackNode newNode = new StackNode(data);
  
        if (root == null) {
            root = newNode;
        }
        else {
            StackNode temp = root;
            root = newNode;
            newNode.next = temp;
        }
        System.out.println(data + " pushed to stack");
    }
  
    public int pop()
    {
        int popped = Integer.MIN_VALUE;
        if (root == null) {
            System.out.println("Stack is Empty");
        }
        else {
            popped = root.data;
            root = root.next;
        }
        return popped;
    }
  
    public int peek()
    {
        if (root == null) {
            System.out.println("Stack is empty");
            return Integer.MIN_VALUE;
        }
        else {
            return root.data;
        }
    }
}
