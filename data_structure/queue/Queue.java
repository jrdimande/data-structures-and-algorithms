package data_structure.queue;

public class Queue {
    private Node head;

    public Queue(){
        this.head = null;
    }

    public void enqueue(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }

        Node current = head;
        while (current.getNext() != null){
            current = current.getNext();
        }
        current.setNext(newNode);
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("empty!");
            return;
        }
        head = head.getNext();
    }

    public Node peek(){
        return this.head;
    }


    public void printAll(){
        Node current = this.head;
        while (current != null){
            System.out.print(current.getData() + " ->  ");
            current = current.getNext();
        }
        System.out.print("null");
    }

}
