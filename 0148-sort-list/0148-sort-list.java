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
    public ListNode sortList(ListNode head) {
        //Brute Force - T.C: O(n)+O(n)+O(nlog)(sorting) , S.C: O(n) [List]
        List<Integer> lst = new ArrayList<>();

        ListNode p = head;

        while(p!=null){
            lst.add(p.val);
            p=p.next;
        }

        Collections.sort(lst);

        ListNode t = head;

        int k=0;
        while(t!=null){
            t.val = lst.get(k++);
            t=t.next;
        }

        return head;

    }
}