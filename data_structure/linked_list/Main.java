package data_structure.linked_list;

public class Main {
    public static void main(String[] args){
        LinkedList array = new LinkedList();

        array.insertEnd(10);
        array.insertEnd(20);
        array.insertEnd(30);
        array.remove(10);
        array.insertEnd(40);
        array.insertEnd(50);

        array.printAll();
    }
}
