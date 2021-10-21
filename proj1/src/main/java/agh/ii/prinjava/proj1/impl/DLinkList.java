package agh.ii.prinjava.proj1.impl;

public class DLinkList<E> {

    protected Node<E> topElem;

    /**
     * Method used to add an element at the start of the LL
     * @param node
     */
    public void addFirst(Node node){
        topElem.prev = node;

        node.next = topElem;
    }

    /**
     * Method used to add an element at the end of the LL
     * @param last
     */
    public void addLast(Node last){
        Node temp = new Node(topElem); // à implémenter
        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = last;
        last.prev = temp;

        //parcourir la liste jusqu'à ce qu'un noeud est son next==null

    }


    /**
     * Method used to remove an element from the start of the LL
     */
    public void removeFirst(){
        topElem = topElem.next;

    }

    /**
     * Method used to remove an element from the end of the LL
     */
    public void removeLast(){
        Node temp = new Node(topElem); // à implémenter
        while (temp.next != null){
            temp = temp.next;
        }
        temp.prev.next = null;
    }

    private static class Node<T> {
        protected T elem;
        protected Node<T> next;
        protected Node<T> prev;

        /**
         * Constructor to construct a new instance from an existing Node
         */
        public Node<T>(Node<T> node){
            this.elem = node.elem;
            this.next = node.next;
            this.prev = node.prev;
        };

        public T getElem() {
            return elem;
        }

        public Node<T> getNext() {
            return next;
        }

        public Node<T> getPrev() {
            return prev;
        }

        /* Setters */
        public void setElem(T elem) {
            this.elem = elem;
        }

        public void setNext(Node<T> next) {
            this.next = next;
        }

        public void setPrev(Node<T> prev) {
            this.prev = prev;
        }
    }

    /**
     * toString method : used to convert the Object into a string
     * @return
     */
    @Override
    public String toString() {
        return super.toString();
    }
}
