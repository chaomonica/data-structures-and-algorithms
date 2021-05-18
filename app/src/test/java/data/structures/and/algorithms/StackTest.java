package data.structures.and.algorithms;

import data.structures.and.algorithms.stackAndQueue.MyStack;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StackTest {

    private MyStack testStack;
    @BeforeEach
    void setUp(){
        testStack = new MyStack();
    }

    @Test
    void newStackShouldExist(){
        assertNotNull(testStack);
    }

    @Test
    void newStackShouldBeEmpty(){
        boolean expected = true;
        boolean actual = testStack.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void stackShouldNotBeEmptyAfterNodeAdded(){
        boolean expected = false;
        testStack.push(5);
        boolean actual = testStack.isEmpty();
        assertEquals(expected, actual);
    }

    @Test
    void peekShouldReturnTopItemInStackWithoutRemoving(){
        int expected = 5;
        testStack.push(5);
        int actual = testStack.peek();
        assertEquals(expected, actual);
        assertEquals(false, testStack.isEmpty());
    }

    @Test
    void popShouldRemoveTopItemFromStackAndReturnItsValue(){
        testStack.push(5);
        testStack.push(10);
        int expected = 10;
        int actual = testStack.pop();
        assertEquals(expected, actual);
        assertEquals(5, testStack.pop());
    }

}
