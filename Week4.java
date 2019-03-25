/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week4;

/**
 *
 * @author xdw0537
 */
public class Week4 
{
    public static void main(String[] args)
    {
        ArrayQueue<String> line = new ArrayQueue<String>();
        
        line.enqueue("Ad");
        line.enqueue("Bd");
        line.enqueue("Hd");
        System.out.println(line.toString());
        line.enqueue("NN");
        line.enqueue("Z");
        System.out.println(line.toString());
        line.enqueue("GG");
        
        System.out.println(line.dequeue());
        System.out.println(line.toString());
        System.out.println(line.dequeue());
        line.enqueue("dd");
        System.out.println(line.toString());
        System.out.println(line.dequeue());
        line.enqueue("HH");
        System.out.println(line.toString());
        
    }
    
    
}
