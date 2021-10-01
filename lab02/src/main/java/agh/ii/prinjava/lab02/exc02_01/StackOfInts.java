package agh.ii.prinjava.lab02.exc02_01;

/**
 * Stack of integers - Abstract Data Type (ADT)
 */

/**
 * A stack is a pile of object
 */
public interface StackOfInts {

    /**
     * pop() is used to "pull" the top element of the stack
     */
    int pop();

    /**
     * Method used to "add" an element in the stack (place to the top of the stack)
     * @param  x
     */
    void push(int x);

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
    int peek();
}
