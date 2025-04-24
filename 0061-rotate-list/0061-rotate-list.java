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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return head;
        ListNode p = head;

        int n=1;
        while(p.next!=null){
            n++;
            p=p.next;
        }

        p.next=head;

        k=k%n;

        int t = n-k;

        while(t>0){
            p=p.next;
            t--;
        }

        head = p.next;
        p.next = null;

        return head;
    }
}