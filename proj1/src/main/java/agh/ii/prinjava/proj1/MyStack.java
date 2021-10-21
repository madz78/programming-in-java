package agh.ii.prinjava.proj1;

import agh.ii.prinjava.proj1.impl.MyStackDLLBImpl;

/**
 * A stack is a pile of object
 * @param <E>
 */

public interface MyStack<E> {

    /**
     * pop() is used to pull/remove the top element of the stack.
     */
    E pop();

    /**
     * Method used to "add" an element in the stack (place to the top of the stack)
     */
    void push(E x);


    /**
     * Method used to verify if a stack isEmpty
     * @return True if stack is empty
     */
    default boolean isEmpty() {
        return numOfElems() == 0;
    }


    /**
     * Method used to count how many elements there are in the stack
     * @return THe number of element in the stack (int type)
     */
    int numOfElems();

    /**
     * Returns the value of the top most element without delete it
     */
    E peek();

    /** Consider pros and cons of having a factory method in the interface */
    static <T> MyStack<T> create() {
        return new MyStackDLLBImpl<T>();
    }
}
