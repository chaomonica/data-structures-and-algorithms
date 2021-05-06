package data.structures.and.algorithms;

public class MyStack {
    private SNode head;

    private static class SNode{
        private int data;
        private SNode next;

        private SNode(int data){
            this.data = data;
        }
    }


    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }
        else {return false;}
    }
}
