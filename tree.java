import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class Main {

  public static void main(String[] args) {


    Node n;

    n = new Node(10);

    n.insert(5);
    n.insert(15);
    n.insert(8);


    boolean result = n.contain(2);
    System.out.println(result);
    boolean res = n.contain(1);
    System.out.println(res);


    n.traverse();

  }
}


class Node {
  int data;
  Node left, right;

  public Node(int data) {
    this.data = data;
  }

  void insert(int value) {
    if (value < data) {
      if (left == null) {
        left = new Node(value);
      } else {
        left.insert(value);
      }
    }
    if (value > data) {
      if (right == null) {
        right = new Node(value);
      } else {
        right.insert(value);
      }
    }
    data = value;
  }

  boolean contain(int value) {
    if (value == data) {
      return true;
    } else if (value < data) {
      if (left == null) {
        return false;
      }
      return left.contain(value);
    } else {
      if (right == null) {
        return false;
      }
      return right.contain(value);
    }
  }

  void traverse() {
    if (this.left != null) {
      this.left.traverse();
    }
    System.out.println(this.data);
    if (this.right != null) {
      this.right.traverse();
    }
  }

}
