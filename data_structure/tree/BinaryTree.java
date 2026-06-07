package data_structure.tree;

public class BinaryTree {
    private Node root;

    public BinaryTree(){
        root = null;
    }

    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public void inOrder(Node node){
        if (node != null){
            inOrder(node.getLeft());
            System.out.print(node.getValue() + " ");
            inOrder(node.getRight());
        }
    }

    public void preOrder(Node node){
        if (node != null){
            System.out.print(node.getValue() + " ");
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    public void posOrder(Node node){
        if (node != null){
            posOrder(node.getLeft());
            posOrder(node.getRight());
            System.out.print(node.getValue() + " ");
        }
    }

    // ===== TESTE =====
    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        Node root = new Node(10);
        root.setLeft(new Node(5));
        root.setRight(new Node(15));

        root.getLeft().setLeft(new Node(3));
        root.getLeft().setRight(new Node(7));

        root.getRight().setLeft(new Node(12));
        root.getRight().setRight(new Node(20));

        tree.setRoot(root);

        System.out.println("InOrder:");
        tree.inOrder(tree.getRoot());

        System.out.println("\n\nPreOrder:");
        tree.preOrder(tree.getRoot());

        System.out.println("\n\nPostOrder:");
        tree.posOrder(tree.getRoot());
    }
}