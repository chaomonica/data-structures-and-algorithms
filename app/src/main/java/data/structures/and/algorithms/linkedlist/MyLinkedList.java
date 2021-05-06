package data.structures.and.algorithms.linkedlist;

public class MyLinkedList {
    public MyNode head;

    public void add(int data) {
        MyNode node = new MyNode(data);

        if (head == null) {
            head = node;
        } else {
            MyNode pointer = head;
            while (pointer.next != null) {
                pointer = head.next;
            }
            pointer.next = node;
        }
    }

    public boolean isEmpty(){
        return head == null;
    }

    public void addFirst(int data) {
        MyNode node = new MyNode(data);
        node.next = head;
        head = node;
    }

    public void addLast(int data) {
        add(data);
    }

    public void remove(int data) {
        if (head == null) return;

        if (head.data == data) {
            head = head.next;
            return;
        }

        MyNode pointer = head;
        while (pointer.next != null) {
            if (pointer.next.data == data) {
                pointer.next = pointer.next.next;
                return;
            }
            pointer = pointer.next;
        }
    }
}

