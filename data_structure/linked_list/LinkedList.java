package data_structure.linked_list;

public class LinkedList {
    Node head;

    public LinkedList(){
        this.head = null;
    }

    public void insertStart(int data){
        Node newNode = new Node(data);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertEnd(int data){
        Node newNode = new Node(data);

        if (this.head == null){
            this.head = newNode;
            return;
        }

        Node current = this.head;
        while(current.next != null){
            current = current.next;
        }

        current.next = newNode;

    }

    public void printAll(){
        Node current = this.head;

        while (current != null){
            System.out.println(current.data);
            current = current.next;
        }
    }

    public void remove(int data){
        if (head == null){
            return;}
        if (head.data == data){
            head = head.next;
        }
        Node current = this.head;


        while (current.next != null && current.next.data != data){
            current = current.next;
        }

        if (current.next != null){
            current.next = current.next.next;
        }






    }
}
