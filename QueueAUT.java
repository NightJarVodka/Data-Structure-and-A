/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

import java.util.NoSuchElementException;

/**
 *
 * @author xdw0537
 */
public interface QueueAUT<E>
{
    public void enqueue(E element);
    public E dequeue() throws NoSuchElementException;
    public E first() throws NoSuchElementException;
    public boolean isEmpty();
    public int size();
}
