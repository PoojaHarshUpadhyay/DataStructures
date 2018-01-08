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
public class Queue {
    private int maxSize;
    private long[] stackArray;
    private int front;
    private int back;
    private int nItems;
    
    
    public Queue(int size)
    {
      this.maxSize = size;
      this.stackArray = new long[maxSize];
      this.front = 0;
      this.back = -1;
      this.nItems = 0;
    }
    
    public void enqueue(long i)
    {
        back++;
        stackArray[back] = i;
        nItems++;
    }
    
    public  void view ()
    {
        for (int i = 0; i<= stackArray.length; i++)
        {
            System.out.println( stackArray[i] + " ");
        }
    }
    
    public long dequeue ()
    {
       long temp = stackArray[front];
       front++;
       if (front == maxSize)
       {
           front = 0;
       }
       nItems--;
       return  temp;
    }
    
    public long peekFront()
    {
        return stackArray[front];
    }
    
     public boolean isFull()
    {
        if (nItems == maxSize)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
      public boolean isEmpty()
    {
        if (nItems == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
