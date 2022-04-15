/**


https://leetcode.com/problems/reverse-linked-list-ii/



 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
       return reverseBetween(head,left,right,head,null);
    }
    
     public ListNode reverseBetween(ListNode head, int left, int right,ListNode newEnd,ListNode newHead) {
        if(left==right+1){
            newEnd.next = head;
            return newHead;
        }
        if(left>1){
            ListNode prev = head;
            prev.next  = reverseBetween(head.next,left-1,right-1,head.next,null);
            return prev;
        }else{
           ListNode next = head.next;
            head.next = newHead;
            return reverseBetween(next,left,right-1,newEnd,head);
        }
    }
}