/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode s=head;
        ListNode f=head;

        while(f!=null && f.next!=null){
            s=s.next;
            f=f.next.next;
            if(s==f){ //1st time, for detecting a cycle
                s=head;
                while(s!=f){ //2nd time, for detecting starting node of cycle
                    s=s.next;
                    f=f.next;
                }
                return s;
            }
        }
        return null;
    }
}