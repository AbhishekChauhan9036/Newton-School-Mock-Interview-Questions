import java.util.*;
class Node{
    int data;       
    Node next;   
}
 
class Stack
{
    private Node top;
    private int nodesCount;
 
    public Stack() {
        this.top = null;
        this.nodesCount = 0;
    }
 
   
    public void push(int x)      
    {
 
        Node node = new Node();
        if (node == null)
        {
            System.out.println("Heap Overflow");
            return;
        }
 
        System.out.println("Inserting " + x);
 
        node.data = x;
        node.next = top;
        top = node;
 
        this.nodesCount += 1;
    }
    public boolean isEmpty() {
        return top == null;
    }
    public int peek()
    {
        if (isEmpty()) {
            System.out.println("The stack is empty");
            System.exit(-1);
        }
        return top.data;
    }
 
  
    public int pop()   
    {
        if (isEmpty())
        {
            System.out.println("Stack Underflow");
            System.exit(-1);
        }
 
        int top = peek();
 
        System.out.println("Removing " + top);
        this.nodesCount -= 1;
 
        this.top = (this.top).next;
 
        return top;
    }
 
    public int size() {
        return this.nodesCount;
    }
}
 
class Main
{
    public static void main(String[] args)
    {
        Stack stack = new Stack();
 
        stack.push(1);
        stack.push(2);
 
        System.out.println("The top element is " + stack.peek());
 
        stack.pop();
        stack.pop();
 
        if (stack.isEmpty()) {
            System.out.println("The stack is empty");
        }
        else {
            System.out.println("The stack is not empty");
        }
    }
}