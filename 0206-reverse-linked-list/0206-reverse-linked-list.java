/**
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
    public ListNode reverseList(ListNode head) {
        ListNode p = head; //main pointer
        ListNode temp=head; //store location of next node
        ListNode prev=null; //indicates prev. node

        while(p!=null){
            temp=p.next;
            p.next=prev;
            prev=p;
            p=temp;
        }

        return prev;
    }
}