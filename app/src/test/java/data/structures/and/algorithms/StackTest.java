package data.structures.and.algorithms;

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

}
