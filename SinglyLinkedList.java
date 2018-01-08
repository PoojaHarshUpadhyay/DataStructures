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
public class SinglyLinkedList {
   public static Node first;
    
    public boolean isEmpty()
    {
        return first == null;
    }
         
    public void insertFirstLinkedList(int data)
    {
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;
    }
    
    public void insertNPositionLL(int data, int n)
    {
        Node temp1 = new Node();
        if (n == 1)
        {
            temp1.data = data;
            temp1.next = first;
            first = temp1;
        }
        else
        {
            Node temp2 = first;
            for(int i = 0; i <  n-2; i++)
            {
                temp2 = temp2.next;
            }
            temp2.data = data;
            temp1.next = temp2.next;
            temp2.next = temp1;
        }
    }
    
    public void insertLastLinkedList(int data)
    {
       Node current = first;
       while(current.next != null)
       {
           current = current.next;
       }
       Node lastData = new Node();
       lastData.data = data;
       current.next = lastData;
    }
    
    public void deleteLinkedList()
    {
        Node temp = first;
        first = first.next;
    }
    
    public void displayList()
    {
        System.out.println("First ----> Last");
        
         Node currentNode = first;
         while (currentNode != null)
         {
             currentNode.displayNode();
             currentNode = currentNode.next;
         }
         
          System.out.println();
    }
}
