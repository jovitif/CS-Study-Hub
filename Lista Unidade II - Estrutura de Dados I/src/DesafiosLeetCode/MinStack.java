package DesafiosLeetCode;

import java.util.Stack;

public class MinStack {
	static class MinStack2 {
	    private Stack<Integer> stack;
	    private Stack<Integer> minStack;

	    public MinStack2() {
	        stack = new Stack<>();
	        minStack = new Stack<>();
	    }

	    public void push(int val) {
	        stack.push(val);
	        if (minStack.isEmpty() || val <= minStack.peek()) {
	            minStack.push(val);
	        }
	    }

	    public void pop() {
	        if (stack.peek().equals(minStack.peek())) {
	            minStack.pop();
	        }
	        stack.pop();
	    }

	    public int top() {
	        return stack.peek();
	    }

	    public int getMin() {
	        return minStack.peek();
	    }
	}
	
	public static void main(String []args) {
		MinStack2 pilha = new MinStack2();
		pilha.push(10);
		pilha.push(20);
		pilha.push(30);
		System.out.print(pilha.top());
	}
}
