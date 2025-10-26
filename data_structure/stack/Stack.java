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

    public void isEmpty(){
        if (this.head == null){
            System.out.printf("empty");
        }else {
            System.out.printf("not empty");
        }
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
