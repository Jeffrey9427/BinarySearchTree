package week8;

class Node {
    int key;
    Node left, right;
    public Node(int key) {
        this.key = key;
        left = right = null;
    }
}

class BT {
    Node root;
    public BT () {
        root = null;
    }

    public void printPreOrder() {
        printPreOrder(root);
    }
    public void printPreOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.key + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    };
}

public class BST extends BT {
    public BST() {
        super();
    }

    public void insert(int key) {
        root = insert(root, key);
    }
    public Node insert(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }

        if (data < root.key) {
            root.left = insert(root.left, data);
        } else if (data > root.key) {
            root.right = insert(root.right, data);
        }
        return root;
    }
}
