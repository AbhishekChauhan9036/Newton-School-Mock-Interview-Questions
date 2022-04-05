/*
Input.................
4
3 
1 2 3 
2
4 5 
2 
5 6 
2 
7 8

Output................
1 2 3 4 5 5 6 7 8 
*/
import java.util.*;
class Node{
    int data;
    Node next;
    
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Main{
    public static class Triplet{
        Node node;
        int i;
        Triplet(Node node, int i){
            this.node = node;
            this.i = i;
        }
    }

static Node mergeKList(Node[]arr,int k){

        PriorityQueue<Triplet> pq = new PriorityQueue<>((a,b)->a.node.data-b.node.data);
        for(int i=0;i<k;i++) if(arr[i]!=null) pq.offer(new Triplet(arr[i],i));
        Node ans = null;
        Node ptr = null;
        while(!pq.isEmpty()){
            Triplet curr = pq.poll();
            if(ans==null){
                ans = curr.node;
                ptr = curr.node;
            }else{
                ptr.next = curr.node;
                ptr = ptr.next;
            }
            curr.node = curr.node.next;
            if(curr.node!=null) pq.offer(curr);
        }
        return ans;
    }
    public static void printList(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
    
public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            
            Node []a = new Node[N];
            
            for(int i = 0; i < N; i++)
            {
                int n = sc.nextInt();
                
                Node head = new Node(sc.nextInt());
                Node tail = head;
                
                for(int j=0; j<n-1; j++)
                {
                    tail.next = new Node(sc.nextInt());
                    tail = tail.next;
                }
                
                a[i] = head;
            }
             
            Node res = mergeKList(a,N);
            if(res!=null)
                printList(res);
            System.out.println();
    }
}