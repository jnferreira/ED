/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package f03;

import java.util.ArrayList;

/**
 *
 * @author Nuno
 */
public class LinkedQueue<T> implements QueueADT<T> {

    LinearNode<T> front, rear;
    private int size = 0;

    public LinkedQueue() {
        front = null;
        rear = null;
        size = 0;

    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> newNode = new LinearNode<>(element);

        if (front == null && rear == null) {

            front = newNode;
            rear = newNode;
            size++;

        } else {

            newNode.setNext(rear);
            rear = newNode;
            size++;

        }
    }

    @Override
    public T dequeue() {

        if (isEmpty()) {
            System.out.println("Sem elementos na LinkedStack");
            return null;
        } else {
            LinearNode<T> excluido = front;
            front = excluido.getNext();
            size--;
            return excluido.getElement();
        }

    }

    @Override
    public T first() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {

        LinearNode<T> current = rear;
        ArrayList<String> ar1 = new ArrayList<>();

        while (current != null) {

            ar1.add(current.toString());
            current = current.next;

        }
        return ar1.toString();

    }
}
