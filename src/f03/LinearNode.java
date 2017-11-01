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
public class LinearNode<T> {

    LinearNode<T> next;
    T element;

    public LinearNode() {
        next = null;
        element = null;
    }

    public LinearNode(T elem) {
        next = null;
        element = elem;
    }

    public LinearNode<T> getNext() {
        return next;
    }

    public void setNext(LinearNode<T> next) {
        this.next = next;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    @Override
    public String toString() {
        return "Valor= " + element + "\n";
    }
    
    

}
