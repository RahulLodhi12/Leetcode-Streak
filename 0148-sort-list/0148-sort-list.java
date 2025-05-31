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
    public ListNode mergeList(ListNode l, ListNode r){
        ListNode dummy = new ListNode(-1);
        ListNode ptr = dummy;

        while(l!=null && r!=null){
            if(r.val<=l.val){
                ptr.next = r;
                r=r.next;
                ptr=ptr.next;
            }
            else{
                ptr.next = l;
                l=l.next;
                ptr=ptr.next;
            }
        }

        while(l!=null){
            ptr.next=l;
            l=l.next;
            ptr=ptr.next;
        }

        while(r!=null){
            ptr.next=r;
            r=r.next;
            ptr=ptr.next;
        }

        return dummy.next;
    }
    public ListNode divide(ListNode head){
        //base case
        if(head==null || head.next==null) return head;

        //find mid
        ListNode s=head;
        ListNode f=head.next;
        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
        }

        ListNode left = head;
        ListNode right = s.next; 
        s.next=null;

        left = divide(left);
        right = divide(right);

        return mergeList(left,right);
    }
    public ListNode sortList(ListNode head) {
        if(head==null) return head;

        return divide(head);
    }
}