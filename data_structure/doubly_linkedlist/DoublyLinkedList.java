package data_structure.doubly_linkedlist;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList(){
        this.head = null;
        this.tail = null;
    }

    public void insertAtBeginnig(int data){
        Node newNode = new Node(data);
        if (this.head == null){
            this.head = this.tail = newNode;
        }

        newNode.next = this.head;
        this.head.prev = newNode;
        this.head = newNode;

    }
}
