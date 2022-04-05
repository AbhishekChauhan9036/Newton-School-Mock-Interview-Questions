import java.util.Scanner;
class Node 
{ 
    int data; 
    Node next; 
    Node(int d) 
    { 
        data = d; 
        next = null; 
    } 
}  
public class Main{ 
    Node head; 
    public void push(int new_data) 
    { 
        Node new_node = new Node(new_data); 
        new_node.next = head; 
        head = new_node; 
    } 

    public boolean search(Node head, int x) 
    { 
        Node current = head;   
        while (current != null) 
        { 
            if (current.data == x) 
                return true;   
            current = current.next; 
        } 
        return false;   
    } 
    public static void main(String args[]) 
    { 
        Main llist = new Main(); 
        llist.push(10); 
        llist.push(30); 
        llist.push(11); 
        llist.push(21); 
        llist.push(14); 
  
        if (llist.search(llist.head, 21)) 
            System.out.println("Yes"); 
        else
            System.out.println("No"); 
    } 
}