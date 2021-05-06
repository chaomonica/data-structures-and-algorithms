package data.structures.and.algorithms;

public class MyStack {
    private SNode top;

    private static class SNode{
        private int data;
        private SNode next;

        private SNode(int data){
            this.data = data;
        }
    }


    public boolean isEmpty() {
        if (this.top == null) {
            return true;
        }
        else {return false;}
    }

    public void push(int data){
        SNode newNode = new SNode(data);

        newNode.next = top;
        top = newNode;
    }

    public int peek() {
        return this.top.data;
    }
}
