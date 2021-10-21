package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;

public interface MyQueue<E> {

    /**
     * Method uses to add an element in the rear of the Queue
     * @param x
     */
    void enqueue(E x);

    /**
     * Method uses to remove the first element (in front) of the Queue
     */
    E dequeue();

    /**
     * Method uses to verify if a queue is empty or not.
     */

    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Method uses to determine the number of elements in the queue;
     * @return
     */
    int numOfElems();

    /**
     * Method uses to get the value of the top Element
     * @return
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
