package agh.ii.prinjava.proj1.impl;

import agh.ii.prinjava.proj1.MyStack;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyStackDLLBImplTest {
    MyStack<Integer> stackOfInts = MyStack.create();

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    /**
     * We add successively three integers to our stack in the following order: 5, 6 and 7.
     * Then we pop the stack
     * At final, we expect the following stack in output: {6,5}
     * And we expect 7 for the pop returned value
     */
    @Test
    void pop() {
        stackOfInts.push(5);
        stackOfInts.push(6);
        stackOfInts.push(7);
        System.out.println("Pop value: "+stackOfInts.pop());
        System.out.println(stackOfInts);
    }

    /**
     * We add successively two integers to our stack in the following order: 7 and 14.
     * We expect the following stack in output: {14,7}
     */
    @Test
    void push() {
        stackOfInts.push(7);
        stackOfInts.push(14);
        System.out.println(stackOfInts);
    }

    /**
     * We add successively four integers to our stack in the following order: 5, 6, 7 and 10.
     * Then we pop the stack once
     * At final, we expect the following stack in output: {7,6,5}
     * And we expect 3 for the numOfElems returned value.
     */
    @Test
    void numOfElems() {
        stackOfInts.push(5);
        stackOfInts.push(6);
        stackOfInts.push(7);
        stackOfInts.push(10);

        System.out.println("Po value: "+stackOfInts.pop());
        System.out.println(stackOfInts);
        System.out.println("Nb of elements: "+stackOfInts.numOfElems());
    }

    /**
     * We add successively four integers to our stack in the following order: 5, 6, 7 and 10.
     * Then we peek the stack
     * At final, we expect the following stack in output: {10,7,6,5}
     * And we expect 10 for the peek returned value
     */
    @Test
    void peek() {
        stackOfInts.push(5);
        stackOfInts.push(6);
        stackOfInts.push(7);
        stackOfInts.push(10);

        System.out.println("Peek value: "+stackOfInts.peek());
        System.out.println(stackOfInts);
    }
}