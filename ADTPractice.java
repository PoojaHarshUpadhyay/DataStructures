/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adtpractice;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author pooja
 */
public class ADTPractice {

    /**
     * This is main class
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        DoublyLinkedList sll = new DoublyLinkedList();
       // sll.insertFirstLinkedList(1);
       // sll.insertFirstLinkedList(2);
       // sll.insertFirstLinkedList(3);
       // sll.insertLastLinkedList(4);
       // sll.displayList();
        sll.insertNode(1);
        sll.insertNode(11);
        sll.insertNode(122);
        sll.insertNode(1333);
        sll.reversePrintLinkedList();
       // sll.insertNPositionLL(4, 1);
       // sll.insertNPositionLL(5, 2);
        
        sll.displayList();
    
    }
    
   
}
