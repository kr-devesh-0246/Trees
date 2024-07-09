import java.util.Scanner;

public class BinaryTree {
    public BinaryTree() {

    }
    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    // for the binary tree, we have one root node
    private Node root;

    public void populate(Scanner sc) {
        // first do the root node
        System.out.println("Enter the root node");
        int value = sc.nextInt();
        root = new Node(value);
        // now recursively insert
        // for that a helper is employed
        populate(sc, root);
    }
    private void populate(Scanner sc, Node node) { // works as a helper
        System.out.println("Do you want to enter the left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left of " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter the right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right of " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }
    public void display(Node node) {
        if (node.left == null && node.right == null) {
            return ;
        }
        System.out.println(node.left);
        System.out.println(node.value);
        System.out.println(node.right);
    }
}
