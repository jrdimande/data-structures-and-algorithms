package data_structure.stack;

public class TestStack {
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.pop();
        s.size();
        s.printAll();
    }
}
