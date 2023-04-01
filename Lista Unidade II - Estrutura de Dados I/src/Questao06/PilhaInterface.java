package Questao06;

public interface PilhaInterface<T> {
    boolean isEmpty();
    void push(T data);
    T pop();
    T peek();
}
