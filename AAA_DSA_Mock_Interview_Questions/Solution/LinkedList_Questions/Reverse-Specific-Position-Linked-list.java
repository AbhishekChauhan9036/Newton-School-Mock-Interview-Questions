import java.util.*;
class Node
{
    int data;
    Node next;
 
    Node(int data, Node next)
    {
        this.data = data;
        this.next = next;
    }
}
 
class Main
{
    public static void printList(String msg, Node head)
    {
        System.out.print(msg);
 
        Node ptr = head;
        while (ptr != null)
        {
            System.out.print(ptr.data + " —> ");
            ptr = ptr.next;
        }
 
        System.out.println("null");
    }
 
    public static Node reverse(Node head, int m, int n)
    {
        if (m > n) {
            return head;
        }
 
        Node prev = null;
        Node curr = head;
 
        for (int i = 1; curr != null && i < m; i++)
        {
            prev = curr;
            curr = curr.next;
        }
 
 
        Node start = curr;
        Node end = null;
 
        for (int i = 1; curr != null && i <= n - m + 1; i++)
        {
           
            Node next = curr.next;
            curr.next = end;
            end = curr;
 
            curr = next;
        }
 
        if (start != null)
        {
            start.next = curr;
            if (prev != null) {
                prev.next = end;
            }
            else {
                head = end;    
            }
        }
 
        return head;
    }
 
    public static void main(String[] args)
    {
        int m = 2, n = 5;
 
        Node head = null;
        for (int i = 7; i >= 1; i--) {
            head = new Node(i, head);
        }
 
        printList("Original linked list: ", head);
        head = reverse(head, m, n);
        printList("Reversed linked list: ", head);
    }
}