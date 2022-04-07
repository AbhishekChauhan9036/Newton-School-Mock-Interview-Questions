import java.util.Scanner;
class Node 
{ 
    int data; 
    Node next;
    Node(){};

    Node(int data) 
    { 
        this.data = data; 
        this.next = next;
    } 

    Node(int data, Node next)
    { 
        this.data = data; 
        this.next = next;
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


//addFirst.................................................................................................................
  public void addFirst(int data) {
       Node newNode = new Node(data);
       newNode.next = head;
       head = newNode;
   }

//add Last..................................................................................................................
   public void addLast(int data) {
       Node newNode = new Node(data);
 
       if(head == null) {
           head = newNode;
           return;
       }
 
       Node lastNode = head;
       while(lastNode.next != null) {
           lastNode = lastNode.next;
       }
       lastNode.next = newNode;
   }

//Remove First ...............................................................................................................
  public void removeFirst() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
 
       head = this.head.next;
   }

//Remove Last.........................................................................................................
 public void removeLast() {
       if(head == null) {
           System.out.println("Empty List, nothing to delete");
           return;
       }
 
       if(head.next == null) {
           head = null;
           return;
       }
 
       Node currNode = head;
       Node lastNode = head.next;
           while(lastNode.next != null) {
           currNode = currNode.next;
           lastNode = lastNode.next;
       }
 
       currNode.next = null;
   }


// Search a element a linked list...............................................................................................
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


    
// check Palindroeme or Not.................................................................................................
        public boolean isPalindrome(Node head) {
        
        // reverse
        Node head2 = head;
        Node back = new Node(head2.data);        
        while (head2.next != null){
            back = new Node(head2.next.data, back);
            head2 = head2.next;
        }
        
        //compare
        do{
            if (head.data != back.data) return false;
            head = head.next;
            back = back.next;
        } while(head != null);
        return true;
    }


// Printing the List.............................................................................................................
   public void printList() {
       Node currNode = head;
 
       while(currNode != null) {
           System.out.print(currNode.data+" -> ");
           currNode = currNode.next;
       }
 
       System.out.println("null");
    }


// Reverse a Linked List......................................................................................................
public Node reverseListRecursive(Node head) {
       if(head == null || head.next == null) {
           return head;
       }
 
       Node newHead = reverseListRecursive(head.next);
      
       head.next.next = head;
       head.next = null;
       return newHead;
   }

  
    public static void main(String args[]) 
    { 
        Main llist = new Main(); 
        llist.push(1); 
        llist.push(2); 
        llist.push(3); 
        llist.push(2); 
        llist.push(1); 
  
        // if (llist.search(llist.head, 21)) 
        //     System.out.println("Yes"); 
        // else
        //     System.out.println("No"); 



         if (llist.isPalindrome(llist.head)) 
            System.out.println("Yes"); 
        else
            System.out.println("No");


        
    } 
}