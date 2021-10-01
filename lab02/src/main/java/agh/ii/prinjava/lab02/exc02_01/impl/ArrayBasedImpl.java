package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;

/**
 * Class to create a stack from array
 */
public class ArrayBasedImpl implements StackOfInts {

    /**
     *implementation of StackOfInts class's pop() function
     * @return
     */
    @Override
    public int pop() {
        throw new IllegalStateException("To be implemented");
    }

    /**
     *implementation of StackOfInts class's pop() function
     * @return
     */
    @Override
    public void push(int x) {
        throw new IllegalStateException("To be implemented");
    }

    /**
     *implementation of StackOfInts class's pop() function
     * @return
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     *implementation of StackOfInts class's pop() function
     * @return
     */
    @Override
    public int peek() {
        throw new IllegalStateException("To be implemented");
    }


    private int numOfElems = 0;
}
