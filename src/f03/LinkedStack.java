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
public class LinkedStack<T> implements StackADT<T> {

    LinearNode<T> top;
    private int size = 0;

    public LinkedStack() {
        top = null;
        size = 0;
    }

    @Override
    public void push(T element) {
        LinearNode<T> nodeEntrada = new LinearNode<>(element);

        if (top == null) {
            top = nodeEntrada;
            size++;
        } else {
            nodeEntrada.setNext(top);
            top = nodeEntrada;
            size++;
        }

    }

    @Override
    public T pop() {

        if (isEmpty()) {
            System.out.println("Sem elementos na LinkedStack");
            return null;
        } else {
            LinearNode<T> excluido = top;
            top = excluido.getNext();
            size--;
            return excluido.getElement();
        }

    }

    @Override
    public T peek() {
        return top.getElement();
    }

    public void displayList() {
        LinearNode<T> current = top;
        while (current != null) {
            System.out.println(current.toString());
            current = current.next;
        }
    }

    @Override
    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int size() {
        return size;
    }
    
    

}
