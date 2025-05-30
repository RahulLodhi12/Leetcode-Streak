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
    public ListNode deleteMiddle(ListNode head) {
        if(head==null || head.next==null) return null;

        ListNode f = head;
        ListNode s = head;

        ListNode prev=null;

        while(f!=null && f.next!=null){
            prev=s;
            s=s.next;
            f=f.next.next;
        }

        prev.next = s.next;
        s.next=null;

        System.out.println(s.val);
        System.out.println(prev.val);

        return head;
    }
}