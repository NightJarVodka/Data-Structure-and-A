/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Set;

/**
 *
 * @author xdw0537
 */
public class ArrayQueue<E> implements QueueAUT<E>
{
    private final int INITIAL_CAPACITY =5;
    protected int numElements;
    private int head;
    private int tail;
    protected E[] elements;
    
    public ArrayQueue()
    {
        numElements = 0;
        elements = (E[])(new Object[INITIAL_CAPACITY]);
        this.head = 0;
        this.tail = 0;
    }
    
    public ArrayQueue(Collection<? extends E> c)
    {
        this();
        for (E elements : c)
        {
            enqueue(elements);
        }
    }
    
    //add new elements
    public void enqueue(E element)
    {
        //check whether is empty
        if(isEmpty())
        {
            elements[0] = element;
            numElements++;
        }
        else
        {
            if(numElements >=elements.length)
            {
                expandCapacity();
            }
            
            if(tail == elements.length -1)
            {
                numElements = 0;
            } 
            elements[numElements] = element;
            //1
            numElements++;
        }
    }
    
    //remove elements
    public E dequeue()throws NoSuchElementException
    {
        // heads add
        if(numElements > 0)
        {
            System.out.print("Removing: ");
            E topElement = elements[head];
            elements[head]=null;
            head++;
//            numElements--;
            return topElement;
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    
    public E first()throws NoSuchElementException
    {
        if(numElements > 0)
        {
            //weisha zhi jian 1 a 
//            return elements[numElements-1];
            return elements[head];
        }
        else
        {
            throw new NoSuchElementException();
        }
    }
    
    public boolean isEmpty()
    {
        return (numElements == 0);
    }
    
    public int size()
    {
        return numElements;
    }
    
    public String toString()
    {
        String output = "[";
        for(int i = 0 ; i < elements.length ; ++i)
        {
            output += elements[i];
            if(i>=0 && i< elements.length -1)
            {
                output += ",";
            }
            
        }
        output += "]";
        return output;
    }
    
    private void expandCapacity()
    {
        E[] largerArray = (E[])(new Object [elements.length*2]);
        
        for(int i = 0; i < numElements ; ++i)
        {
            largerArray[i] = elements[i];
        }
        elements = largerArray;
    }
    
//    public static void main(String[] args) 
//    {
//        int numElements =1000;
//        
//      
//        
////        StackAUT<Integer> stackGood = new ArrayStack<Integer>();
////        System.out.println("PUSHING ON" + numElements + " Onto Noriaml Stack");
//        
//    }

   

    
}
