package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * A stack is structure of data which work on FILO (First In Last Out) principe.
 * @param <E> : type of Object
 */

public interface MyStack<E> {

    /**
     * Method used to pull/remove the top element of the stack.
     * @return the data value of the removed element.
     */
    E pop();

    /**
     * Method used to "add" an element in the stack (place to the top of the stack).
     * @param x : element to add
     */
    void push(E x);


    /**
     * Method used to verify if a stack isEmpty
     * @return True if stack is empty or false if it is not.
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }


    /**
     * Method used to count how many elements there are in the stack
     * @return The number of element in the stack (integer type)
     */
    int numOfElems();

    /**
     * Returns the value of the top most element without delete it.
     * @return the value of the top most element
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
