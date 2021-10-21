package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyQueue;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyQueueDLLBImplTest {
    MyQueue<Integer> queueOfInts = MyQueue.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * We add successively two integers to our queue in the following order: 5 and 7.
     * We expect the following queue in output: {7,5}
     */
    @Test
    void enqueue() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(7);
        System.out.println(queueOfInts);
    }

    /**
     * We add successively two integers to our queue in the following order: 5 and 4.
     * Then we dequeue the queue
     * At final, we expect the following queue in output: {4}
     * And we expect 5 for the dequeue returned value.
     */
    @Test
    void dequeue() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(4);
        System.out.println("Dequeued value: "+queueOfInts.dequeue());
        System.out.println(queueOfInts);
    }

    /**
     * We add successively five integers to our queue in the following order: 5, 4, 5, 5 and 5.
     * Then we dequeue the queue once
     * At final, we expect the following queue in output: {5,5,5,4}
     * And we expect 4 for the numOfElems method's value
     */
    @Test
    void numOfElems() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(5);

        System.out.println("Dequeued value: "+queueOfInts.dequeue());
        System.out.println(queueOfInts);
        System.out.println("Nb of element: "+queueOfInts.numOfElems());
    }


    /**
     * We add successively five integers to our queue in the following order: 5, 4, 3, 2 and 1.
     * At final, we expect the following queue in output: {1,2,3,4,5}
     * And we expect 5 for the peek returned value.
     */
    @Test
    void peek() {
        queueOfInts.enqueue(5);
        queueOfInts.enqueue(4);
        queueOfInts.enqueue(3);
        queueOfInts.enqueue(2);
        queueOfInts.enqueue(1);
        System.out.println(queueOfInts);
        System.out.println("Peek value: "+queueOfInts.peek());
    }
}