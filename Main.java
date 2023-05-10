package week8;

public class Main {
    public static void main(String[] args) {
        BST BinarySearchTree = new BST();

        //              50
        //           /     \
        //          4      72
        //         /  \   /  \
        //        1   30 60  83

        BinarySearchTree.insert(50);
        BinarySearchTree.insert(4);
        BinarySearchTree.insert(72);
        BinarySearchTree.insert(1);
        BinarySearchTree.insert(39);
        BinarySearchTree.insert(60);
        BinarySearchTree.insert(83);

        BinarySearchTree.printPreOrder();   // 50 4 1 30 72 60 83

        System.out.println();
        Solution solution = new Solution();
        System.out.println("The number of items in the binary tree: " + solution.countElement(BinarySearchTree));
        System.out.println("The sum of all elements in the binary tree: " + solution.sumElements(BinarySearchTree));
    }
}

class Solution {
    //function to count the number of items in a binary tree
    private int countElement(Node root) {
        if (root == null) {
            return 0;
        }
        return 1 + countElement(root.left) + countElement(root.right);
    }
    int countElement(BT BinaryTree) {
        return countElement(BinaryTree.root);
    }

    //function to return the sum of all the keys in a binary tree
    private int sumElements(Node root) {
        if (root == null) {
            return 0;
        }
        return root.key + sumElements(root.left) + sumElements(root.right);
    }
    int sumElements(BT BinaryTree) {
        return sumElements(BinaryTree.root);
    }
}