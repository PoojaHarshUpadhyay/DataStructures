import java.time.ZonedDateTime;
import java.util.*;

public class Hello {
    /**
     * key, value
     *
     * @param args
     */

    public static void main(String[] args) {
        Hello obj = new Hello();

        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        System.out.println();
        obj.preOrder(node);
        System.out.println();
        obj.inOrder(node);
        System.out.println();
        obj.postOrder(node);
        System.out.println();

    }

    void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.data);
        }
        if (node.left != null) {
            preOrder(node.left);
        }
        if (node.right != null) {
            preOrder(node.right);
        }
    }

    void inOrder(Node node) {
        if (node.left != null) {
            inOrder(node.left);
        }
        if (node != null) {
            System.out.println(node.data);
        }
        if (node.right != null) {
            inOrder(node.right);
        }
    }

    void postOrder(Node node) {

        if (node.left != null) {
            postOrder(node.left);
        }
        if (node.right != null) {
            postOrder(node.right);
        }
        if (node != null) {
            System.out.println(node.data);
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int val) {
        this.data = val;
        this.left = null;
        this.right = null;
    }
}
