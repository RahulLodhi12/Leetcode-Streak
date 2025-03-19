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
    public int length(ListNode head){
        ListNode p=head;
        int cnt=0;

        while(p!=null){
            cnt++;
            p=p.next;
        }
        return cnt;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null) return null;
        if(n==length(head)) return head.next;

        int cnt=0;

        ListNode p = head;
        int l=length(head)-n; //idx

        while(cnt<l-1){
            cnt++;
            p=p.next;
        }

        p.next = p.next.next;

        return head;
    }
}