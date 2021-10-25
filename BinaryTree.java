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
        obj.traverse(node);
    }

    void traverse(Node node) {
        if (node != null) {
            System.out.println(node.data);
        }
        if(node.left != null) {
            traverse(node.left);
        }
        if(node.right != null) {
            traverse(node.right);
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
