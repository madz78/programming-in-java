package agh.ii.prinjava.proj1.impl;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DLinkListTest {
    DLinkList<Integer> dLinkList = new DLinkList<>();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * We add successively three integers at the start of our Linked List in the following order: 1, 2, and 3.
     * At final, we expect the following Linked List in output: {3,2,1}
     */
    @Test
    void addFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);

        System.out.println(dLinkList);
    }

    /**
     * We add an integer (52) at the end of our Linked List
     * Then we add successively three integers at the start of our Linked List in the following order: 1, 2, and 3.
     * Then we add an integer (54) at the end of our Linked List
     * At final, we expect the following Linked List in output: {3,2,1,52,54}
     */
    @Test
    void addLast() {
        dLinkList.addLast(52);
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        dLinkList.addLast(54);

        System.out.println(dLinkList);
    }

    /**
     * We add successively three integers at the start of our Linked List in the following order: 1, 2, and 3.
     * Then we add an integer (54) at the end of our Linked List
     * Then we remove an element from the start of our Linked List
     * At final, we expect the following Linked List in output: {2,1,54}
     * And we expect 3 for the removeFirst returned value
     */
    @Test
    void removeFirst() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        dLinkList.addLast(54);


        System.out.println("Removed value: "+dLinkList.removeFirst());

        System.out.println(dLinkList);
    }

    /**
     * We add successively three integers at the start of our Linked List in the following order: 1, 2, and 3.
     * Then we add an integer (54) at the end of our Linked List
     * Then we remove an element from the end of our Linked List
     * At final, we expect the following Linked List in output: {3,2,1}
     * And we expect 54 for the removeLast returned value
     */
    @Test
    void removeLast() {
        dLinkList.addFirst(1);
        dLinkList.addFirst(2);
        dLinkList.addFirst(3);
        dLinkList.addLast(54);

        System.out.println("Removed value: "+dLinkList.removeLast());

        System.out.println(dLinkList);
    }
}