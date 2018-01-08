/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtpractice;

/**
 *
 * @author pooja
 */
public class DoublyLinkedList {
    public Node head;
    
    public Node getNewNode (int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.prev = null;
        newNode.next = null;
        return newNode;            
    }
    
    
    public void insertNode(int data)
    {
        Node newNode = getNewNode(data);
        if (head == null)
        {
            head =  newNode;
            return;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }
    
    public void reversePrintLinkedList()
    {
        Node current = head;
        while (current.next != null)
        {
            current = current.next;
        }
        
        System.out.println("Reverse");
        
        while( current != null)
        {
             System.out.println(current.data);
            current = current.prev;
        }
          System.out.println("\n");
    }
    
    public void displayList()
    {
        Node current = head;
        while (current != null)
        {
            System.out.println( current.data );
            current = current.next;
        }
            System.out.println();
    }
}
