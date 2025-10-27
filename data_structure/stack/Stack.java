package data_structure.stack;

public class Stack  {
    private Node head;

    public Stack(){
        this.head = null;
    }

    public void push(int data){
        Node newNode = new Node(data);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public int pop(){
        if (this.head == null){
            return 0;
        }
        int data = this.head.getData();
        this.head = this.head.getNext();
        return data;
    }

    public boolean isEmpty(){
        if (this.head == null){
            return true;
        }else {
            return false;
        }
    }

    public int size(){
        int size = 0;
        Node current = this.head;
        while (current != null){
            size++;
            current = current.getNext();
        }
        return size;
    }

    public void printAll(){
        Node current = this.head;
        while (current != null){
            System.out.print(current.getData() + " -> ");
            current = current.getNext();
        }
        System.out.print("null");
    }
}
