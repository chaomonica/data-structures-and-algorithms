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

        newNode.next = this.top;
        this.top = newNode;
    }

    public int peek() {
        return this.top.data;
    }

    public int pop(){
        int data = this.top.data;
        this.top = top.next;
        return data;
    }
}
