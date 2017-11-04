/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f03;

/**
 *
 * @author NunoFerreira
 */
public class ArrayStack<T> implements StackADT<T> {

    public final int DEFAULT_CAPACITY = 100;
    private int top;
    T[] arrayStack;

    public ArrayStack() {
        top = 0;
        arrayStack = (T[]) (new Object[DEFAULT_CAPACITY]);
    }

    public ArrayStack(int initialCapacity) {

        top = 0;
        arrayStack = (T[]) (new Object[initialCapacity]);

    }

    @Override
    public void push(T element) {

        if (size() == arrayStack.length) {
            expandCapacity();
        }

        arrayStack[top] = element;
        top++;

    }

    @Override
    public T pop() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Stack");
        }

        top--;
        T result = arrayStack[top];
        arrayStack[top] = null;

        return result;
    }

    @Override
    public T peek() {

        if (isEmpty()) {
            System.out.println("Empty Stack");
        }

        return arrayStack[top - 1];

    }

    @Override
    public boolean isEmpty() {

        if (top == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return top;
    }

    public void expandCapacity() {
        arrayStack = (T[]) (new Object[arrayStack.length + arrayStack.length]);
    }
}
