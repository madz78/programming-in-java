package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

/**
 * Object class which implements MyStack interface.
 * @param <E> : type of Object
 */

public class MyStackDLLBImpl<E> implements MyStack<E> {

    private DLinkList<E> elems = new DLinkList<>();
    private int numOfElem = 0; //number of elements in the stack


    /**
     * Implementation of pop MyStack interface's method.
     * Decreases the number of elements in the stack and removes the top most element from the stack.
     * @return the data value of the removed element
     */
    @Override
    public E pop() {
        this.numOfElem--;
        return elems.removeFirst();
    }


    /**
     * Implementation of push MyStack interface's method.
     * Increases the number of elements in the stack and add the value to the stack.
     * @param x : element to add
     */
    @Override
    public void push(E x) {
        elems.addFirst(x);
        this.numOfElem++;
    }


    /**
     * Implementation of numOfElems MyStack interface's method.
     * @return an integer which represents the number of elements in the stack
     */
    @Override
    public int numOfElems() {
        return this.numOfElem;
    }


    /**
     * Implementation of peek MyStack interface's method.
     * @return the data value of the top element in the stack
     */
    @Override
    public E peek() {
        E temp = elems.removeFirst();
        elems.addFirst(temp);
        return temp;
    }

    /**
     * Method used to convert the stack into a string
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
