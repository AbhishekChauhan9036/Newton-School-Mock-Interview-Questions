import java.util.*;
class Node{
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
	 Node tail;
	
   static boolean isPalindrome(Node head) 
   {
       Node slow=head;
       Node fast=head;
       while(fast!=null &&fast.next!=null){
           slow=slow.next;
           fast=fast.next.next;
       }
        
     Node re=rev(slow,null);
     while(re!=null){
         if(head.data!=re.data){
             return false;
         }
         re=re.next;
         head=head.next;
     }
       return true;
   }    
   
   public static Node rev(Node head,Node prev){
       if(head==null){
           return prev;
       }
       Node temp=head.next;
       head.next=prev;
       return rev(temp,head);
       
   }
void printList(Node head)
    {
        Node temp = head;
        while (temp != null)
        {
           System.out.print(temp.data+" ");
           temp = temp.next;
        }  
        System.out.println();
}
	
    public void addToTheLast(Node node) 
	{

		if (head == null) 
		{
			head = node;
			tail = node;
		} else 
		{
		    tail.next = node;
		    tail = node;
		}
    }
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
        {
			int n = sc.nextInt();
			Main llist = new Main();
			int a1=sc.nextInt();
			Node head= new Node(a1);
            Node tail = head;
            for (int i = 1; i < n; i++) 
			{
				int a = sc.nextInt(); 
			    tail.next = new Node(a);
			    tail = tail.next;
			}
			
			if(isPalindrome(head) == true)
			    System.out.println("It is Palindrome");
		    else
			    System.out.println("It is Not Palindrome");
		}	
}
}