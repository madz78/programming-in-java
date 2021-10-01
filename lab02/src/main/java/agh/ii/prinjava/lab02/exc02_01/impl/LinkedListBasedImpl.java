package agh.ii.prinjava.lab02.exc02_01.impl;

import agh.ii.prinjava.lab02.exc02_01.StackOfInts;


/**
 * Class to create a stack from linked list
 */
public class LinkedListBasedImpl implements StackOfInts {
    /**
     *implementation of StackOfInts class's pop() function
     * @return
     */
    @Override
    public int pop() {
        throw new IllegalStateException("To be implemented");

        topElem = topElem.next;
    }

    /**
     * implementation of StackOfInts class's push() function
     * @param x
     */
    @Override
    public void push(int x) {
        throw new IllegalStateException("To be implemented");
        Node newNode = new Node(x);

        newNode.next = topElem;

        topElem = newNode;
    }

    /**
     * implementation of StackOfInts class's numOfElems() function
     * @return
     */
    @Override
    public int numOfElems() {
        return numOfElems;
    }

    /**
     * implementation of StackOfInts class's peek() function
     * @return
     */
    @Override
    public int peek() {
        throw new IllegalStateException("To be implemented");

        int ne = numOfElems();

        if (ne == 0){
            System.out.println("Error ! Empty stack");
        }
        else{
            return topElem.elem;
        }
    }

    /**
     * Inner class Node
     */
    private static class Node {
        int elem;
        Node next;
        public Node(int elem) {
            this.elem = elem;
        }
    }

    Node topElem;

    private int numOfElems = 0;
}
