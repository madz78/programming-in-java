package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    private Node<E> topElem = null; //first element of the Linked List

    /**
     * Method used to add an element at the start of the Linked List (a.k.a LL)
     * @param x : element to add
     */
    public void addFirst(E x){
        Node<E> node = new Node<>();
        node.elem = x;
        if(topElem!=null){
            this.topElem.prev = node;
            node.next = this.topElem;
            this.topElem = node;
        } else{
            topElem = node;
        }
        //System.out.println("addFirst "+x);
    }

    /**
     * Method used to add an element at the end of the LL
     * @param x : element to add
     */
    public void addLast(E x){
        Node<E> newNode = new Node<>();
        newNode.elem = x;

        if(topElem != null){
            Node<E> temp = topElem;

            while (temp.next !=null){
                temp = temp.next;
                //System.out.println("next "+ temp.elem);
            }
            temp.next = newNode;
            newNode.prev = temp;
            newNode.next=null;
            //System.out.println("addLast "+ newNode.elem);
        }else {
            topElem = newNode;
            //System.out.println("addLast " + newNode.elem);
        }
    }


    /**
     * Method used to remove an element from the start of the LL
     * @return the data value of the removed element
     */
    public E removeFirst(){
        if(topElem==null) {
            System.out.println("Error ! Is empty !");
            return null;
        }else {
            E temp = topElem.elem;
            topElem = topElem.next;
            return temp;
        }
    }

    /**
     * Method used to remove an element from the end of the LL
     * @return the data value of the removed element
     */
    public E removeLast(){
        if(topElem==null){
            System.out.println("Error ! Is empty !");
            return null;
        }else {
            Node<E> temp = topElem;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next = null;
            temp.prev = null;
            return temp.elem;
        }
    }

    private static class Node<T> {
        T elem;
        Node<T> next = null;
        Node<T> prev = null;
    }

    /**
     * Method used to convert the Linked List into a string
     */
    @Override
    public String toString() {
        String l = "List: {";
        Node<E> temp = new Node<>();
        temp.elem = this.topElem.elem;
        temp.next = this.topElem.next;
        temp.prev = this.topElem.prev;
        while (temp.next != null){
            l = l+" "+temp.elem+",";
            temp = temp.next;
        }
        l = l+" "+temp.elem+" }";

        return l;
    }
}
