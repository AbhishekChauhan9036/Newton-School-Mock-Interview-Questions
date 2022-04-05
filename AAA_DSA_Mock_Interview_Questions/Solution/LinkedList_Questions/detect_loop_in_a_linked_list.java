// Java program to detect loop in a linked list
import java.util.*;
class Main{
static class Node
{
	int data;
	Node next;
	int flag;
};

static Node push(Node head_ref, int new_data)
{
	Node new_node = new Node();
	new_node.data = new_data;
	new_node.flag = 0;
	new_node.next = head_ref;
	head_ref = new_node;
	return head_ref;
}

static boolean detectLoop(Node h)
{
	while (h != null)
	{
		if (h.flag == 1)
			return true;

		h.flag = 1;

		h = h.next;
	}
	return false;
}

public static void main(String[] args)
{
	
	Node head = null;

	head = push(head, 20);
	head = push(head, 4);
	head = push(head, 15);
	head = push(head, 10);
	head.next.next.next.next = head;

	if (detectLoop(head))
		System.out.print("Loop found");
	else
		System.out.print("No Loop");
}
}