package data.structures.and.algorithms;

import data.structures.and.algorithms.linkedlist.MyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyLinkedListTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }

    @Test
    public void createNewLinkedList(){
        MyLinkedList myLinkedList = new MyLinkedList();
        assertNotNull(myLinkedList);
    }

    @Test
    public void MyLinkedListCanUpdateHeadNode(){
        MyLinkedList myLinkedList = new MyLinkedList();
        assertNull(myLinkedList.head);
        myLinkedList.add(5);
    }

    @Test
    public void IsEmptyReturnsTrueOnEmptyList(){
        MyLinkedList myLinkedList = new MyLinkedList();
        assertTrue(myLinkedList.isEmpty());
    }

    @Test
    public void addAppendsNodeToEndOfList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(12);

    }

    @Test
    public void addFirstPrependsNodeToBeginningOfList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(10);
        assertEquals(10, myLinkedList.head.data);
        myLinkedList.addFirst(100);
        assertEquals(100, myLinkedList.head.data);
    }

    @Test
    public void addLastAppendsNodeToEndOfList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(12);
        myLinkedList.addLast(13);
        int expected = 13;
        int actual;

        while (myLinkedList.head.next != null) {
            myLinkedList.head = myLinkedList.head.next;
        }
        actual = myLinkedList.head.data;
        assertEquals(expected, actual);
    }

    @Test
    public void removeDeletesNodeFromList() {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.remove(2);
        assertEquals(3, myLinkedList.head.next.data);
    }
}
