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
public class Stack {
    private int maxSize;
    private String[] stackArray;
    private int top;
    
   
    public Stack(int size)
    {
      this.maxSize = size;
      this.stackArray = new String[maxSize];
      this.top = -1;
    }
    
    public String push(String i)
    {
        top++;
        return stackArray[top] = i;
    }
    
    public String pop ()
    {
        int old = top;
        top--;
       return stackArray[old];
    }
    
    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
     public boolean isFull()
    {
        if (maxSize -1 == top)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
