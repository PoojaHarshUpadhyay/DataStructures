import java.util.*;

public class Hello {
    public static void main(String[] args) {
        Hello obj = new Hello();
        obj.addNode(10);
        obj.addNode(6);
        obj.addNode(15);
    }
    Node root;
    public void addNode(int val) {
        Node newNode = new Node(val);
        if(root == null) {
            root = newNode;
        } else {
            Node current_node = root;

            while (true) {
                //go left
                if(val <= current_node.value) {
                    if(current_node.left != null) {
                        current_node = current_node.left;
                    } else {
                        current_node.left = newNode;
                        break;
                    }
                }
                // go right
                else {
                    if(current_node.right != null) {
                        current_node = current_node.right;
                    } else {
                        current_node.right = newNode;
                        break;
                    }
                }
            }
        }
    }
}

class Node {
    int value;
    Node left;
    Node right;

    public Node(int val) {
        this.value = val;
    }
}
