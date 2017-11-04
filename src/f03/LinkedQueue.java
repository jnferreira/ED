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
        front = rear = null;
        size = 0;

    }

    @Override
    public void enqueue(T element) {
        LinearNode<T> node = new LinearNode<T>(element);

        if (isEmpty()) {
            front = node;
            rear = node;
            size++;
        } else {
            rear.setNext(node);
            rear = node;
            size++;
        }

    }

    @Override
    public T dequeue() throws EmptyCollectionException{

        if (isEmpty()) {
            throw new EmptyCollectionException("Queue");
        }

        T result = front.getElement();
        front = front.getNext();
        size--;

        if (isEmpty()) {
            rear = null;
        }

        return result;

    }

    @Override
    public T first() throws EmptyCollectionException {
        if (isEmpty()) {
            throw new EmptyCollectionException("Queue");
        }

        return front.getElement();
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

    @Override
    public String toString() {

        String result = "";
        LinearNode<T> current = front;

        while (current != null) {
            result = result + (current.getElement()).toString() + "\n";
            current = current.getNext();
        }

        return result;
    }
}
