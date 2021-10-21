package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyQueueDLLBImpl;


/**
 * A queue is a structure of data which work on FIFO (First In First Out) principe.
 * @param <E> : type of Object
 */

public interface MyQueue<E> {

    /**
     * Method uses to add an element in the rear of the Queue
     * @param x : element to add
     */
    void enqueue(E x);

    /**
     * Method uses to remove the first element (in front) of the queue
     * @return the value of the data contained in the removed node.
     */
    E dequeue();


    /**
     * Method uses to verify if a queue is empty or not.
     * @return true if the queue is empty or false if it is not.
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }

    /**
     * Method uses to determine the number of elements in the queue;
     * @return an integer which represents the number of elements in the queue
     */
    int numOfElems();

    /**
     * Method uses to get the value of the first element (in front) of the queue.
     * @return the value of the first element of the Queue.
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyQueue<T> create() {
        return new MyQueueDLLBImpl<>();
    }
}
