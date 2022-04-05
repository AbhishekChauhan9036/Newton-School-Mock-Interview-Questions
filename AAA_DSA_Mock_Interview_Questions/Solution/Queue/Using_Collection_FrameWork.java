/*
FIFO
The time complexity of enqueue(), dequeue(), peek(), isEmpty() and size() functions is constant, i.e., O(1).*/

import java.util.LinkedList;
import java.util.Queue;
 
class Main
{
    public static void main(String[] args)
    {
        Queue<String> queue = new LinkedList<String>();
 
        queue.add("A");   
        queue.add("B");     
        queue.add("C"); 
        queue.add("D");    
 

        System.out.println("The front element is " + queue.peek());
 
        queue.remove();  
        queue.remove();   
 

        System.out.println("The front element is " + queue.peek());
        System.out.println("The queue size is " + queue.size());

        if (queue.isEmpty()) {
            System.out.println("The queue is empty");
        }
        else {
            System.out.println("The queue is not empty");
        }
    }
}