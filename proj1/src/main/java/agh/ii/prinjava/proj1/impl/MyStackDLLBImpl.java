package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;

public class MyStackDLLBImpl<E> implements MyStack<E> {

    private DLinkList<E> elems;

    @Override
    public E pop() {
        //throw new IllegalStateException("To be implemented");
        E temp;
        if (elems.topElem == null) {
            System.out.println("Error ! Empty Stack. Cannot pop.");
        }
        temp = elems.topElem.getElem();
        elems.topElem = elems.topElem.getNext();
        return temp;
    }

    @Override
    public void push(E x) {
        //throw new IllegalStateException("To be implemented");
        /*Node newNode = new Node(x);

        newNode.next = topElem;

        topElem = newNode;*/
        DLinkList<E> newNode = new DLinkList<E>();
        newNode.topElem.setElem(x);
        newNode.topElem.setNext(elems.topElem);
        elems = newNode; // ou elems.topElem = newNode.topElem
    }

    @Override
    public int numOfElems() {
        throw new IllegalStateException("To be implemented");
    }

    @Override
    public E peek() {
        //throw new IllegalStateException("To be implemented");
        if (elems.topElem == null) {
            System.out.println("Error ! Empty Stack. Cannot pop.");
        }
        return elems.topElem.getElem();
    }
}
