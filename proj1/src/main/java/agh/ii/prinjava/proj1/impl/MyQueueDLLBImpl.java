package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;

/**
 * Object class which implements MyQueue interface.
 * @param <E> : type of Object
 */
public class MyQueueDLLBImpl<E> implements MyQueue<E> {
    private DLinkList<E> elems = new DLinkList<>();
    private int numOfElem = 0; //number of elements in the queue

    /**
     * Implementation of enqueue MyQueue interface's method.
     * Increases the number of elements in the queue and add the value to the queue.
     * @param x : element to add
     */
    @Override
    public void enqueue(E x) {
        elems.addFirst(x);
        this.numOfElem++;
    }

    /**
     * Implementation of dequeue MyQueue interface's method.
     * Decreases the number of elements in the queue and removes the front element from the queue.
     * @return the value of the data contained in the removed element
     */
    @Override
    public E dequeue() {
        this.numOfElem--;
        return elems.removeLast();
    }

    /**
     * Implementation of numOfElems MyQueue interface's method.
     * @return an integer which represents the number of elements in the queue
     */
    @Override
    public int numOfElems() {
        return this.numOfElem;
    }


    /**
     * Implementation of peek MyQueue interface's method.
     * @return the value of the data contained in the first element (at front) of the Queue.
     */
    @Override
    public E peek() {
        E temp = elems.removeLast();
        elems.addLast(temp);
        return temp;
    }

    /**
     * Method used to convert the queue into a string
     */
    @Override
    public String toString(){
        return elems.toString();
    }
}
