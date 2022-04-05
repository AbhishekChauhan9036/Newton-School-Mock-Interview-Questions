/*
Input.................
5
9 0
5 1 
6 1 
2 0 
5 0

Output................
5 2 9 5 6 
*/
import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    
    Node(int x){
        data = x;
        next = null;
    }
}
class Main{
	static Node insertAtBeginning(Node head, int x)
    {

        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head;
    }
    static Node insertAtEnd(Node head, int x)
    {
        Node temp = new Node(x);
        
        if (head == null) {
            return temp;
        }
        
        Node curr = head;
        
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = temp;
        
        return head;
    }
    static void printList(Node node) 
    { 
        while (node != null) 
        { 
            System.out.print(node.data + " "); 
            node = node.next; 
        } 
        System.out.println(); 
    }
    public static void main(String args[]) throws IOException { 
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            Node head = null;
            for(int i=0; i<n; i++)
            {
                int value = sc.nextInt();
                int indicator = sc.nextInt();

                if(indicator == 0)
                    head = insertAtBeginning(head, value);
                else
                    head = insertAtEnd(head, value);
            }
            printList(head); 
    } 
}